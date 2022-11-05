package animalclass;

import org.apache.logging.log4j.*;
public class Main {
	private final static Logger LOGGER= LogManager.getLogger(Main.class);
	
    public static void main(String[] args) {
    	
        
        Dog d=new Dog();
        d.ExistsIn("samtredia","qutaisi");
        LOGGER.info(d);
        
        Cat c=new Cat();
        c.ExistsIn("samtredia","qutaisi");
        LOGGER.info(c);
        

        Lion L=new Lion();
        L.ExistsIn("samtredia","qutaisi");
        LOGGER.info(L);
        

        Wolf W=new Wolf();
        W.ExistsIn("samtredia","qutaisi");
        LOGGER.info(W);
        

        
        
        	
        

    }
	
}
