package interfaces;
import org.apache.logging.log4j.*;

public  class Person implements IShowable{
	
	private static final Logger LOGGER = LogManager.getLogger(Person.class);
	
	
	public String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		LOGGER.info("Hello");
		
	}
	
	

	@Override
	public void showInfo() {
		LOGGER.info("Name is " +this.name);
	}

	@Override
	public void show() {
		LOGGER.info("show ");
		
	}

}
