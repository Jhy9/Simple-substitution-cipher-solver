package cipherSolver.Algorithm;

import java.util.ArrayList;

import cipherSolver.Algorithm.Solver;

/**
 * Decides how many times solver is run
 */
public class SolverHandler{

    private Solver solver;
    private int currentBest;
    private int wordsSize;
    private long execTime;

    public SolverHandler(){
        this.solver = new Solver();
        this.solver.addDictionary();
        
    }
    /**
     * Runs solver multiple times and picks out the best result for final answer
     * @param words Ciphered words as arrayList
     * @return Translator from best solver run
     */
    public char[] solveCipher(ArrayList<String> words){
        currentBest = 0;
        wordsSize = words.size();
        char[] bestTranslator = null;
        long start = System.currentTimeMillis();
        int improvements = 0;
        while(improvements < 10){
            boolean resultImproved = false;
            for(int attempts = 1; attempts <= 5;attempts++){
                int result = this.solver.solve(words);
                // If solver results are still improving, keeps algorithm going
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
            improvements++;
        }
        long end = System.currentTimeMillis();
        execTime = end - start;
        return bestTranslator;
    }
    /**
     * 
     * @return Performance data for GUI
     */
    public String getPerformanceData(){
        StringBuilder data = new StringBuilder();
        data.append("Results: " + '\n');
        data.append("Found "+ currentBest + " of " + wordsSize+ " words." + '\n');
        data.append(solver.wordSearches() + '\n');
        data.append("Time used "+ execTime + " ms");
        return data.toString();
    }
}