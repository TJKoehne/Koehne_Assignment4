//Thomas Koehne 3-29-20

package problem2;

public class Application {

	//File names to be used in the program
	static final String INPUT_FILE_NAME = new String("problem2.txt");
	static final String OUTPUT_FILE_NAME = new String("unique_word_counts.txt");
	
	public static void main(String[] args) {
		
		DuplicateCounter duplicateCounter = new DuplicateCounter();
		
		duplicateCounter.count(INPUT_FILE_NAME);
		duplicateCounter.write(OUTPUT_FILE_NAME);
		
		System.out.println("Application Complete: Unique Word Counts Generated.");
		
	}
}