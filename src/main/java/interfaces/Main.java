package interfaces;
import org.apache.logging.log4j.*;

public class Main {
	Logger demologger = LogManager.getLogger();
	public static void main(String[] args) {
		Animal animal = new Animal(1);
		Person person = new Person("Rezo");
		animal.sleep();
		person.sayHello();
		animal.ShowInfo();
		person.showInfo();
		Cat cat = new Cat();
		
		
		
		
		
		
	}

}
