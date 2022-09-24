package lambdaFunctions;
import org.apache.logging.log4j.*;

import multithreading.MultiThreadsThing;

public class LambdaGenerics {
	
	private static final Logger LOGGER = LogManager.getLogger(LambdaGenerics.class);
	
		
	
	
	interface MyGeneric<T> {
		   T compute(T t);
		}
	
	
		public static class LambdaGenericFuncInterfaceTest {
		    {
		    	
		      MyGeneric<String> reverse = (str) -> {   // Lambda Expression
		         String result = "";
		         for(int i = str.length()-1; i >= 0; i--)
		            result += str.charAt(i);
		         return result;
		         };
		      MyGeneric<Integer> factorial = (Integer n) -> {   // Lambda Expression
		         int result = 1;
		         for(int i=1; i <= n; i++)
		            result = i * result;
		         return result;
		      };
		      LOGGER.info(reverse.compute("Lambda Generic Functional Interface"));
		      LOGGER.info(factorial.compute(7));
		      
		   }
		}
	
}
