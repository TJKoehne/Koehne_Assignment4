package problem1;

public class Application {

	static String INPUT_FILE_NAME = new String("problem1.txt");
	static String OUTPUT_FILE_NAME = new String("unique_words.txt");
	
	public static void main(String[] args) {
		
		DuplicateRemover dr1 = new DuplicateRemover();
		
		dr1.remove(INPUT_FILE_NAME);
		dr1.write(OUTPUT_FILE_NAME);
		
		System.out.println("Application Complete: Unique Words Generated.");
	}

}
