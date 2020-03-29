package problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {

	//The Two array list containing all the information from the input
	//and the information going to the output
	ArrayList<String> fileContent = new ArrayList<String>();
	ArrayList<String> uniqueWords = new ArrayList<String>();
	
	public void remove (String dataFile) {
		
		File inputFile = new File(dataFile);
		
		//Try catch that imports the text from a file into an ArrayList
		try (Scanner input = new Scanner(inputFile)){
			while(input.hasNext()) {
				fileContent.add(input.next().toLowerCase().replaceAll("\\p{Punct}", ""));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found please try again");
			System.exit(0);
		}
		
		//For loop checking if a word is unique before adding it to the output array list
		for(int i = 0; i < fileContent.size(); i++) {
			if (!uniqueWords.contains(fileContent.get(i))) {
				uniqueWords.add(fileContent.get(i));
			}
		}
	}
	
	public void write (String outputFile) {
				
		//Try catch that writes the unique words to output file
		try (PrintWriter output = new PrintWriter(outputFile);) {
			for (int i = 0; i < uniqueWords.size(); i++) {
				output.println(uniqueWords.get(i));
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found please try again");
			System.exit(0);
		}
	}
}


