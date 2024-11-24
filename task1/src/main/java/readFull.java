

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author saadm
 */
import java.util.Scanner;
import java.io.*;  

public class readFull {
    public static void main(String[] args) throws Exception {
            
           
		try {
                    File input_names = new File("names.txt");
                    File output_names = new File("new_names.txt");
			Scanner reader = new Scanner(input_names);
                        PrintWriter writer = new PrintWriter(output_names);
                        String full_name_temp;
                        
			while (reader.hasNextLine()) {
                                full_name_temp = reader.nextLine();
                              //  System.out.println(full_name_temp); 
                              //  mahmoud saad ahmed
                                Scanner line = new Scanner(full_name_temp);
                                while (line.hasNextLine()){              //The hasNextLine() method of java.util.Scanner class returns ""true"" if there is another line in the input of this scanner. 
                                    writer.print(line.next().charAt(0));  //The next() is a method of Java Scanner class which finds and returns the next complete token from the scanner which is in using.
                                }
                                writer.println();
			}
			reader.close();
                        writer.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
