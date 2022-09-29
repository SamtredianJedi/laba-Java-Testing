package animalclass;
import org.apache.logging.log4j.*;

public class Main {
	private static final Logger LOGGER = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        new Dog(null, 0, 0, 0, 0, 0, 0, 0);
        new Cat(null, 0, 0, 0, 0, 0, 0);
        new Cow(null, 0, 0, 0, 0, 0, 0);
        new Lion(null, 0, 0, 0, 0, 0, 0);
        new Wolf(null, 0, 0, 0, 0, 0, 0);

    }
	public static Logger getLogger() {
		return LOGGER;
	}
}
