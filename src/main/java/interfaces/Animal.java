package interfaces;
import org.apache.logging.log4j.*;

public  class Animal implements IShowable{
	private static final Logger LOGGER = LogManager.getLogger(Animal.class);
	public int Id;
	
	public Animal(int id) {
		this.Id = id;
	}
	
	public void sleep () {
		LOGGER.info("I am sleeping");
	}
	
	
	
	
	
		public void ShowInfo() {
			LOGGER.info("id is "+this.Id);
		}
	

	public void Height() {
		LOGGER.info("The Height is: ");
		
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	

}
