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
            String path = "Input/"+this.filename+".txt";
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

    public void solutionWriter(char[] solution){
        try{
            Scanner reader = new Scanner(this.getClass().getResourceAsStream("Input/"+this.filename+".txt"));
            BufferedWriter writer = new BufferedWriter("Output/" + this.filename +".txt",false);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < line.length();i++){
                    char x = line.charAt(i);
                    int ascii = (int) x;
                    if(ascii >= 65 && ascii <= 90){
                        x = x+(solution[ascii-(int)'A']-ascii);
                    }
                    if(ascii >= 97 && ascii <= 122){
                        x = x+(solution[ascii-(int)'a']-ascii);
                    }
                    sb.append(x);
                }
                writer.write(sb.toString());
                writer.newLine();
        }
    }catch(Exception e){
        print(e);
    }
    }



}