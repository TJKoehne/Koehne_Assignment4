package problem2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DuplicateCounter {

	//The array list contains the input from file
	//The hash map contains the unique words and their count
	ArrayList<String> fileContent = new ArrayList<String>();
	HashMap<String, Integer> wordCounter = new HashMap<String, Integer>();
	
	public void count(String dataFile) {
		File inputFile = new File(dataFile);
		String nextInput = new String();
		//Try catch that imports the text from a file into an ArrayList
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
		
		//for loop to go through the input and see if the word is unique and count its appearances
		for (int i = 1; i < fileContent.size(); i++) {
			
		}
	}
	
	public void write(String outputFile) {
		
		//Try catch that writes the unique words to output file
		//Overwrites the file or creates a new one
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
