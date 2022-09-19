package multithreading;
import org.apache.logging.log4j.*;

public class Threads {
	Logger demologger = LogManager.getLogger();
	public Threads(int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main (String[] args) {
		
		for (int i= 0; i <=3; i++) {
			Threads myThing = new Threads(i);
			myThing.start();
		}
	}

	private void start() {
		// TODO Auto-generated method stub
		
	}

}
