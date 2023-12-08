package cipherSolver.Algorithm;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class FrequencyTest{

    private Frequency freq;

    @Before
    public void init(){
        freq = new Frequency('a');
    }

    @Test
    public void frequencyStartValueAreRight()
    {
        assertEquals(this.freq.getCount(),0);
        assertEquals(this.freq.getLetter(),'a');
    }

    @Test
    public void frequencyIncrementWorks()
    {
        this.freq.increment();
        this.freq.increment();
        assertEquals(this.freq.getCount(),2);
    }

    @Test
    public void frequencyComparisonsWork()
    {
        Frequency freq2 = new Frequency('b');
        
        this.freq.increment();
        assertTrue((freq.compareTo(freq2)) == -1);
        freq2.increment();
        assertTrue((freq.compareTo(freq2)) == 0);
        freq2.increment();
        assertTrue((freq.compareTo(freq2)) == 1);
    }

}