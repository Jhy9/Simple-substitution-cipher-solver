package cipherSolver.Algorithm;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class NodeTest 
{

    private Node head;
    @Before
    public void init(){
        head = new Node();
    }

    @Test
    public void treeStartsEmpty()
    {
        assertFalse(this.head.searchForWord("a",-1));
    }

    @Test
    public void treeAdditionsCanBeFound()
    {
        this.head.addWord("test",-1);
        assertTrue(this.head.searchForWord("test",-1));
    }
 
    @Test
    public void wordSubStringsArentCountedAsWords(){
        this.head.addWord("test",-1);
        assertFalse(this.head.searchForWord("te",-1));
    }

}
