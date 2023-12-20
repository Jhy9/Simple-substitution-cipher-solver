package cipherSolver.Algorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.HashSet;

/**
 * Creates translator in effort to solve cipher
 */

public class Solver{
    private Dictionary dictionary;
    private char[] simpleFreqs;
    private char[] translator;
    private long wordSearches;
 
    public void addDictionary(){
        this.wordSearches = 0;
        this.dictionary = new Dictionary();
    }

    /**
     * Initializes translator and simpleFreqs based on relative letter frequencies of dictionary and ciphered text
     * @param words Ciphered text as arraylist of words
     * @return Initialized translator
     */
    public char[] initSolver(ArrayList<String> words){
        char[] translator = new char[26];
        Frequency[] dictFreq = this.dictionary.getFrequencies();
        Frequency[] cipherFrequencies = new Frequency[26];
        for(int i = 0; i < 26;i++){
            cipherFrequencies[i] = new Frequency((char)((int)'a'+i));
        }
        // Calculates letter frequencies 
        for(String s:words){
            for(int i = 0; i < s.length();i++){
                char x = s.charAt(i);
                cipherFrequencies[(int)x -97].increment();
            }
        }
        Arrays.sort(cipherFrequencies);
        this.simpleFreqs = new char[26];
        // Sets starting point for translator and sets simpleFreqs to order of letter frequencies in ciphered text
        for(int i = 0; i < 26;i++){
            this.simpleFreqs[i] = cipherFrequencies[i].getLetter();
            translator[this.simpleFreqs[i]-'a'] = dictFreq[i].getLetter();
        }
        return translator;
    }
    /**
     * Attempts to make improvements to translator
     * @param words Ciphered text as arraylist of words
     * @return Amount of words that can be found in dictionary if whole text was translated using translator
     */
    public int solve(ArrayList<String> words){
        this.translator = initSolver(words);
        int pickAmount = Math.min(30,(int)(words.size()/2));
        ArrayList<String> chosenWords = words;
        int strikes = 0;
        for(int round = 0; round < 10000;round++){
            // Picks random words for translator testing
            chosenWords = pickWords(words,pickAmount);
            int comparison = this.dictionary.wordChecker(chosenWords, translator);
            wordSearches += pickAmount;
            boolean foundBetter = false;
            for(int difference = 1; difference <= 10; difference++){
                // Switch 2 letters places in translation, if result is better than current best, keep change and move on to next round. 
                //Otherwise revert change and continue
                //Uses order letters appear in simpleFreqs for prioritization
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
            // Terminates algorithm if no switch found in 50 consecutive rounds
            if(strikes >= 50){
                break;
            }
        }
        return this.dictionary.wordChecker(words, translator);
    }
    /**
     * Switches place of two objects in array
     * @param swapObj
     * @param first
     * @param second
     * @return
     */
    public char[] swapper(char[] swapObj, int first, int second){
        char[] array = swapObj;
        char temp = array[first];
        array[first] = array[second];
        array[second] = temp; 
        return array;
    }
    /**
     * Picks random words from list
     * @param wordList List of all words
     * @param amount Amount of words to be picked
     * @return Picked words
     */
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
    /**
     * 
     * @return Word search data for GUI
     */
    public String wordSearches(){
        return ("Algorithm performed " + wordSearches + " word searches from dictionary.");
    }
}