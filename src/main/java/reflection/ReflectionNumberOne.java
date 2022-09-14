package reflection;

import java.lang.Class;
import java.lang.reflect.*;
//declare a class Car with four methods

// The below example shows the reflection of class methods
// in Java using the above APIs.
class Car {
   public void display() {
      System.out.println("I am a Car!!");
   }
   protected void start() {
      System.out.println("Car Started!!!");
   }
    protected void stop() {
      System.out.println("Car Stopped!!!");
   }
   private void serviceVehicle() {
      System.out.println("Car serviced!!");
   }
}class Main {
   public static void main(String[] args) {
      try {
          Car car = new Car();
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