

 package json;
 

import org.json.simple.JSONObject;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.parser.ParseException;

import animalclass.Animal;

import org.json.simple.parser.JSONParser;

public class JsonDecode {
	
	

	   public static void main(String[] args) {
		   final Logger LOGGER = LogManager.getLogger(JsonDecode.class);
		
	      JSONParser parser = new JSONParser();
	      String s = "[0,{\"1\":{\"2\":{\"3\":{\"4\":[5,{\"6\":7}]}}}}]";
			
	      try{
	         java.lang.String s1 = null;
			Object obj = parser.parse(s1);
	         JSONArray array = (JSONArray)obj;
				
	         LOGGER.info("The 2nd element of array");
	         LOGGER.info(array.get(1));
	         

	         JSONObject obj2 = (JSONObject)array.get(1);
	         LOGGER.info("Field \"1\"");
	         LOGGER.info(obj2.get("1"));    

	         s1 = "{}";
	         obj = parser.parse(s1);
	         LOGGER.info(obj);

	         s1 = "[5,]";
	         obj = parser.parse(s1);
	         LOGGER.info(obj);

	         s1 = "[5,,2]";
	         obj = parser.parse(s1);
	         LOGGER.info(obj);
	      }catch(ParseException pe) {
			
	    	  LOGGER.info("position: " + pe.getPosition());
	    	  LOGGER.info(pe);
	      }
	   }
	}


