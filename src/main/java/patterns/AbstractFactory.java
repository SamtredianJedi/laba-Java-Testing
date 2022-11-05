package patterns;

import patterns.interfaces.Color;
import patterns.interfaces.Shape;

public abstract class AbstractFactory {
	abstract Color getColor(String color);
	abstract Shape getShape(String shape);
}
