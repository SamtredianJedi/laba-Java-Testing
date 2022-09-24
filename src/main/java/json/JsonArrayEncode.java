package json;

import org.json.simple.JSONArray;  
import org.apache.logging.log4j.*;


public class JsonArrayEncode{   
	private static final Logger LOGGER = LogManager.getLogger(JsonArrayEncode.class);
public static void main(String args[]){ 
	
	
	
  JSONArray arr = new JSONArray();  
  arr.add("rezoo");    
  arr.add(new Integer(27));    
  arr.add(new Double(600000));   
  
  
  LOGGER.info(arr);  
}}    