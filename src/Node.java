import java.util.ArrayList;

// Tries implementation
public class Node{
    private char letter;
    private boolean endpoint;
    private ArrayList<Node> children;

    public Node(char letter){
        this.letter = letter;
        this.endpoint = false;
        this.children = new ArrayList<Node>();
    }

    public void addWord(String word, int index){
        if(index +1 == word.length()){
            this.endpoint = true;
        } else{
            Node next = null;
            char nextLetter = word.charAt(index+1);
            boolean nodeExisted = false;
            for(int i = 0; i < children.size();i++){
                if(children.get(i).getName()== nextLetter){
                    next = children.get(i);
                    nodeExisted = true;
                    break;
                }
            }
            if(nodeExisted == false){
                next = new Node(nextLetter);
            }
            next.addWord(nextLetter,index+1);
        }
    }

    public boolean searchForWord(String word, int index){
        if(index+1 == word.length()){
            return endpoint;
        } else{
            Node next = null;
            char nextLetter = word.charAt(index+1);
            for(int i = 0; i < children.size();i++){
                if(children.get(i).getName() == nextLetter){
                    next = children.get(i);
                    break;
                }
            }
            if (next == null){
                return false;
            } else{
                return searchForWord(word,index+1);
            }
        }
    }

    public char getName(){
        return this.letter;
    }
}

