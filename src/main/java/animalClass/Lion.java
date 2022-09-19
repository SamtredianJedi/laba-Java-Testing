package animalClass;
import org.apache.logging.log4j.*;

public class Lion {
	private static Logger demologger = LogManager.getLogger();
	
	
	 public Lion(String animalName, int quality,
	    		int weight,
	    		int width,
	    		int quantity,
	    		int price,
	    		int height,
	    		int age) {
	        super();
	    }
	    public void makeRun(){
	        System.out.println("AnimalClass.Lion Runs");
	    }
	    
	    public void makeBreath(){
	        System.out.println("Lion runs");
	    }
	    public void makeHeal(){
	        System.out.println("Lion Heals");
	    }
	    public void makeEat(){
	        System.out.println("Lion eating");
	    }
	    public void makeRest(){
	        System.out.println("Lion  heaving a rest ");
	    }
	    


	}

	
	





