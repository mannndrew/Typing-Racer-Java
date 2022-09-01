import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileInput {
	
	String workingDir = "";
	
	FileInput() {
		
		Path path = Paths.get("");

		workingDir = path.toAbsolutePath().toString();
		workingDir = workingDir + "\\TRResources";
	}
	
	int lineCount() {
		
		long lines = 0;
		
		Path path = Paths.get(workingDir + "\\sentenceBank.txt");
			
		try {
			lines = Files.lines(path).count();
		} 
			
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return (int) lines;
	}
	
	String[] readFile(int lines) {
		
		String sentenceBank[] = new String[lines];
		File file = new File(workingDir + "\\sentenceBank.txt"); 
		Scanner scan = null;
		
		int counter = 0;
		
		try {
			scan = new Scanner(file);
		} 

		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		while(scan.hasNextLine()) {
			sentenceBank[counter] = scan.nextLine();
			counter++;
		}
		
		return sentenceBank;
	}
}
