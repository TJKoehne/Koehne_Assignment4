package problem1;

public class Application {

	//File names to be used in the program
	static final String INPUT_FILE_NAME = new String("problem1.txt");
	static final String OUTPUT_FILE_NAME = new String("unique_words.txt");
	
	public static void main(String[] args) {
		
		DuplicateRemover duplicateRemover = new DuplicateRemover();
		
		duplicateRemover.remove(INPUT_FILE_NAME);
		duplicateRemover.write(OUTPUT_FILE_NAME);
		
		System.out.println("Application Complete: Unique Words Generated.");
		
	}

}
