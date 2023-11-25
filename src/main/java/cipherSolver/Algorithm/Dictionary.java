package cipherSolver.Algorithm;


import java.util.Arrays;
import java.util.Scanner;

public class Dictionary{
    private Node head;
    private Frequency[] frequencies;

    public Dictionary(){
        this.head = new Node();
        this.frequencies = new Frequency[26];
        for(int i = 0; i < 26;i++){
            this.frequencies[i] = new Frequency('a'+i);
        }
        addDictionary();
    }

    private void addDictionary(){
        try{
            Scanner dictReader = new Scanner(this.getClass().getResourceAsStream("/dictionary.txt"));
            while(dictReader.hasNextLine()){
                String nextWord = dictReader.nextLine();
                for(int i = 0; i < nextWord.length();i++){
                    char x = nextWord.charAt(i);
                    this.frequencies[(int)x - 97].increment();
                }
                this.head.addWord(nextWord, 0);
            }
            Arrays.sort(this.frequencies);
            dictReader.close();
        } catch(Exception e){
            System.out.println(e);
        }
    }

    public double wordChecker(ArrayList<String> words, char[] translator){
        int correctWords = 0;
        int checked = 0;
        for(String word:words){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < word.length();i++){
                char x = word.charAt(i);
                x = translator[(int)(x-'a')];
                sb.append(x);
            }
            if(this.head.searchForWord(sb.toString(), 0) == true){
                correctWords++;
            }
            checked++;
        }
        return (correctWords/checked);
    }

    public Frequency[] getFrequencies(){
        return this.frequencies;
    }

    public void printFrequencies(){
        for(int i = 0; i < this.frequencies.length;i++){
            System.out.println((char)(i+97) +": "+ this.frequencies[i]);
        }
    }
}