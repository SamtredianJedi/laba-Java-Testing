package patterns.classes;
import org.apache.logging.log4j.*;

import patterns.interfaces.Color;

public class Green implements Color {
	private static final Logger LOGGER = LogManager.getLogger(Green.class);
	@Override
	public void fillColor() {
		LOGGER.info("Fill Green Color.");
	}
}
