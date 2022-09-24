package multithreading;
import org.apache.logging.log4j.*;

public class MultiThreadsThing extends Thread{
	private static final Logger LOGGER = LogManager.getLogger(MultiThreadsThing.class);
	
	
	

	@Override
	public void run() {
		LOGGER.info("Text");
		
		
	}
}
