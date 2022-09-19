package enums;
import org.apache.logging.log4j.*;

public enum Colors {
	Colour,Black,White,Purple,Brown,Yellow,Red,Blue,Pink,Green,Violet;
	private static Logger demologger = LogManager.getLogger();

	public String getColour() {

	    
	    switch(this) {
	      case White:
	        return "1";

	      case Black:
	        return "2";

	      case Purple:
	        return "3";

	      case Yellow:
	        return "4";
	      case Red:
		    return "5";

		  case Blue:
		  return "6";

		  case Pink:
	      return "7";

		  case Green:
	      return "8";
		   case Violet:
	       return "9";

		   case Brown:
			return "10";

			 

	      default:
	        return null;
	      }
	   }

	  
	    
	    
	  }
	


