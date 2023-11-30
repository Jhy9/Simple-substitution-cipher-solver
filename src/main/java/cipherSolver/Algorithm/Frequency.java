// Class that tracks letter frequency in text.
package cipherSolver.Algorithm;

import java.util.Comparator;
public class Frequency implements Comparable<Frequency>{
    private int count;
    private char letter;

    public Frequency(char letter){
        this.count = 0;
        this.letter = letter;
    }

    public void increment(){
        this.count++;
    }
    public char getLetter(){
        return this.letter;
    }
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