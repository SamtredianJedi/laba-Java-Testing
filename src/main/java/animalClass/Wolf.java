package animalClass;
import org.apache.logging.log4j.*;
public class Wolf {
	private static Logger demologger = LogManager.getLogger();
	
	 public Wolf(String animalName, int quality,
	    		int weight,
	    		int width,
	    		int quantity,
	    		int price,
	    		int height,
	    		int age) {
	        super();
	    }
	    public void makeRun(){
	        System.out.println("AnimalClass.Wolf Runs");
	    }
	    
	    public void makeBreath(){
	        System.out.println("Wolf runs");
	    }
	    public void makeHeal(){
	        System.out.println("Wolf Heals");
	    }
	    public void makeEat(){
	        System.out.println("Wolf eating");
	    }
	    public void makeRest(){
	        System.out.println("Wolf  heaving a rest ");
	    }
	    


	}

	
	





