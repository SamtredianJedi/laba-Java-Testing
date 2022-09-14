package animalClass;



import java.util.ArrayList;

public class Avaries  {
    private ArrayList<Animal> animals = new ArrayList<>();
    final private int area;
    final private String animalType;
    private int animalQuantity = 0;

    public Avaries(int area, ArrayList<Animal> animals, String animalType){
        this.area = area;
        this.animals = animals;
        this.animalType = animalType;
        this.animalQuantity = animals.size();
    }

    //Constructor in case of having empty vivaria
    public Avaries(int area, String animalType){
        this.area = area;
        this.animalType = animalType;
    }

    //Getters

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public String getAnimalType() {
        return animalType;
    }

    public int getAnimalQuantity() {
        return animalQuantity;
    }

    public void setAnimalQuantity(int animalQuantity) {
        this.animalQuantity = animalQuantity;
    }


    public int getArea() {
        return area;
    }
    public int getPrice(){
        int result = 0;
        for(Animal a : animals){
            result += a.getPrice();
        }
        return result;
    }

    //Set AnimalClasses.Animal
    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    
    public static int size() {
		// TODO Auto-generated method stub
		return 0;
	}  
	

    //Remove animal from vivarium

    public boolean removeAnimal(Animal animal){
        if(animalQuantity == 0) {
            System.out.println("Error!! No Animals In AnimalClasses.Vivarium");
            return false;
        }
        if (animals.remove(animal)) {
            animalQuantity--;
            return true;
        }
        return false;
    }

    //Add animal to Avaries
    public void addAnimal(Animal animal){
        if(animal.getAnimalType() != animalType){
            System.out.println("Can't Place Different Animals in Same AnimalClasses.Vivarium");
            return;
        }
        animals.add(animal);
        animalQuantity++;
    }

    @Override
    public String toString(){
        String result = "AnimalClasses.Vivarium Area: " + area + "\nList Of Animals: \n\n";
        for (Animal animal : animals) {
            result += "AnimalClasses.Animal Name: " + animal.getAnimalName()
                    + "\nAnimalClasses.Animal Type: " + animal.getAnimalType()
                    + "\n ----------------\n";
        }
        return result;
    }

}
