package reflection;
import org.apache.logging.log4j.*;

import java.lang.Class;
import java.lang.reflect.*;
//declare a class Person with three constructors
class Person {
	Logger demologger = LogManager.getLogger();
   public Person() { }          //constructor with no parameters
   public Person(String name) { }   //constructor with 1 parameter
   private Person(String name, int age) {}  //constructor with 2 parameters
}
 
class Test {
   public static void main(String[] args) {
      try {
           Person person = new Person(); 
           Class obj = person.getClass();
 
           // get array of constructors in a class using getDeclaredConstructor()
           Constructor[] constructors = obj.getDeclaredConstructors();
 
            
    System.out.println("Constructors for Person Class:");
           for(Constructor c : constructors) {
           // get names of constructors
               System.out.println("Constructor Name: " + c.getName());
 
           // get access modifier of constructors
               int modifier = c.getModifiers();
               System.out.print ("Modifier: " + Modifier.toString(modifier) + "  ");
 
           // get the number of parameters in constructors
               System.out.println("Parameters: " + c.getParameterCount());
             
            //if there are parameters, get parameter type of each parameter 
            if(c.getParameterCount() > 0){   
                Class[] paramList=c.getParameterTypes();
         System.out.print ("Constructor parameter types :"); 
        for (Class class1 : paramList) { 
            System.out.print(class1.getName() +"  ");
        }
            }
    System.out.println("\n");
          }
       }
       catch(Exception e) {
           e.printStackTrace();
       }
    }
}