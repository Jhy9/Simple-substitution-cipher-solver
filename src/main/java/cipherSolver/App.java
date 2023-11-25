package cipherSolver;

import cipherSolver.Algorithm.Solver;
import cipherSolver.IOUtil.*;



public class App{

    public static void main(String[] args){
        Solver x = new Dictionary();
        System.out.println("Dictionary letter frequencies:");
        x.printFrequencies();
        System.out.println(x.getHead().searchForWord("laminates",-1));
    }
}