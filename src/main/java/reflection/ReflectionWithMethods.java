package reflection;
import org.apache.logging.log4j.*;


import java.lang.Class;
import java.lang.reflect.*;
//declare a class Vehicle with four methods
class Vehicle {
	private static final Logger LOGGER = LogManager.getLogger(Vehicle.class);
   public void display() {
      LOGGER.info("I am a Vehicle!!");
   }
   protected void start() {
      LOGGER.info("Vehicle Started!!!");
   }
    protected void stop() {
      LOGGER.info("Vehicle Stopped!!!");
   }
   private void serviceVehicle() {
      LOGGER.info("Vehicle serviced!!");
   }
}class Example {
	private static final Logger LOGGER = LogManager.getLogger(Example.class);
   public static void main(String[] args) {
      try {
          Vehicle car = new Vehicle(); 
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