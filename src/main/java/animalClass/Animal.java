package animalClass;

import org.apache.logging.log4j.*;

import java.util.Objects;



public abstract class  Animal  {
	private static Logger demologger = LogManager.getLogger();
    private String animalName;
    private String animalType;
    private int age = 0;
    private int weight = 0;
    private int width = 0;
    private int quantity = 0;
    private int price = 0;
    private int quality = 0;
    private int height = 0;

    public Animal(String animalName, String animalType, 
    		int height,
    		int quality, 
    		int price, int age, int width, int weight, int quantity)
    {
    	
        this.animalType = animalType;
        this.animalName = animalName;
        this.weight = weight;
        this.age = age;
        this.width = width;
        this.quantity = quantity;
        this.price = price;
        this.quality = quality;
        this.height = height;
    }
    public Animal(String animalName, int width, int weight, int age, int quality, int height, int price, int quantity	){
        this.animalName = animalName;
        this.width = width;
        this.weight = weight;
        this.age = age;
        this.quantity = quantity;
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

    public int getQuantity() {
    	return quantity;
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

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        System.out.println("make run");
    }
    public void makeBreath(){
        System.out.println("make Breath");
    }
    public void makeHeal(){
        System.out.println("make Heal");
    }
    public void makeEat(){
        System.out.println("eat");
    }
    public void makeRest(){
        System.out.println("have a rest ");
    }
    
    


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && height == animal.height && quality == animal.quality && weight == animal.weight && price == animal.price && quantity == animal.quantity && width == animal.width && Objects.equals(animalName, animal.animalName) && Objects.equals(animalType, animal.animalType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(animalName, animalType, age, weight, width,quantity,price,quality, height);
    }

    @Override
    public String toString() {
        return "AnimalClass.Animal Name: " + animalName
                + "\nAnimalClass.Animal Type: " + animalType
                + "\nAnimalClass.Animal Weight: " + weight
                + "\nAnimalClass.Animal Age: " + age
        		+ "\nAnimalClass.Animal Width: " + width
        		+ "\nAnimalClass.Animal Quantity: " + quantity
        		+ "\nAnimalClass.Animal Price: " + price
        		+ "\nAnimalClass.Animal Quality: " + quality
        		+ "\nAnimalClass.Animal Height: " + height;
        
    }
}
