package cipherSolver.Algorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.HashSet;

public class Solver{
    private Dictionary dictionary;
    private char[] simpleFreqs;
    private char[] translator;
    private long wordSearches;

    public void addDictionary(){
        this.wordSearches = 0;
        this.dictionary = new Dictionary();
    }
    public char[] initSolver(ArrayList<String> words){
        char[] translator = new char[26];
        Frequency[] dictFreq = this.dictionary.getFrequencies();
        Frequency[] cipherFrequencies = new Frequency[26];
        for(int i = 0; i < 26;i++){
            cipherFrequencies[i] = new Frequency((char)((int)'a'+i));
        }
        for(String s:words){
            for(int i = 0; i < s.length();i++){
                char x = s.charAt(i);
                cipherFrequencies[(int)x -97].increment();
            }
        }
        Arrays.sort(cipherFrequencies);
        this.simpleFreqs = new char[26];
        for(int i = 0; i < 26;i++){
            this.simpleFreqs[i] = cipherFrequencies[i].getLetter();
            translator[this.simpleFreqs[i]-'a'] = dictFreq[i].getLetter();
        }
        return translator;
    }

    public int solve(ArrayList<String> words){
        this.translator = initSolver(words);
        int pickAmount = 0;
        if(words.size() > 35){
            pickAmount = 30;
        } else{
            pickAmount = words.size();
        }
        ArrayList<String> chosenWords = words;
        int strikes = 0;
        for(int round = 0; round < 10000;round++){
            if(pickAmount < words.size()){
                chosenWords = pickWords(words,pickAmount);
            }
            int comparison = this.dictionary.wordChecker(chosenWords, translator);
            wordSearches += pickAmount;
            boolean foundBetter = false;
            for(int difference = 1; difference <= 10; difference++){
                // Switch 2 letters places in translation, if result is better than current best, keep change and move on to next round. 
                //Otherwise revert change and continue
                for(int i = 0; (i+difference)< 26;i++){
                    translator = swapper(translator,this.simpleFreqs[i]-'a',this.simpleFreqs[i+difference]-'a');
                    int test = this.dictionary.wordChecker(chosenWords, translator);
                    wordSearches += pickAmount;
                    if(test <= comparison){
                        translator = swapper(translator,this.simpleFreqs[i]-'a',this.simpleFreqs[i+difference]-'a');
                    } else{
                        this.simpleFreqs = swapper(this.simpleFreqs,i,i+difference);
                        foundBetter = true;
                        break;
                    }
                }
                if(foundBetter == true){
                    strikes = 0;
                    break;
                }
            }
            strikes++;
            if(strikes >= 50){
                break;
            }
        }
        return this.dictionary.wordChecker(words, translator);
    }

    public char[] swapper(char[] swapObj, int first, int second){
        char[] array = swapObj;
        char temp = array[first];
        array[first] = array[second];
        array[second] = temp; 
        return array;
    }

    public ArrayList<String> pickWords(ArrayList<String> wordList, int amount){  
        HashSet<Integer> chosenWordIndexes = new HashSet();
        ArrayList<String> chosenWords = new ArrayList();
        //Picks random words
        Random r = new Random();
        while(chosenWordIndexes.size() < amount){
            chosenWordIndexes.add(r.nextInt(wordList.size()-1));
        }
        for(int x: chosenWordIndexes){
            chosenWords.add(wordList.get(x));
        }
 
        return chosenWords;
    }

    public char[] getTranslator(){
        return this.translator;
    }
    public String wordSearches(){
        return ("Algorithm performed " + wordSearches + " word searches from dictionary.");
    }
}