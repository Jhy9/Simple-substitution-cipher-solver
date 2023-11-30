package cipherSolver;

import CipherGenerator.CipherGenerator;
import cipherSolver.Algorithm.*;
import cipherSolver.IOUtil.*;
import cipherSolver.CipherGenerator.*;
import java.util.ArrayList;

public class App{

    public static void main(String[] args){
        System.out.println("Start:");
        long start = System.currentTimeMillis();
        solveTestFile("testfile.txt");
        long finish = System.currentTimeMillis();
        System.out.println("Time used "+ (finish-start) + " ms");
        
    }

    private static void solveTestFile(String filename){
        CipherGenerator generator = new CipherGenerator();
        generator.createCipher(filename);
        IOservice io = new IOservice();
        Solver solver = new Solver();
        ArrayList<String> words = io.readFile(filename);
        char[] solution = solver.solve(words, 100000);
        io.solutionWriter(solution,filename);
    }
}