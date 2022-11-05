package patterns.classes;

import org.apache.logging.log4j.*;

import patterns.interfaces.Color;

public class Blue implements Color {
	private static final Logger LOGGER = LogManager.getLogger(Blue.class);
	@Override
	public void fillColor() {
		LOGGER.info("Fill Blue Color.");
	}
}
