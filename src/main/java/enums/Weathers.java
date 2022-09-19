package enums;
import org.apache.logging.log4j.*;

public class Weathers {
	
	
}
			
	enum Season{   
		
	WINTER(5), SPRING(10), SUMMER(15), FALL(20); 
		private static Logger demologger = LogManager.getLogger();
	  
	private int value;  
	private Season(int value){  
	this.value=value;  
	}  
	
	public static void main(String args[]){  
	for (Season s : Season.values())  
	System.out.println(s+" "+s.value);  
	  
	}}  


