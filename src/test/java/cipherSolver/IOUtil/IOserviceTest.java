package cipherSolver.IOUtil;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class IOserviceTest{

    private IOservice io;

    @Before
    public void init(){
        this.io = new IOservice();
    }

    @Test
    public void textSimplifierDoesntChangeIfNothingToChange(){
        String s = "hello";
        assertEquals(s,io.textSimplifier(s));
    }

    @Test
    public void textSimplifierTakesOutSpecials(){
        String s = "*(%#he%!l%!%()%#%!l!!!!o???????????";
        assertEquals("hello",io.textSimplifier(s));
    }
    @Test
    public void textSimplifierLowerCases(){
        String s = "heLLo";
        assertEquals("hello",io.textSimplifier(s));
    }
}
