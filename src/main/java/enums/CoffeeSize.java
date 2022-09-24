package enums;
import org.apache.logging.log4j.*;




	public enum CoffeeSize {
		

	    BIG(8), LARGE(10),HUGE(12),OVERWHELMING();
	    private int ounces ;
	    private static final Logger LOGGER = LogManager.getLogger(CoffeeSize.class);

	    static {
	        LOGGER.info("static block ");
	    }
	    static 
	    {
	        LOGGER.info("instance block");
	    }

	    private CoffeeSize(int ounces){
	        this.ounces = ounces;
	        System.out.println(ounces);
	    }
	    private CoffeeSize(){
	        this.ounces = 20;
	        System.out.println(ounces);
	    }

	    public int getOunces() {
	        return ounces;
	    }
	} 


