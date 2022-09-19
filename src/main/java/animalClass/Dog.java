package animalClass;
import org.apache.logging.log4j.*;

public class Dog {
	private static Logger demologger = LogManager.getLogger();

	
	public Dog(String animalName, int quality,
    		int weight,
    		int width,
    		int quantity,
    		int price,
    		int height,
    		int age) {
        super();
    }
    public void makeRun(){
        System.out.println("AnimalClass.Dog Runs");
    }
    
    public void makeBreath(){
        System.out.println("Dog runs");
    }
    public void makeHeal(){
        System.out.println("Dog Heals");
    }
    public void makeEat(){
        System.out.println("Dog eating");
    }
    public void makeRest(){
        System.out.println("Dog  heaving a rest ");
    }
	public static Logger getDemologger() {
		return demologger;
	}
	public static void setDemologger(Logger demologger) {
		Dog.demologger = demologger;
	}
    


}







