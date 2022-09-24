package reflection;
import org.apache.logging.log4j.*;

import java.lang.Class;
import java.lang.reflect.*;
//declare a class Car with four methods

// The below example shows the reflection of class methods
// in Java using the above APIs.
class Car {
	private static final Logger LOGGER = LogManager.getLogger(Car.class);
   public void display() {
      LOGGER.info("I am a Car!!");
   }
   protected void start() {
	   LOGGER.info("Car Started!!!");
   }
    protected void stop() {
    	LOGGER.info("Car Stopped!!!");
   }
   private void serviceVehicle() {
	   LOGGER.info("Car serviced!!");
   }
}class Main {
	private static final Logger LOGGER = LogManager.getLogger(Main.class);
   public static void main(String[] args) {
      try {
          Car car = new Car();
          // create an object of Class
          Class obj = car.getClass();
           
          // get all the methods using the getDeclaredMethod() in an array
          Method[] methods = obj.getDeclaredMethods();          
 
// for each method get method info
          for(Method m : methods) {               
             LOGGER.info("Method Name: " + m.getName());
               
             // get the access modifier of methods
             int modifier = m.getModifiers();
             LOGGER.info("Modifier: " + Modifier.toString(modifier) + "  ");
               
             // get the return type of method
             LOGGER.info("Return Type: " + m.getReturnType());
             LOGGER.info("\n");
          }
       }
       catch(Exception e) {
           e.printStackTrace();
       }
   }
}