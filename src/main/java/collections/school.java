package collections;

import org.apache.logging.log4j.*;

//a Collections using sort() method

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


class School {
	private static Logger demologger = LogManager.getLogger();
 
 
 {
	 
     // Creating a list
     // Declaring object of string type
     List<String> items = new ArrayList<>();

     // Adding elements to the list
     // using add() method
     items.add("Rooms");
     items.add("Floors");

     // Adding one or more elements using addAll()
     Collections.addAll(items, "Windows", "Chairs", "Curtains");

     // Sorting according to default ordering
     // using sort() method
     Collections.sort(items);

     // Printing the elements
     for (int i = 0; i < items.size(); i++) {
         System.out.print(items.get(i) + " ");
     }

     System.out.println();

     // Sorting according to reverse ordering
     Collections.sort(items, Collections.reverseOrder());

     // Printing the reverse order
     for (int i = 0; i < items.size(); i++) {
         System.out.print(items.get(i) + " ");
     }
 }
}