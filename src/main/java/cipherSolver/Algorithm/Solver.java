package cipherSolver.Algorithm;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
public class Solver{
    private Node head;
    private int[] dictFrequencies;
    private int[] cipherFrequencies;

    public Solver(){
        this.head = new Node();
        this.dictFrequencies = new int[26];
        Arrays.fill(this.dictFrequencies,0);
        addDictionary();
    }
    
    private void addDictionary(){
        try{
            Scanner dictReader = new Scanner(this.getClass().getResourceAsStream("/dictionary.txt"));
            while(dictReader.hasNextLine()){
                String nextWord = dictReader.nextLine();
                for(int i = 0; i < nextWord.length();i++){
                    char x = nextWord.charAt(i);
                    this.dictFrequencies[(int)x - 97]++;
                }
                this.head.addWord(nextWord, 0);
            }
            dictReader.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }
    public void addCipher(ArrayList<String> words){
        this.cipherFrequencies = new int[26];
        Arrays.fill(this.cipherFrequencies, 0);
        for(String s:words){
            String trimmedWord = textSimplifier(s);
            for(int i = 0; i < trimmedWord.length();i++){
                char x = trimmedWord.charAt(i);
                this.cipherFrequencies[(int)x -97]++;
            }            
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
    public void printDictionaryFrequencies(){
        for(int i = 0; i < dictFrequencies.length;i++){
            System.out.println((char)(i+97) +": "+ dictFrequencies[i]);
        }
    }
    public Node getHead(){
        return this.head;
    }
}