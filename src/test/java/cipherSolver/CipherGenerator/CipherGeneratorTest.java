package cipherSolver.CipherGenerator;

import static org.junit.Assert.*;
import org.junit.Test;

public class CipherGeneratorTest{

    @Test
    public void shufflerReturnsOnePlaceForEachLetter(){
        CipherGenerator generator = new CipherGenerator();
        char[] returnArray = generator.shuffler();
        int[] letterFreqs = new int[26];
        for(int i = 0; i < 26;i++){
            letterFreqs[i]=0;
        }
        for(int i = 0; i < 26;i++){
            letterFreqs[returnArray[i]-'a']++;
        }
        for(int i = 0; i < 26;i++){
            assertEquals(letterFreqs[i],1);
        }
    }
}
