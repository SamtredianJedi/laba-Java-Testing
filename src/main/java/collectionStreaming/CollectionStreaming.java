package collectionStreaming;
import org.apache.logging.log4j.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectionStreaming {
	
	public static void main (String[] args) {
		Logger demologger = LogManager.getLogger();
		
		
		List<String> items = new ArrayList<String>();

		items.add("one");
		items.add("two");
		items.add("three");
		items.add("four");
		items.add("five");
		items.add("six");
		items.add("seven");
		items.add("eight");
		items.add("nine");
		items.add("ten");

		Stream<String> stream = items.stream();
		
		stream.filter( item -> item.startsWith("o") ); // Stream.filter() method

		items.stream()   // Stream.map() method
	     .map( item -> item.toUpperCase() );
		
		
		
		List<String> filtered = items.stream() // Stream.collect() method
			    .filter( item -> item.startsWith("o") )
			    .collect(Collectors.toList());
		
		 String shortest = items.stream()  //  Stream.min() method
			        .min(Comparator.comparing(item -> item.length()))
			        .get();
		 
		 
		 long count = items.stream()  // Stream.count()
			     .filter( item -> item.startsWith("t"))
			     .count();
		 
		 String reduced2 = items.stream()  // Stream.reduce()
			        .reduce((acc, item) -> acc + " " + item)
			        .get();
		 
		 
		 String reduced = items.stream()
			        .reduce("", (acc, item) -> acc + " " + item);
		 
		 String reduced3 = items.stream() // Combining the reduce() method with the filter() 
				    .filter( item -> item.startsWith("o"))
				    .reduce("", (acc, item) -> acc + " " + item);

	}

}
