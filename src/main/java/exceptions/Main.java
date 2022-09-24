package exceptions;

import java.io.File;
import org.apache.logging.log4j.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main{
	private static Logger demologger = LogManager.getLogger();
	@SuppressWarnings("null")
	public static void main(String args[]) throws FileNotFoundException, IncorrectFileNameException, ArithmeticException, ArrayIndexOutOfBoundsException, NumberFormatException {
	

	
	{
		String str = null;
		System.out.println(str.length());
	
		int a=30, b=0;
		int c=a/b;
		System.out.println("result ="+c);
		
		
		int num = Integer.parseInt("Rezo");
		System.out.println(num);
		System.out.println(" other statement");

	
		int a1[]= new int[5];
		a1[7]=9;
		String fileName = null;
		try (Scanner file = new Scanner(new File(fileName))) {
		    if (file.hasNextLine())
		        return;
		} catch (FileNotFoundException e) {
		    if (!isCorrectFileName(fileName)) {
		        throw new IncorrectFileNameException("Incorrect filename : " + fileName );
		    }
		    
		    
		    
		}

}
	
}
	static void checkAge(int age) throws ArithmeticException {
	    if (age < 18) {
	      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
	    }
	    else {
	      System.out.println("Access granted - You are old enough!");
	    }
	  }

	private static boolean isCorrectFileName(String fileName) {
		
		return false;
	}
	
	
	

	
	
}
