package reflection;

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
   //define interface method display  
   public void display() {
      System.out.println("This is a PetAnimal::Dog");
   }
 
   //define interface method makeSound    
   public void makeSound() {
      System.out.println("Dog makes sound::Bark bark");
   }
}
class Test1 {
  public static void main(String[] args) {
      try {
          // create an object of Dog class
          Dog dog = new Dog();
          // get class object
          Class obj = dog.getClass();
          // get the interfaces implemented by Dog
          Class[] objInterface = obj.getInterfaces();
          System.out.println("Class Dog implements following interfaces:");
          //print all the interfaces implemented by class Dog
          for(Class citem : objInterface) {
              System.out.println("Interface Name: " + citem.getName());
          }
      }
      catch(Exception e) {
          e.printStackTrace();
      }
   }
}