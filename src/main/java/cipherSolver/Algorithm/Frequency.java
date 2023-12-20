package cipherSolver.Algorithm;

import java.util.Comparator;

/**
 * Tracks frequencies of letters within a collection
 */
public class Frequency implements Comparable<Frequency>{
    private int count;
    private char letter;

    public Frequency(char letter){
        this.count = 0;
        this.letter = letter;
    }
    
    /** 
     * Increases count if letter is seen in text
    */
    public void increment(){
        this.count++;
    }
    /**
     * 
     * @return Letter frequency of which is being tracked
     */
    public char getLetter(){
        return this.letter;
    }
    /**
     * 
     * @return Amount of times letter was found
     */
    public int getCount(){
        return this.count;
    }


    @Override 
    public int compareTo(Frequency x){
        if(this.count > x.count){
            return -1;
        } else if (this.count < x.count){
            return 1;
        } else{
            return 0;
        }
    }
}