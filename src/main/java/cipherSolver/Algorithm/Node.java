package cipherSolver.Algorithm;

public class Node{
    // Tree implementation
    private boolean endpoint;
    private Node[] children;

    public Node(){
        this.endpoint = false;
        this.children = new Node[26];
    }

    public void addWord(String word, int index){
        if(index +1 == word.length()){
            this.endpoint = true;
        } else{
            int nextLetter =word.charAt(index+1)-'a';
            Node next = null;
            if(this.children[nextLetter] != null){
                next = this.children[nextLetter];
            } else{
                next = new Node();
                this.children[nextLetter] = next;
            }
            next.addWord(word,index+1);
        }
    }

    public boolean searchForWord(String word, int index){
        if(index+1 == word.length()){
            return this.endpoint;
        } else{
            int nextLetter =word.charAt(index+1)-'a';
            Node next = this.children[nextLetter];
            if (next == null){
                return false;
            } else{
                return next.searchForWord(word,index+1);
            }
        }
    }
}

