package patterns;

import patterns.classes.Circle;
import patterns.classes.Rectangle;
import patterns.classes.Square;
import patterns.interfaces.Color;
import patterns.interfaces.Shape;

public class ShapeFactory extends AbstractFactory{
	 
	   //getShape method returns object of input type shape
	   @Override
	   public Shape getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }		
	      if(shapeType.equalsIgnoreCase("Circle")){
	         return new Circle();
	 
	      } else if(shapeType.equalsIgnoreCase("Rectangle")){
	         return new Rectangle();
	 
	      } else if(shapeType.equalsIgnoreCase("Square")){
	         return new Square();
	      }
	 
	      return null;
	   }
	 
	   @Override
	   Color getColor(String color) {
	      return null;
	   }
	}
