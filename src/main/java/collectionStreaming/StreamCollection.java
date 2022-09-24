package collectionstreaming;
import org.apache.logging.log4j.*;
//a simple program to demonstrate the use of stream in java
import java.util.*;
import java.util.stream.*;
  
class StreamCollection
{
	private static final Logger LOGGER = LogManager.getLogger(StreamCollection.class);
  public static void main(String args[])
  {
  
    // create a list of integers
    List<Integer> number = Arrays.asList(2,3,4,5);
  
    // demonstration of map method
    List<Integer> square = number.stream().map(x -> x*x).
                           collect(Collectors.toList());
   LOGGER.info(square);
  
    // create a list of String
    List<String> names =
                Arrays.asList("Reflection","Collection","Stream");
  
    // demonstration of filter method
    List<String> result = names.stream().filter(s->s.startsWith("S")).
                          collect(Collectors.toList());
    LOGGER.info(result);
  
    // demonstration of sorted method
    List<String> show =
            names.stream().sorted().collect(Collectors.toList());
    LOGGER.info(show);
  
    // create a list of integers
    List<Integer> numbers = Arrays.asList(2,3,4,5,2);
  
    // collect method returns a set
    Set<Integer> squareSet =
         numbers.stream().map(x->x*x).collect(Collectors.toSet());
    LOGGER.info(squareSet);
  
    // demonstration of forEach method
    number.stream().map(x->x*x).forEach(y->LOGGER.info(y));
  
    // demonstration of reduce method
    int even =
       number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
  
   LOGGER.info(even);
  }
}