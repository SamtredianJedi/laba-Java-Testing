package json;

import java.util.HashMap;  
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONValue;  

public class JsonEncodeMap{ 
	
	
	
public static void main(String args[]){   
	 final Logger LOGGER = LogManager.getLogger(JsonEncodeMap.class);
	
	Map obj=new HashMap();    
		obj.put("name","sonoo");    
		obj.put("age",new Integer(27));    
		obj.put("salary",new Double(600000));  
  
  
  String jsonText = JSONValue.toJSONString(obj);  
  LOGGER.info(jsonText);  
}}    