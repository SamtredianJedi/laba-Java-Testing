package animalclass;
import org.apache.logging.log4j.*;
public class Wolf {
	private static final Logger LOGGER = LogManager.getLogger(Wolf.class);
	
	 public Wolf(String animalName, int quality, int weight,int width,int price,int height,int age) {
	       super();
	    }
	    public Wolf() {
		// TODO Auto-generated constructor stub
	}
		public void makeRun(){
	        LOGGER.info("animalclass.Wolf Runs"); 
	    }
	    
	    public void makeBreath(){
	        LOGGER.info("Wolf runs");
	    }
	    public void makeHeal(){
	        LOGGER.info("Wolf Heals");
	    }
	    public void makeEat(){
	        LOGGER.info("Wolf eating");
	    }
	    public void makeRest(){
	        LOGGER.info("Wolf  heaving a rest ");
	    }
		public void ExistsIn(String string, String string2) {
			// TODO Auto-generated method stub
			
		}
	    


	}

	
	





