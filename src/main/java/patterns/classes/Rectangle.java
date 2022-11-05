package patterns.classes;
import org.apache.logging.log4j.*;

import patterns.interfaces.Shape;



public class Rectangle implements Shape {
	private static final Logger LOGGER = LogManager.getLogger(Rectangle.class);
	@Override
	public void drawShape() {
		LOGGER.info("Shape Rectangle.");
	}
}
