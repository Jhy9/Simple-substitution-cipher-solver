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
            int nextLetter =(int)word.charAt(index+1)-97;
            boolean nodeExisted = false;
            Node next = null;
            if(children[nextLetter] != null){
                next = children[nextLetter];
                nodeExisted = true;
            }
            if(nodeExisted == false){
                next = new Node();
                this.children[(int)nextLetter] = next;
            }
            next.addWord(word,index+1);
        }
    }

    public boolean searchForWord(String word, int index){
        if(index+1 == word.length()){
            return this.endpoint;
        } else{
            int nextLetter = (int)word.charAt(index+1)-97;
            Node next = this.children[nextLetter];
            if (next == null){
                return false;
            } else{
                return searchForWord(word,index+1);
            }
        }
    }
}

