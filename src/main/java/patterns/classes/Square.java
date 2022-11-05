package patterns.classes;
import org.apache.logging.log4j.*;

import patterns.interfaces.Shape;



public class Square implements Shape {
	private static final Logger LOGGER = LogManager.getLogger(Square.class);
	@Override
	public void drawShape() {
		LOGGER.info("Shape Square.");
	}
}
