package animalclass;

import org.apache.logging.log4j.*;

public class Cat extends Animal{ 
	private static final Logger LOGGER = LogManager.getLogger(Cat.class);
	 public Cat(String animalName, int quality,	int weight,	int width,	int price,	int height,	int age)
	 {
	        super(animalName, weight,price,width, height, age, age);
	    }
	 

		@Override
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
	    

	    
	}

	
	


