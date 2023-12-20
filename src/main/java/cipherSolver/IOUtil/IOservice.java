package cipherSolver.IOUtil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 * Class for reading ciphered texts from file and writing answers into a file
 */

public class IOservice{
    
    /**
     * Reads ciphers from file
     * 
     * @param filename Filename as it is in input folder
     * @return Words that are in file as arraylist
     */
    public ArrayList<String> readFile(String filename){
        try{
            FileReader fileReader = new FileReader("src/main/resources/Input/"+filename);
            BufferedReader reader = new BufferedReader(fileReader);
            ArrayList<String> wordsInFile = new ArrayList();
            while(true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
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

    /**
     * Writes algorithm solution into a file
     * 
     * @param solution  Translating array for translating ciphered text 
     * @param filename Filename for output
     * @return Deciphered text for GUI
     */
    public String solutionWriter(char[] solution, String filename){
        try{
            FileReader fileReader = new FileReader("src/main/resources/Input/"+filename);
            BufferedReader reader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("src/main/resources/Output/"+filename,false);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            StringBuilder outputString = new StringBuilder();
            while(true){
                boolean lineChange = false;
                String line = reader.readLine();
                if(line == null){
                    break;
                }
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
                    if(sb.length() % 80 == 0 && sb.length() > 0){
                        lineChange = true;
                    }
                    if(lineChange == true && x == ' '){
                        outputString.append('\n');
                        lineChange = false; 
                    } else{
                        outputString.append(x);
                    }
                    
                }
                writer.write(sb.toString());
                writer.newLine();
                outputString.append('\n');
            }
            writer.close();
            reader.close();
            return outputString.toString();
        }catch(Exception e){
            System.out.println(e.toString());
            return "";
        }
    }
    /**
     * Strips strings from everything but letters and lowercases them
     * 
     * @param s String that we want to simplify
     * @return Simplified version of s
     */
    public String textSimplifier(String s){
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