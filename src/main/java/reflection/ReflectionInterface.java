package reflection;
import org.apache.logging.log4j.*;

import java.lang.Class;
import java.lang.reflect.*;
 
//define Interface Animals and PetAnimals
interface Animals {
   public void display();
}
 
interface PetAnimals {
   public void makeSound();
}
 
//define a class Dog that implements above interfaces
class Dog implements Animals, PetAnimals {
	private static final Logger LOGGER = LogManager.getLogger(Dog.class);
   //define interface method display  
   public void display() {
      LOGGER.info("This is a PetAnimal::Dog");
   }
 
   //define interface method makeSound    
   public void makeSound() {
     LOGGER.info("Dog makes sound::Bark bark");
   }
}
class Test1 {
	private static final Logger LOGGER = LogManager.getLogger(Test1.class);
  public static void main(String[] args) {
      try {
          // create an object of Dog class
          Dog dog = new Dog();
          // get class object
          Class obj = dog.getClass();
          // get the interfaces implemented by Dog
          Class[] objInterface = obj.getInterfaces();
          LOGGER.info("Class Dog implements following interfaces:");
          //print all the interfaces implemented by class Dog
          for(Class citem : objInterface) {
              LOGGER.info("Interface Name: " + citem.getName());
          }
      }
      catch(Exception e) {
          e.printStackTrace();
      }
   }
}