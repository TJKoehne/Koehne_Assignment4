//Thomas Koehne 3-29-20

package problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {

	//This array list takes the stores the unique new inputs from the file
	ArrayList<String> uniqueWords = new ArrayList<String>();
	
	public void remove (String dataFile) {
		
		File inputFile = new File(dataFile);
		String nextInput = new String();
		
		//Try catch that imports the text from a file by word into a string
		//Then if unique its added to the array list
		try (Scanner input = new Scanner(inputFile)){
			while(input.hasNext()) {
				nextInput = input.next().toLowerCase().replaceAll("\\p{Punct}", "");
				if (!nextInput.isEmpty()) {
					if (!uniqueWords.contains(nextInput)) {
						uniqueWords.add(nextInput);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found please try again");
			System.exit(0);
		}
	}
	
	public void write (String outputFile) {
				
		//Try catch that writes the unique words to output file
		try (FileWriter output = new FileWriter(outputFile);) {
			for (int i = 0; i < uniqueWords.size(); i++) {
				output.write(uniqueWords.get(i) + "\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found please try again");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("IOException please try again");
			System.exit(0);
		}
	}
}


