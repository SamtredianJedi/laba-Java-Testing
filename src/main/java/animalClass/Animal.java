package animalclass;

import org.apache.logging.log4j.*;

import java.util.Objects;



public abstract class  Animal  {
	private static final Logger LOGGER = LogManager.getLogger(Animal.class);
    private String animalName;
    private String animalType;
    private int age;
    private int weight;
    private int width;
    private int price ;
    private int quality  ;
    private int height  ;

    public Animal(String animalName, String animalType, 
    		int height,
    		int quality, 
    		int price, int age, int width, int weight)
    {
    	
        this.animalType = animalType;
        this.animalName = animalName;
        this.weight = weight;
        this.age = age;
        this.width = width;  
        this.price = price;
        this.quality = quality;
        this.height = height;
    }
    public Animal(String animalName, int width, int weight, int age, int quality, int height, int price){
        this.animalName = animalName;
        this.width = width;
        this.weight = weight;
        this.age = age; 
        this.price = price;
        this.quality = quality;
        this.height = height;
    }

    //Getters
    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getWidth() {
        return width;
    }    
    public int getPrice() {
    	return price;
    }
    public int getQuality() {
    	return quality;
    }
    
    public int getHeight() {
    	return height;
    }
    //Setters

    public void setAge(int age) {
        this.age = age;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    //animal Actions
    public void makeRun(){
        LOGGER.info("make run");
    }
    public void makeBreath(){
        LOGGER.info("make Breath");
    }
    public void makeHeal(){
      LOGGER.info("make Heal");
    }
    public void makeEat(){
        LOGGER.info("eat");
    }
    public void makeRest(){
        LOGGER.info("have a rest");
    }
    
    


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && height == animal.height && quality == animal.quality && weight == animal.weight && price == animal.price && width == animal.width && Objects.equals(animalName, animal.animalName) && Objects.equals(animalType, animal.animalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, animalType, age, weight, width,price,quality, height);
    }

    @Override
    public String toString() {
        return "animalclass.Animal Name: " + animalName
                + "\nanimalclass.Animal Type: " + animalType
                + "\nanimalclass.Animal Weight: " + weight
                + "\nanimallass.Animal Age: " + age
        		+ "\nanimalclass.Animal Width: " + width 		
        		+ "\nanimalclass.Animal Price: " + price
        		+ "\nanimalclass.Animal Quality: " + quality
        		+ "\nanimalclass.Animal Height: " + height;
        
    }
}
