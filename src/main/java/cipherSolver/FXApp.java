package cipherSolver;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import CipherGenerator.CipherGenerator;
import cipherSolver.Algorithm.*;
import cipherSolver.IOUtil.*;
import cipherSolver.CipherGenerator.*;
import java.util.ArrayList;

public class FXApp extends Application{
    private TextField filename;
    private TextArea textOutput;
    private TextArea performanceData;

    @Override
    public void start(Stage stage){        
        textOutput= new TextArea();
        performanceData = new TextArea();
        filename = new TextField("testfile.txt");
        textOutput.setEditable(false);
        performanceData.setEditable(false);
        Button decipher = new Button("Decipher");

        decipher.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event){
                IOservice io = new IOservice();
                String fname = getFname();
                ArrayList<String> words = io.readFile(fname);
                if(words == null){
                    setPerformanceData("No file found.");
                } else{
                    SolverHandler solver = new SolverHandler();
                    char[] solution = solver.solveCipher(words);
                    String output = io.solutionWriter(solution, fname);
                    setOutput(output);
                    setPerformanceData(solver.getPerformanceData());
                }
            }

        });
        Button selectTest = new Button("Create testfile");
        selectTest.setOnAction(new EventHandler<ActionEvent>(){

            @Override
            public void handle(ActionEvent event){
                CipherGenerator generator = new CipherGenerator();
                String fname = getFname();
                if(generator.createCipher(fname) == false){
                    setPerformanceData("No file found.");
                } else{
                    setPerformanceData("Cipher created from file.");
                }
                
            }

        });
        VBox functions = new VBox();
        functions.getChildren().add(new Label("Filename:"));
        functions.getChildren().add(filename);
        functions.getChildren().add(decipher);
        functions.getChildren().add(selectTest);
        
        VBox consoledata = new VBox();
        consoledata.getChildren().add(new Label("Console:"));
        consoledata.getChildren().add(performanceData);
        VBox outputdata = new VBox();
        outputdata.getChildren().add(new Label("Output:"));
        outputdata.getChildren().add(textOutput);
        BorderPane border = new BorderPane();
        border.setCenter(consoledata);
        border.setRight(functions);
        border.setTop(outputdata);
        
        Scene s = new Scene(border,600,400, Color.BLACK);
        stage.setScene(s);
        stage.setTitle("Cipher solver");
        stage.setY(100);
        stage.setX(100);
        stage.show();
    }

    public String getFname(){
        return filename.getText();
    }
    public void setPerformanceData(String output){
        performanceData.setText(output);
    }
    public void setOutput(String output){
        textOutput.setText(output);
    }

    public static void main(String[] args){
        launch(args);
    }

}