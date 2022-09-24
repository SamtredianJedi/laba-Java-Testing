package reflection;
import org.apache.logging.log4j.*;

import numberOfUniqueWords.NumberOfUniqueWords;

import java.lang.Class;
import java.lang.reflect.*;
//declare a class Person with three constructors
class Person {
	private static final Logger LOGGER = LogManager.getLogger(Person.class);
   public Person() { }          //constructor with no parametes
   public Person(String name) { }   //constructor with 1 parameter
   private Person(String name, int age) {}  //constructor with 2 parameters
}
 
class Test {
	private static final Logger LOGGER = LogManager.getLogger(Test.class);
	
   public static void main(String[] args) {
      try {
           Person person = new Person(); 
           Class obj = person.getClass();
 
           // get array of constructors in a class using getDeclaredConstructor()
           Constructor[] constructors = obj.getDeclaredConstructors();
 
            
           LOGGER.info("Constructors for Person Class:");
           for(Constructor c : constructors) {
           // get names of constructors
               LOGGER.info("Constructor Name: " + c.getName());
 
           // get access modifier of constructors
               int modifier = c.getModifiers();
               LOGGER.info ("Modifier: " + Modifier.toString(modifier) + "  ");
 
           // get the number of parameters in constructors
               LOGGER.info("Parameters: " + c.getParameterCount());
             
            //if there are parameters, get parameter type of each parameter 
            if(c.getParameterCount() > 0){   
                Class[] paramList=c.getParameterTypes();
                LOGGER.info ("Constructor parameter types :"); 
        for (Class class1 : paramList) { 
        	LOGGER.info(class1.getName() +"  ");
        }
            }
            LOGGER.info("\n");
          }
       }
       catch(Exception e) {
           e.printStackTrace();
       }
    }
}