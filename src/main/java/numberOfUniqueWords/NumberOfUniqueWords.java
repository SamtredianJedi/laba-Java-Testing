//Java Program to Find the Number of Unique Words
package numberOfUniqueWords;
import org.apache.logging.log4j.*;
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class NumberOfUniqueWords {
	Logger demologger = LogManager.getLogger();
    // Function to calculate the number of unique words
    static int calculateNoOfUniqueWords(String str) {
        String[] words = str.split(" ");
        boolean[] array = new boolean[words.length];
        int j, i = 0;
        int count = 0;
        for (i = 0; i < words.length; i++) {
            if (!array[i]) {
                count++;
                for (j = i + 1; j < words.length; j++) {
                    if (words[j].compareTo(words[i]) == 0) {
                        array[j] = true;
                        count--;
                    }
                }
            }
        }
        return count;
    }
    // Function to read input and display the output
    public static void CountOFWords(String[] args) {
        BufferedReader br = new BufferedReader
                            (new InputStreamReader(System.in));
        String str;
        System.out.println("Enter the string");
        try {
            str = br.readLine();
        } catch (IOException e) {
            System.out.println("An I/O error occurred");
            return;
        }
        int count = calculateNoOfUniqueWords(str);
        System.out.println("Total number of unique words in \"" + 
                                         str + "\" are " + count);
    }
}

