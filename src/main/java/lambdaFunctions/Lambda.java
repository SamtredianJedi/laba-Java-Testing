package lambdaFunctions;
import org.apache.logging.log4j.*;

// Template functional interface IFindItem
interface IFindItem<T> {
	Logger demologger = LogManager.getLogger();
  // a method that calculates the number of occurrences
  // of a given element in an array of numbers
  int Search(T item, T[] items);
}

// A class that contains methods that implement
// a lambda expression and tests the operation of the program.
public class Lambda {

  public static void main(String[] args) {
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
    System.out.println("count = " + count); // count = 2
  }
}