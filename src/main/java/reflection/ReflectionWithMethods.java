package reflection;
import org.apache.logging.log4j.*;


import java.lang.Class;
import java.lang.reflect.*;
//declare a class Vehicle with four methods
class Vehicle {
   public void display() {
	   Logger demologger = LogManager.getLogger();
      System.out.println("I am a Vehicle!!");
   }
   protected void start() {
      System.out.println("Vehicle Started!!!");
   }
    protected void stop() {
      System.out.println("Vehicle Stopped!!!");
   }
   private void serviceVehicle() {
      System.out.println("Vehicle serviced!!");
   }
}class Example {
   public static void main(String[] args) {
      try {
          Vehicle car = new Vehicle(); 
          // create an object of Class
          Class obj = car.getClass();
           
          // get all the methods using the getDeclaredMethod() in an array
          Method[] methods = obj.getDeclaredMethods();          
 
// for each method get method info
          for(Method m : methods) {               
             System.out.println("Method Name: " + m.getName());
               
             // get the access modifier of methods
             int modifier = m.getModifiers();
             System.out.print("Modifier: " + Modifier.toString(modifier) + "  ");
               
             // get the return type of method
             System.out.print("Return Type: " + m.getReturnType());
             System.out.println("\n");
          }
       }
       catch(Exception e) {
           e.printStackTrace();
       }
   }
}