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
        for(double acceptanceThreshold = 0.84; acceptanceThreshold <= 1;acceptanceThreshold += 0.02){
            boolean resultImproved = false;
            for(int attempts = 1; attempts <= 3;attempts++){
                double result = this.solver.solve(words,10000,acceptanceThreshold);
                System.out.println(acceptanceThreshold);
                if(result > currentBest){
                    currentBest = result;
                    bestTranslator = solver.getTranslator();
                }
                if(result >= acceptanceThreshold){
                    resultImproved = true;
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