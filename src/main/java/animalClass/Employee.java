package animalclass;
import org.apache.logging.log4j.*;

public class Employee {
	private static final Logger LOGGER = LogManager.getLogger(Employee.class);

    public void feedAnimals(Animal animal){
        LOGGER.info("animalclass.Animal " + animal.getAnimalName() + " Animal Has been fed");
    }

    
    
    public void SalaryOut(){
        LOGGER.info("Takes out money from the Bank");
    }


    public void cashIn() {
        LOGGER.info("Puts The Money in the bank");
    }
    
    
    
    @Override
    public String toString() {
        String name = null;
		return name;
    }
   

}
