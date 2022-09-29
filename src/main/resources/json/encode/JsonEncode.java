package json.encode;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;

public class JsonEncode {
	private static final Logger LOGGER = LogManager.getLogger(JsonEncode.class);
	

	

	   public static void Json(String[] args) {
	      JSONObject obj = new JSONObject();

	      obj.put("name", "foo");
	      obj.put("num", new Integer(100));
	      obj.put("balance", new Double(1000.21));
	      obj.put("is_vip", new Boolean(true));

	     LOGGER.info(obj);
	   }
	
}
