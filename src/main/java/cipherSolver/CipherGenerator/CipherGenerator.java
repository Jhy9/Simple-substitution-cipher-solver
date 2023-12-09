package CipherGenerator;

// This class will contain cipher generator that can be used for testing
import java.util.Random;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class CipherGenerator{
    public void createCipher(String filename){
        char[] cipherTable = shuffler();
        try{
            FileReader fileReader = new FileReader("src/main/resources/TextsForTesting/"+filename);
            BufferedReader reader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("src/main/resources/Input/"+filename,false);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            while(true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < line.length();i++){
                    char x = line.charAt(i);
                    int ascii = (int) x;
                    if(ascii >= 65 && ascii <= 90){
                        x = (char)(cipherTable[ascii-(int)'A']-32);
                    }
                    if(ascii >= 97 && ascii <= 122){
                        x = (char)(cipherTable[ascii-(int)'a']);
                    }
                    sb.append(x);
                }
                writer.write(sb.toString());
                writer.newLine();
            }
            writer.close();
            reader.close();
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }

    public char[] shuffler(){
        char[] letterOrder = new char[26];
        for (int i = 0; i < 26; i++){
            letterOrder[i] = (char)((int)'a'+i);
        }
        Random r = new Random();
        int a = 0;
        int b = 0;
        char temp = 'a';
        for(int i = 0; i < 1000; i++){
            a = r.nextInt(26);
            b = r.nextInt(26);
            temp = letterOrder[a];
            letterOrder[a] = letterOrder[b];
            letterOrder[b]= temp;
        }
        return letterOrder;
    }

}