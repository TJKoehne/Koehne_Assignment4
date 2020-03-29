package problem1;

public class Application {

	static String INPUT_FILE_PATH = new String("problem1.txt");
	static String OUTPUT_FILE_PATH = new String("unique_words.txt");
	
	public static void main(String[] args) {
		DuplicateRemover dr1 = new DuplicateRemover();
		dr1.remove(INPUT_FILE_PATH);
		dr1.write(OUTPUT_FILE_PATH);
		
	}

}
