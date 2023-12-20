package cipherSolver.Algorithm;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.ArrayList;

public class SolverTest
{

    private Solver solve;
    @Before
    public void init(){
        this.solve = new Solver();
    }

    @Test
    public void swapperSwapsTwoChars()
    {
        char[] chars = new char[2];
        chars[0] = 'a';
        chars[1] = 'b';
        solve.swapper(chars,0,1);
        assertTrue(chars[0] == 'b');
        assertTrue(chars[1] == 'a');
    }
    
    @Test
    public void pickWordsDoesNotPickSameIndexes()
    {
        ArrayList<String> words = new ArrayList();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        ArrayList<String> result = solve.pickWords(words, 3);
        assertFalse(result.get(0).equals(result.get(1)));
        assertFalse(result.get(1).equals(result.get(2)));
        assertFalse(result.get(0).equals(result.get(2)));
    }

    @Test
    public void pickWordsPicksRightAmountOfWords()
    {
        ArrayList<String> words = new ArrayList();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        ArrayList<String> result = solve.pickWords(words, 3);
        assertTrue(result.size() == 3);
    }

    @Test
    public void initSetsCorrectTranslatorStartPoint(){
        this.solve.addDictionary();
        ArrayList<String> words = new ArrayList();
        words.add("bbvme");
        words.add("bbhrmih");
        words.add("lkmbbbb");
        words.add("mjaabbbbyj");
        words.add("mvkfbb");
        assertEquals(this.solve.initSolver(words)[1],'e');
    }

}