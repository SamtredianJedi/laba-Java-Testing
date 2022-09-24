package multithreading;
import org.apache.logging.log4j.*;

import animalclass.Animal;

public class  Threads {
	private static final Logger LOGGER = LogManager.getLogger(Threads.class);
	
	public static void main (String[] args) {
		
		for (int i= 0; i <=3; i++) {
			MultiThreadsThing name = new MultiThreadsThing();
			name.start();
		}
	}
	
	

	
		
	}


