package enums;

import org.apache.logging.log4j.*;


	



public enum Direction {
	
		
		
		    // enum fields
		    EAST(0) {
		    	private final Logger LOGGER = LogManager.getLogger(Direction.class);
		        @Override
		        public String printDirection() {
		            String message = "You are moving in east. You will face sun in morning time";
		            return message;
		        }
		    },
		    WEST (90){
		        @Override
		        public String printDirection() {
		            String message = "You are moving in west. You will face sun in evening time";
		            return message;
		        }
		    },
		    NORTH(180) {
		        @Override
		        public String printDirection() {
		            String message = "You are moving in north. You will face head in daytime";
		            return message;
		        }
		    },
		    SOUTH(270) {
		        @Override
		        public String printDirection() {
		            String message = "You are moving in south. Sea ahead";
		            return message;
		        }
		    };
		 
		    private int angle;

			public abstract String printDirection();{
		}
		
		
	 
	    // constructor
	    private Direction(final int angle) {
	        this.angle = angle;
	    }
	 
	    // internal state
	    
	 
	    public int getAngle() {
	        return angle;
	    }
	    
	    }
	    


	

