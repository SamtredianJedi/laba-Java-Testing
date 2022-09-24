package lambdaFunctions;
import org.apache.logging.log4j.*;

import multithreading.MultiThreadsThing;

// Template functional interface IFindItem
interface IFindItem<T> {
  // a method that calculates the number of occurrences
  // of a given element in an array of numbers
  int Search(T item, T[] items);
}

// A class that contains methods that implement
// a lambda expression and tests the operation of the program.
public class Lambda {
	private static final Logger LOGGER = LogManager.getLogger(Lambda.class);

   {
    // 1. Declare a functional interface reference for type String
    IFindItem<String> ref;

    // 2. Define lambda expression
    ref = (item, items) -> {
      int count=0;
      for (int i=0; i<items.length; i++)
        if (item==items[i])
          count++;
      return count;
    };

    // 3. Create array of strings
    String[] AS = { "abc", "abd", "def", "acf", "abc", "afx" };

    // 4. Test lambda expression
    int count = ref.Search("abc", AS);
    LOGGER.info("count = " + count); // count = 2
  }
}