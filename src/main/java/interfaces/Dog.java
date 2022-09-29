package interfaces;
import org.apache.logging.log4j.*;

public class Dog {
	private static final Logger LOGGER = LogManager.getLogger(Dog.class);
	
	public void Eat () {
		LOGGER.info("Dog is eating");
	}
	
	public void Weight () {
		LOGGER.info("Dog's Weight is: ");
	}
	
	public void Height() {
		LOGGER.info("Dog's Height is: ");
	}
	

}
