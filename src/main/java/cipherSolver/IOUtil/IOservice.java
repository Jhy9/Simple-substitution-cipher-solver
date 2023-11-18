package cipherSolver.IOUtil;

import java.util.Scanner;
import java.util.ArrayList;

class IOservice{
    private String filename;

    public IOservice(String filename){
        this.filename = filename;
    }
    
    public ArrayList<String> readFile(String name){
        try{
            String path = "input/"+filename+".txt";
            Scanner fileReader = new Scanner(this.getClass().getResourceAsStream(path));
            ArrayList<String> wordsInFile = new ArrayList();
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] wordsLine = line.split(" ");
                for(String word:wordsLine){
                    wordsInFile.add(word);
                }
            }
            fileReader.close();
            return wordsInFile;
        } catch (Exception e){
            System.out.println(e);
            return null;
        }
    }

    public void solutionWriter(){

    }



}