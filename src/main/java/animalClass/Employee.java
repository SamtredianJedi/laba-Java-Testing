package animalClass;

public class Employee {

    public void feedAnimals(Animal animal){
        System.out.println("AnimalClasses.Animal " + animal.getAnimalName() + " Animal Has been fed");
    }

    
    
    
    public void SalaryOut(){
        System.out.println("Takes out money from the Bank");
    }


    public void cashIn() {
        System.out.println("Puts The Money in the bank");
    }
    
    
    
    @Override
    public String toString() {
        String name = null;
		return name;
    }
   

}