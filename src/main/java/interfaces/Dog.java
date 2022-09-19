package interfaces;
import org.apache.logging.log4j.*;

public class Dog {
	Logger demologger = LogManager.getLogger();
	
	public void Eat () {
		System.out.println("Dog is eating");
	}
	
	public void Weight () {
		System.out.println("Dog's Weight is: ");
	}
	
	public void Height() {
		System.out.println("Dog's Height is: ");
	}
	

}
