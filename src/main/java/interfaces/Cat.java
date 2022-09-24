package interfaces;
import org.apache.logging.log4j.*;

public class Cat {
	private static final Logger LOGGER = LogManager.getLogger(Cat.class);
	
	
	public void Eat () {
		LOGGER.info("Cat is eating");
	}
	
	public void Weight () {
		LOGGER.info("Cat's Weight is: ");
	}
	
	public void Height() {
		LOGGER.info("Cat's Height is: ");
	}
	

}
