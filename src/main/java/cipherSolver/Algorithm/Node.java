package cipherSolver.Algorithm;

/**
 * Trie node implementation
 * 
 */
public class Node{
    private boolean endpoint;
    private Node[] children;
    public Node(){
        this.endpoint = false;
        this.children = new Node[26];
    }
    /**
     * Adds a word into trie
     * @param word  Word that is to be added
     * @param index Index of a letter that is to be added next
     */
    public void addWord(String word, int index){
        //sets endpoint if all letters are now added
        if(index +1 == word.length()){
            this.endpoint = true;
        } else{
            //Moves onto next letter of the word. If it doesn't exist in tree, it is created.
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
    /**
     * Recursive method that searches a word from trie
     * @param word  word algorithm is searching for
     * @param index index of the letter algorithm is currently looking for
     * @return information if word was found
     */
    public boolean searchForWord(String word, int index){
        //if whole word has been gone through check if word is valid i.e is endpoint's value true or not
        if(index+1 == word.length()){
            return this.endpoint;
        } else{
            //if not move onto next letter if it exists in tree
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

