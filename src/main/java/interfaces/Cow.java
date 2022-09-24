package interfaces;
import org.apache.logging.log4j.*;
public class Cow {
	private static final Logger LOGGER = LogManager.getLogger(Cow.class);
	
	public void Eat () {
		LOGGER.info("I am eating");
	}
	
	public void Weight () {
		LOGGER.info("Cow's Weight is: ");
	}
	
	public void Height() {
		LOGGER.info("Cow's Height is: ");
	}
	

}
