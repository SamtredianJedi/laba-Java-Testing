package interfaces;
import org.apache.logging.log4j.*;

public  class Person implements Showable{
	Logger demologger = LogManager.getLogger();
	public String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public void sayHello() {
		System.out.println("Hello");
		
	}
	
	

	@Override
	public void showInfo() {
		System.out.println("Name is " +this.name);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

}
