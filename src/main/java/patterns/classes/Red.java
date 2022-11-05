package patterns.classes;
import org.apache.logging.log4j.*;

import patterns.interfaces.Color;

public class Red implements Color {
	private static final Logger LOGGER = LogManager.getLogger(Red.class);
	@Override
	public void fillColor() {
		LOGGER.info("Fill Red Color.");
	}
}
