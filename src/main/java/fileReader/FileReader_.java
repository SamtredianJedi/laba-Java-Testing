package fileReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader_ {
	
	public static void main (String[] args) { // method header
	
	
	String text = readString("SOLVD/Solvd/src/Recources/text for File reader.txt");
	System.out.println(text);
	}
	
	public static String readString(String file) {
		String text = "";
		try {
			Scanner s = new Scanner(new File(file));
			while (s.hasNextLine()) {
				text = text  + s.nextLine();
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("file not found ");
		}
		return text;
		
		
		
	
	}
}
