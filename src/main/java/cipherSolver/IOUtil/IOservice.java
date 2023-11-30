package cipherSolver.IOUtil;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class IOservice{
    
    public ArrayList<String> readFile(String filename){
        try{
            Scanner fileReader = new Scanner(this.getClass().getResourceAsStream("/Input/"+filename));
            ArrayList<String> wordsInFile = new ArrayList();
            while(fileReader.hasNextLine()){
                String line = fileReader.nextLine();
                String[] wordsLine = line.split(" ");
                for(String word:wordsLine){
                    String simplified = textSimplifier(word);
                    if(simplified.length() > 0){
                        wordsInFile.add(simplified);
                    }
                }
            }
            fileReader.close();
            return wordsInFile;
        } catch (Exception e){
            System.out.println(e.toString());
            return null;
        }
    }

    public void solutionWriter(char[] solution, String filename){
        try{     
            Scanner reader = new Scanner(this.getClass().getResourceAsStream("/Input/"+filename));
            FileWriter fileWriter = new FileWriter("src/main/resources/Output/"+filename,false);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < line.length();i++){
                    char x = line.charAt(i);
                    int ascii = (int) x;
                    if(ascii >= 65 && ascii <= 90){
                        x = (char)(solution[ascii-(int)'A']-32);
                    }
                    if(ascii >= 97 && ascii <= 122){
                        x = (char)(solution[ascii-(int)'a']);
                    }
                    sb.append(x);
                }
                writer.write(sb.toString());
                writer.newLine();
            }
            writer.close();
            reader.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    private String textSimplifier(String s){
        StringBuilder simplified = new StringBuilder();
        String sLower = s.toLowerCase();
        for (int i = 0; i < sLower.length();i++){
            char character = sLower.charAt(i);
            if((int)character >= 97 && (int)character < 123){
                simplified.append(character);
            }
        }
        return simplified.toString();
    }
}