package animalClass;

public class Cat extends Animal{
	 public Cat(String animalName, int quality,
	    		int weight,
	    		int width,
	    		int quantity,
	    		int price,
	    		int height,
	    		int age) {
	        super(animalName, weight,price, quantity, width, height, age, age);
	    }
	    @Override
	    public void makeRun(){
	        System.out.println("AnimalClass.Cat Runs");
	    }
	    
	    public void makeBreath(){
	        System.out.println("Cat runs");
	    }
	    public void makeHeal(){
	        System.out.println("Cat Heals");
	    }
	    public void makeEat(){
	        System.out.println("Cat eating");
	    }
	    public void makeRest(){
	        System.out.println("Cat  heaving a rest ");
	    }
	    


	}

	
	


