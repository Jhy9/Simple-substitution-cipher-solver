
// This class will contain cipher generator that can be used for testing
package CipherGenerator;

import java.util.random;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.Writer;

public class CipherGenerator{

    public void createCipher(String filename){
        char[] cipherTable = shuffler();
        try{
            Scanner reader = new Scanner(this.getClass().getResourceAsStream("TextsForTesting/"+filename+".txt"));
            BufferedWriter writer = new BufferedWriter("Input/" + filename +".txt",false);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < line.length();i++){
                    char x = line.charAt(i);
                    int ascii = (int) x;
                    if(ascii >= 65 && ascii <= 90){
                        x = x+(cipherTable[ascii-(int)'A']-ascii);
                    }
                    if(ascii >= 97 && ascii <= 122){
                        x = x+(cipherTable[ascii-(int)'a']-ascii);
                    }
                    sb.append(x);
                }
                writer.write(sb.toString());
                writer.newLine();
        }
    }catch(Exception e){
        print(e);
    }
    }


    private char[] shuffler(){
        char[] letterOrder = new int[26];
        for (int i = 0; i < 26; i++){
            letterOrder[i] = 'a'+i;
        }
        Random r = new Random();
        int a = 0;
        int b = 0;
        char temp = 'a';
        for(int i = 0; i < 500; i++){
            a = r.nextInt(26);
            b = r.nextInt(26);
            temp = letterOrder[a];
            letterOrder[a] = letterOrder[b];
            letterOrder[b]= temp;
        }
        return letterOrder;
    }

}