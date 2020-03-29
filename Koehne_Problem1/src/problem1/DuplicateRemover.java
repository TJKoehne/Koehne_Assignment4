package problem1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DuplicateRemover {

	ArrayList<String> fileContent = new ArrayList<String>();
	
	public void remove (String dataFile) {
		File inputFile = new File(dataFile);
		try (Scanner input = new Scanner(inputFile)){
			while(input.hasNext()) {
				fileContent.add(input.next());
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found please try again");
		} 
		
		for(int i = 0; i < fileContent.size(); i++) {
			System.out.print(fileContent.get(i) + "\n");
			
		}
	}
	
	public void write (String outputFile) {
		
	}
}

/* 
 * if (inputFile.isFile()) {
			System.out.println("file exist");
		} else {
			System.out.println("file doesn't exist");
		}
 * 
 */
