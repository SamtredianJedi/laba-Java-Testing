package animalClass;

import org.apache.logging.log4j.*;
public class Cow extends Animal {
	private static Logger demologger = LogManager.getLogger();

    public Cow(String animalName, int quality, 
    		int weight,
    		int width, 
    		int quantity,
    		int price,
    		int height,
    		int age) {
        super(animalName, weight,price, age, height, price, quantity, age);
    }
    @Override
    public void makeRun(){
        System.out.println("AnimalClasses.Cow Runs");
    }
    
    public void makeBreath(){
        System.out.println("Cow runs");
    }
    public void makeHeal(){
        System.out.println("Cow Heals");
    }
    public void makeEat(){
        System.out.println("Cow eating");
    }
    public void makeRest(){
        System.out.println("Cow heaving a rest ");
    }
    


}
