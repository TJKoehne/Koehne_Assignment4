//Thomas Koehne 3-29-20

package problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter {

	//The array list contains the input from file
	//The hash map contains the unique words and their count
	HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
	
	public void count(String dataFile) {
		
		File inputFile = new File(dataFile);
		String nextInput = new String();
		
		//Try/catch that imports the text from a file word by word
		//Each line imported is then added to the hashmap if new and counted if already existing
		try (Scanner input = new Scanner(inputFile)){
			while(input.hasNext()) {
				nextInput = input.next().toLowerCase().replaceAll("\\p{Punct}", "");
				if (! (nextInput.isEmpty())) {
					if (wordCounter.containsKey(nextInput)){
						wordCounter.put(nextInput, wordCounter.get(nextInput) + 1);
					} else {
						wordCounter.put(nextInput, 1);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found please try again");
			System.exit(0);
		}
	}
	
	public void write(String outputFile) {
		
		//Try/catch that writes the unique words to output file
		//Overwrites the file or creates a new one if none exist
		try (PrintWriter output = new PrintWriter(outputFile);) {
			for (String word: wordCounter.keySet()) {
				output.println(word + " " + wordCounter.get(word));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found please try again");
			System.exit(0);
		}
	}	
}
