package enums;
import org.apache.logging.log4j.*;


public enum WeekDays {
	THURSDAY, SUNDAY , MONDAY ,TUESDAY , WEDNESDAY ,FRIDAY , SATURDAY ;
	private final Logger LOGGER = LogManager.getLogger(WeekDays.class);

 
 
		public class EnumWithoutValues {

		 {
		    WeekDays weekdays = WeekDays.THURSDAY;
		    switch (weekdays) {
		    
		      case MONDAY:
		      LOGGER.info("Marketing Monday");
		      doYourTaskForWeekDays(weekdays);
		      break;
		      
		      		case TUESDAY:
		      		LOGGER.info("Trendy Tuesday");
		      		doYourTaskForWeekDays(weekdays);
		      		break;
		      		
		      			case WEDNESDAY:
		      			LOGGER.info("Wellness Wednesday");
		      			doYourTaskForWeekDays(weekdays);
		      			break;
		      			
		      				case THURSDAY:
		      				LOGGER.info("Thankful Thursday");
		      				doYourTaskForWeekDays(weekdays);
		      				break;
		      				
		      					case FRIDAY:
		      					LOGGER.info("Foodie Friday");
		      					doYourTaskForWeekDays(weekdays);
		      					break;
		      					
		      						case SATURDAY:
		      						LOGGER.info("Social Saturday");
		      						doYourTaskForWeekEnds();
		      						break;
		      						
		      							case SUNDAY:
		      							LOGGER.info("Sunday Funday");
		      							doYourTaskForWeekEnds();
		      							break;
			      
			    default:
			    	LOGGER.info("Please enter a valid day.");
			    	break;
		    }
		  }
		  
		  private void doYourTaskForWeekEnds() {
		    System.out.println("Relax and Enjoy It's Weekend )");
		  }

		  private void doYourTaskForWeekDays(WeekDays weekdays) {
		  System.out.println("Ohh! It's a weekday. Have to work");
		  }
		}
}


