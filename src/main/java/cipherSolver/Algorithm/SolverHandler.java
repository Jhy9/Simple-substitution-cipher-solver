package cipherSolver.Algorithm;

import java.util.ArrayList;

import cipherSolver.Algorithm.Solver;
public class SolverHandler{

    private Solver solver;

    public SolverHandler(){
        this.solver = new Solver();
        this.solver.addDictionary();
    }

    public char[] solveCipher(ArrayList<String> words){
        double currentBest = 0;
        char[] bestTranslator = null;
        int acceptanceThreshold = (int)(0.8*words.size());
        while(true){
            boolean resultImproved = false;
            for(int attempts = 1; attempts <= 5;attempts++){
                int result = this.solver.solve(words,10000,acceptanceThreshold);
                if(result > currentBest){
                    currentBest = result;
                    bestTranslator = solver.getTranslator();
                    resultImproved = true;
                    acceptanceThreshold = result;
                    break;
                }
            }
            if(resultImproved == false){
                break;
            }
        }
        return bestTranslator;
    }
}