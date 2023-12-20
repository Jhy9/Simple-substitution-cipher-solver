package cipherSolver.Algorithm;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import cipherSolver.Algorithm.Dictionary;

import java.util.ArrayList;

public class DictionaryTest{

    private Dictionary dict;

    @Before
    public void init(){
        dict = new Dictionary();
    }

    @Test
    public void dictionarySearchGivesRightAnswer()
    {
        char[] fakeTranslator = new char[26];
        for(int i = 0; i < 26;i++){
            fakeTranslator[i] = (char)('a'+i);
        }
        ArrayList<String> words = new ArrayList();
        words.add("akgpokgpskagiamgrik");
        words.add("word");
        words.add("yellow");
        words.add("skhkprjgiomamg");
        words.add("car");
        words.add("ghmsirjgh");  
        assertEquals(dict.wordChecker(words, fakeTranslator),3);
        words.add("yes");
        assertEquals(dict.wordChecker(words, fakeTranslator),4);
    }

    @Test
    public void dictionaryFrequenciesAreInRightOrder(){
        assertEquals(dict.getFrequencies()[0].getLetter(), 'e');
    }
}