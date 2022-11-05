package animalclass;
import org.apache.logging.log4j.*;

public class Dog {
	private static final Logger LOGGER = LogManager.getLogger(Dog.class);

	
	public Dog(String animalName, int quality,	int weight,	int width,	int quantity,	int price,	int height,int age) {
        super();
    }
    public Dog() {
		// TODO Auto-generated constructor stub
	}
	public void makeRun(){
        LOGGER.info("AnimalClass.Dog Runs");
    }
    
    public void makeBreath(){
        LOGGER.info("Dog runs");
    }
    public void makeHeal(){
        LOGGER.info("Dog Heals");
    }
    public void makeEat(){
        LOGGER.info("Dog eating");
    }
    public void makeRest(){
        LOGGER.info("Dog  heaving a rest ");
    }
	public void ExistsIn(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	

}







