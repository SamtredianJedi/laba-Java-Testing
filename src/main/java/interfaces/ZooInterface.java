package interfaces;
import org.apache.logging.log4j.*;
import animalClass.Dog;
public interface ZooInterface {
	Logger demologger = LogManager.getLogger();
	
	
 public int getcost();
 public default String getAnimalName() {
        return getAnimalName();
    }

    public default String getAnimalType() {
        return getAnimalType();
    }
   
}
