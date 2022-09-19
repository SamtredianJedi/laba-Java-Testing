package collections;

import org.apache.logging.log4j.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;






public class Collections {
	 {
		 Logger demologger = LogManager.getLogger();
		// it is only for String Objects
		ArrayList<String> list1 = new ArrayList<String>();
		
		// it is for any type of object
		
		ArrayList<Object> list2 = new ArrayList<Object>();
		
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
		
		System.out.println("list1 is: "+list1);
		System.out.println("list2 is: "+list2);
		
		// Getting element from the list
		
		String name = list1.get(2);
		System.out.println("name is: "+name);
		
		Object O = list2.get(2);
		System.out.println("O is : " + O );
		
		// Update element in list 
		
		list1.set(2, "Rezo");
		System.out.println("list now is: "+list1);
		
		
		// Remove element from the list 
		list1.remove(2);
		System.out.println("list1 after remove is: "+list1);
		
		
		if(list1.contains("John")) {
			System.out.println("Rezo is in the list");
		}
		
		
		// Iterate in ArrayList
		System.out.println("iterating ArrayList With for loop");
		 for(int i=0; i<list1.size();i++) {
			 System.out.println(list1.get(i));
		 }
		 System.out.println("=========");
		 
		 System.out.println("iterating wiwth enhanced for loop");
		 for(String str : list1) {
			 System.out.println(str);
		 }
		 System.out.println("=========");
		 
		 System.out.println("iterating with iterator");
		 Iterator<String> itr = list1.iterator();
		 System.out.println(itr.next());
		 System.out.println(itr.next());
		 System.out.println(itr.next());
		
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
			if(str.equals("Sandro")) {
				itr.remove();
			}
		}
		System.out.println("===========");
		
		System.out.println("list1 afrer iteration is: "+list1);
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		
		for(int i=10;i>0;i++) {
			queue.add(i);
		}
		
		// Queue: (Front) 10 9 8 7 6 5 5 4 3 2 1 
		// PriorityQueue sorts the data for us 
		// Queue: (Front) 1 2 3 4 5 6 7 8 9 10 | Sorted Queue The Actual One
		
		
		// Peeking -> Obtaining the head Of Queue
		// Poiling -> Remove the head of Queue
		
		System.out.println("Queue Size is: "+queue.size());
		System.out.println("Head of Queue is: "+queue.peek()); // Head of Queue
		
		queue.poll(); // Removing the head 1
		System.out.println("Queue Size After Poll is: "+queue.size());
		
		System.out.println("Head of Queue is: "+queue.peek()); // New Head Of Queue : 2
		
		
		
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
		
		System.out.println("set is: "+set);
		
		Iterator<String> itr1 = set.iterator();
		while(itr.hasNext()) {
			String str = itr.next();
			System.out.println(str);
		}
		
		set.remove("Leqso");
		System.out.println("set afer removing Leqso is: "+set);
		if(set.contains("John")) {
			System.out.println("John is in the set");
		}
		
		System.out.println("set size is "+set.size());
		
		
		
		
		
				
		
	}
	
	
	
	
	

}