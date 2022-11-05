package animalclass;

import org.apache.logging.log4j.*;
public class Cow extends Animal {
	private static final Logger LOGGER = LogManager.getLogger(Cow.class);

    public Cow(String animalName, int quality,int weight,int width,int price,int height,int age) {
        super(animalName, weight,price, age, height, price, age);
    }
    
   

	@Override
    public void makeRun(){
        LOGGER.info("animalclass.Cow Runs");
    }
    
    public void makeBreath(){
        LOGGER.info("Cow runs");
    }
    public void makeHeal(){
        LOGGER.info("Cow Heals");
    }
    public void makeEat(){
        LOGGER.info("Cow eating");
    }
    public void makeRest(){
        LOGGER.info("Cow heaving a rest ");
    }
    


}
