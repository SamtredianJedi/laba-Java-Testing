package enums;
import org.apache.logging.log4j.*;




	public enum CoffeeSize {
		

	    BIG(8), LARGE(10),HUGE(12),OVERWHELMING();
	    private int ounces ;
	    private final Logger LOGGER = LogManager.getLogger(CoffeeSize.class);

	    

	    private CoffeeSize(int ounces){
	        this.ounces = ounces;
	        LOGGER.info(ounces);
	    }
	    private CoffeeSize(){
	        this.ounces = 20;
	        LOGGER.info(ounces);
	    }

	    public int getOunces() {
	        return ounces;
	    }
	} 


