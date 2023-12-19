package cipherSolver.Algorithm;

import java.util.ArrayList;

import cipherSolver.Algorithm.Solver;
public class SolverHandler{

    private Solver solver;
    private int currentBest;
    private int wordsSize;
    private long execTime;
    public SolverHandler(){
        this.solver = new Solver();
        this.solver.addDictionary();
        
    }

    public char[] solveCipher(ArrayList<String> words){
        currentBest = 0;
        wordsSize = words.size();
        char[] bestTranslator = null;
        long start = System.currentTimeMillis();
        while(true){
            boolean resultImproved = false;
            for(int attempts = 1; attempts <= 5;attempts++){
                int result = this.solver.solve(words);
                if(result > currentBest){
                    currentBest = result;
                    bestTranslator = solver.getTranslator();
                    resultImproved = true;
                    break;
                }
            }
            if(resultImproved == false){
                break;
            }
        }
        long end = System.currentTimeMillis();
        execTime = end - start;
        return bestTranslator;
    }
    public String getPerformanceData(){
        StringBuilder data = new StringBuilder();
        data.append("Results: " + '\n');
        data.append("Found "+ currentBest + " of " + wordsSize+ " words." + '\n');
        data.append(solver.wordSearches() + '\n');
        data.append("Time used "+ execTime + " ms");
        return data.toString();
    }
}