package interfaces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Eat {
	private static final Logger LOGGER = LogManager.getLogger(Eat.class);
	
	
	public void eat () {
		LOGGER.info("I am eating");
	}

}
