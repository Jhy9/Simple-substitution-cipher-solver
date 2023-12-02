package cipherSolver;

import CipherGenerator.CipherGenerator;
import cipherSolver.Algorithm.*;
import cipherSolver.IOUtil.*;
import cipherSolver.CipherGenerator.*;
import java.util.ArrayList;
import java.util.Scanner;
public class App{

    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);
        while(true){
            System.out.println("Input filename, x quits the program");
            System.out.println("Example input: testfile.txt");
            String filename =   inputReader.nextLine();
            if(filename.equals("x")){
                break;
            }
            CipherGenerator generator = new CipherGenerator();
            generator.createCipher(filename);
            System.out.println("Start:");
            long start = System.currentTimeMillis();
            solveTestFile(filename);
            long finish = System.currentTimeMillis();
            System.out.println("Time used "+ (finish-start) + " ms");
        }
    }

    private static void solveTestFile(String filename){
        Solver solver = new Solver();
        IOservice io = new IOservice();   
        ArrayList<String> words = io.readFile(filename);
        char[] solution = solver.solve(words, 10000);
        io.solutionWriter(solution,filename);
    }
}