package filereader;
import org.apache.logging.log4j.*;

import animalclass.Animal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
	
	public static void main (String[] args) {// method header
		final Logger LOGGER = LogManager.getLogger(FileReader.class);
	
	String text = readString("SOLVD/Solvd/src/Recources/text for File reader.txt");
	LOGGER.info(text);
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
			LOGGER.info("file not found ");
		}
		return text;
		
		
		
	
	}
}
