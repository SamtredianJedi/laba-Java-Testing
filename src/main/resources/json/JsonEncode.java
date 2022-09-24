package json;
import org.json.simple.JSONObject;
public class JsonEncode {
	

	

	   public static void Json(String[] args) {
	      JSONObject obj = new JSONObject();

	      obj.put("name", "foo");
	      obj.put("num", new Integer(100));
	      obj.put("balance", new Double(1000.21));
	      obj.put("is_vip", new Boolean(true));

	      System.out.print(obj);
	   }
	}

}
