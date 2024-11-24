package First;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String data , result;

        System.out.print("Enter The Key: ");
        Scanner scan = new Scanner(System.in);
        String key = scan.next();
        try{
            File readFile = new File("F:\\Well\\src\\First\\input.txt");
            File output = new File("F:\\Well\\src\\First\\output.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(output));
            Scanner myReader = new Scanner(readFile);
            while (myReader.hasNextLine()) {
                data = myReader.nextLine();
                result = textSpliter(data,key);
                bw.write(result);
                bw.newLine();
            }
            myReader.close();
            bw.close();
        } catch (IOException e) {
            System.out.println("File Error");
        }
    }
    public static String textSpliter(String lineData,String key){
        String result = "";
        int keyNo = key.charAt(0) -'a';
        for (int i = 0; i < lineData.length(); i++) {
             if (lineData.charAt(i) != ' ') {
                int old = lineData.charAt(i)-'a';
                char res = (char) ('a'+((old + keyNo)%26));
                result += res;
            }
        }
        return result;
    }
}

