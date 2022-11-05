package collections;

import org.apache.logging.log4j.*;

import animalclass.Zoo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;






public class Collections {
	
	private static final Logger LOGGER = LogManager.getLogger(Collections.class);
     public static void main(String[] args) {
    	 
		// it is only for String Objects
		List<String> list1 = new ArrayList<String>();
		
		// it is for any type of object
		
		List<Object> list2 = new ArrayList<Object>();
		
		Student s1 = new Student();
		s1.roll = 101;
		s1.name = "Rezo";
		
		//1. Adding Data in List
		
		list1.add("Rezo");       //0
		list1.add("Giorgi");     //1
		list1.add("Levani");	 //2
		list1.add("Luka");		 //3
		list1.add("Sandro");     //4
		list1.add("nika");		 //5
		//list1.add(10);   //error
		//list1.add(2.2);  //error
		
		
		list2.add("Rezo");
		list2.add(10);
		list2.add(2.2);
		list2.add(s1);
		
		LOGGER.info("list1 is: "+list1);
		LOGGER.info("list2 is: "+list2);
		
		// Getting element from the list
		
		String name = list1.get(2);
		LOGGER.info("name is: "+name);
		
		Object O = list2.get(2);
		LOGGER.info("O is : " + O );
		
		// Update element in list 
		
		list1.set(2, "Rezo");
		LOGGER.info("list now is: "+list1);
		
		
		// Remove element from the list 
		list1.remove(2);
		LOGGER.info("list1 after remove is: "+list1);
		
		
		if(list1.contains("John")) {
			LOGGER.info("Rezo is in the list");
		}
		
		
		// Iterate in ArrayList
		LOGGER.info("iterating ArrayList With for loop");
		 for(int i=0; i<list1.size();i++) {
			 LOGGER.info(list1.get(i));
		 }
		 LOGGER.info("=========");
		 
		 LOGGER.info("iterating wiwth enhanced for loop");
		 for(String str : list1) {
			 LOGGER.info(str);
		 }
		 LOGGER.info("=========");
		 
		 LOGGER.info("iterating with iterator");
		 Iterator<String> itr = list1.iterator();
		 LOGGER.info(itr.next());
		 LOGGER.info(itr.next());
		 LOGGER.info(itr.next());
		
		while(itr.hasNext()) {
			String str = itr.next();
			LOGGER.info(str);
			if(str.equals("Sandro")) {
				itr.remove();
			}
		}
		LOGGER.info("===========");
		
		LOGGER.info("list1 afrer iteration is: "+list1);
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i++) {
			queue.add(i);
		}
		
		// Queue: (Front) 10 9 8 7 6 5 5 4 3 2 1 
		// PriorityQueue sorts the data for us 
		// Queue: (Front) 1 2 3 4 5 6 7 8 9 10 | Sorted Queue The Actual One
		
		
		// Peeking -> Obtaining the head Of Queue
		// Poiling -> Remove the head of Queue
		
		LOGGER.info("Queue Size is: "+queue.size());
		LOGGER.info("Head of Queue is: "+queue.peek()); // Head of Queue
		
		queue.poll(); // Removing the head 1
		LOGGER.info("Queue Size After Poll is: "+queue.size());
		
		LOGGER.info("Head of Queue is: "+queue.peek()); // New Head Of Queue : 2
		
		
		
		HashSet<String> set = new HashSet<String>();
		
		// Data is not added as indexing approach
		// We got hashCodes for elements which are being added
		
		set.add("Rezo");
		set.add("Giorgi");
		set.add("Luka");
		set.add("Levani");
		set.add("Leqso");
		set.add("Gurami");
		set.add("Nika");
		set.add("Noe");
		
		// 1. Data is Unique, No Redundancy
		// 2. Data is unordered in output due to hashing
		
		LOGGER.info("set is: "+set);
		
		Iterator<String> itr1 = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			LOGGER.info(str);
		}
		
		set.remove("Leqso");
		LOGGER.info("set afer removing Leqso is: "+set);
		if(set.contains("John")) {
			LOGGER.info("John is in the set");
		}
		
		LOGGER.info("set size is "+set.size());
		
		
		
		
		
				
		
	}
	
	
	
	
	

}
