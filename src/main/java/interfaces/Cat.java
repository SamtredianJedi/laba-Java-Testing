package interfaces;
import org.apache.logging.log4j.*;

public class Cat{
	Logger demologger = LogManager.getLogger();
	
	public void Eat () {
		System.out.println("I am eating");
	}
	
	public void Weight () {
		System.out.println("Cat's Weight is: ");
	}
	
	public void Height() {
		System.out.println("Cat's Heigjt is: ");
	}
	

}
