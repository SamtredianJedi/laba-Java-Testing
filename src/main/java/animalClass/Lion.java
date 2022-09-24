package animalclass;
import org.apache.logging.log4j.*;

public class Lion {
	private static final Logger LOGGER = LogManager.getLogger(Lion.class);
	
	
	 public Lion(String animalName, int quality,int weight,int width, int price,int height,int age) {
	        super();
	    }
	    public void makeRun(){
	        LOGGER.info("animalclass.Lion Runs");
	    }
	    
	    public void makeBreath(){
	        LOGGER.info("Lion runs");
	    }
	    public void makeHeal(){
	        LOGGER.info("Lion Heals");
	    }
	    public void makeEat(){
	        LOGGER.info("Lion eating");
	    }
	    public void makeRest(){
	        LOGGER.info("Lion  heaving a rest ");
	    }
	    


	}

	
	





