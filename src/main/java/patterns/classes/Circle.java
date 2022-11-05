package patterns.classes;

import org.apache.logging.log4j.*;

import patterns.interfaces.Shape;




public class Circle implements Shape {
	private static final Logger LOGGER = LogManager.getLogger(Circle.class);
	@Override
	public void drawShape() {
	LOGGER.info("Shape Circle.");
	}
}
