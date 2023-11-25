package cipherSolver.Algorithm;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.random;
import java.util.HashSet;

public class Solver{
    private Frequency[] cipherFrequencies;
    private Dictionary dictionary;
    private char[] simpleFreqs;
    public Solver(){
        this.dictionary = new Dictionary();
    }

    private void initCipher(ArrayList<String> words){
        this.cipherFrequencies = new Frequency[26];
        for(int i = 0; i < 26;i++){
            this.cipherFrequencies[i] = new Frequency('a'+i);
        }
        for(String s:words){
            String trimmedWord = textSimplifier(s);
            for(int i = 0; i < trimmedWord.length();i++){
                char x = trimmedWord.charAt(i);
                this.cipherFrequencies[(int)x -97].increment();
            }
        }
        Arrays.sort(this.cipherFrequencies);
        this.simpleFreqs = new char[26];
        for(int i = 0; i < 26;i++){
            this.simpleFreqs[i] = this.cipherFrequencies[i].getLetter();
        }
    }

    public char[] solve(ArrayList<String> words, int maxRounds){
        char[] translator = initial();
        initCipher(words);
        Random r = new Random();
        for(int round = 0; round < maxRounds;round++){
            HashSet<Integer> chosenWordIndexes = new HashSet();
            ArrayList<String> chosenWords = new ArrayList();
            if(words.size() > 50){
                while(chosenWordIndexes.size() < 30){
                    chosenWordIndexes.add(r.nextInt(words.size()));
                }
                for(int i: chosenWordIndexes){
                    chosenWords.add(words.get(i));
                }
            } else{
                chosenWords = words;
            }

            double comparison = this.dictionary.wordChecker(chosenWords, translator);
            if (comparison > 0.95){ // At this point cipher is considered to be solved
                break;
            }
            bool nextRound = false;
            for(int difference = 1; difference <= 3; difference++){
                // Switch 2 letters places in translation, if result is better than current best, keep change and move on to next round. 
                //Otherwise revert change and continue
                for(int i = 0; (i+difference)< 26;i++){
                    char temp = simpleFreqs[i];
                    simpleFreqs[i] = simpleFreqs[i+difference];
                    simpleFreqs[i+difference] = temp;
                    char temp2 = translator[(int)(simpleFreqs[i]-'a')];
                    translator[(int)(simpleFreqs[i]-'a')] = translator[(int)(simpleFreqs[i+difference]-'a')];
                    translator[(int)(simpleFreqs[i+difference]-'a')] = temp2;
                    double test = this.dictionary.wordChecker(chosenWords, translator);
                    if(test > comparison){
                        nextRound = true;
                        break;
                    } else{
                        temp = simpleFreqs[i];
                        simpleFreqs[i] = simpleFreqs[i+difference];
                        simpleFreqs[i+difference] = temp;
                        temp2 = translator[(int)(simpleFreqs[i]-'a')];
                        translator[(int)(simpleFreqs[i]-'a')] = translator[(int)(simpleFreqs[i+difference]-'a')];
                        translator[(int)(simpleFreqs[i+difference]-'a')] = temp2;
                    }
                }
                if(nextRound == true){
                    break;
                }
            }
        }
        return translator;
    }

    private char[] initial(){
        char[] translator = new char[26];
        Frequency[] dictFreq = this.dictionary.getFrequencies();
        for(int i = 0; i < 26;i++){
            translator[(int)(dictFreq[i].getLetter()-'a')] = this.cipherFrequencies[i].getLetter();
        }
        return translator;
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