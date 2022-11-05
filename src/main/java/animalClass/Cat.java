package animalclass;

import org.apache.logging.log4j.*;

public class Cat { 
	private static final Logger LOGGER = LogManager.getLogger(Cat.class);
	
	 public Cat(String animalName, int quality,	int weight,	int width,	int price,	int height,	int age)
	 {
	        super();
	    }
	 

		

		public Cat() {
		// TODO Auto-generated constructor stub
	}




		public void makeRun(){
	        LOGGER.info("AnimalClass.Cat Runs");
	    }
	    
	    public void makeBreath(){
	        LOGGER.info("Cat runs");
	    }
	    public void makeHeal(){
	        LOGGER.info("Cat Heals");
	    }
	    public void makeEat(){
	        LOGGER.info("Cat eating");
	    }
	    public void makeRest(){
	        LOGGER.info("Cat  heaving a rest ");
	    }


		public void ExistsIn(String string, String string2) {
			// TODO Auto-generated method stub
			
		}
	    

	    
	}

	
	


