package interfaces;
import org.apache.logging.log4j.*;

public  class Animal implements Showable{
	Logger demologger = LogManager.getLogger();
	public int Id;
	
	public Animal(int id) {
		this.Id = id;
	}
	
	public void sleep () {
		System.out.println("I am sleeping");
	}
	
	
	
	
	
		public void ShowInfo() {
			System.out.println("id is "+this.Id);
		}
	

	public void Height() {
		
		
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
