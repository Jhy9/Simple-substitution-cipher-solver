package cipherSolver.Algorithm;


import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import cipherSolver.CipherGenerator.*;
import cipherSolver.IOUtil.*;
import cipherSolver.Algorithm.*;


public class AlgorithmTest{


    @Test
    public void algorithmSolvesSimpleCipher(){
        CipherGenerator generator = new CipherGenerator();
        generator.createCipher("testfile3.txt");
        IOservice io = new IOservice();
        ArrayList<String> words = io.readFile("testfile3.txt");
        SolverHandler solver = new SolverHandler();
        solver.solveCipher(words);
        assertTrue(solver.getPerformanceData().contains("Found 530 of 545 words."));
    }
}