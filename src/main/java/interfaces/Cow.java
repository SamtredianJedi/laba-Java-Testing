package interfaces;
import org.apache.logging.log4j.*;
public class Cow {
	Logger demologger = LogManager.getLogger();
	
	public void Eat () {
		System.out.println("I am eating");
	}
	
	public void Weight () {
		System.out.println("Cow's Weight is: ");
	}
	
	public void Height() {
		System.out.println("Cow's Height is: ");
	}
	

}
