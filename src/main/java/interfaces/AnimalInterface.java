package interfaces;
import org.apache.logging.log4j.*;

public interface AnimalInterface {
	Logger demologger = LogManager.getLogger();
    public String getAnimalType();
    public String getAnimalName();
    public int getcost();
}
