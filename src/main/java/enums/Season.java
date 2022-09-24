package enums;
import org.apache.logging.log4j.*;


			
	public enum Season{   
		
	WINTER(5), SPRING(10), SUMMER(15), FALL(20); 
		private  final Logger LOGGER = LogManager.getLogger(Season.class);

	  
	private int value;  
	private Season(int value){  
	this.value=value;  
	
	
	 
	for (Season s : Season.values())  
	LOGGER.info(s+" "+s.value);  
	  
	}}  


