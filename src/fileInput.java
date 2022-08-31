import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class fileInput {
	
	String workingDir;
	
	int initFile() {
		
		workingDir = String.format("%s" + "\\src\\sentenceBank.txt", System.getProperty("user.dir"));
	
		Path path;
		path = Paths.get(workingDir);
		
		long lines = 0;
		
		try {
			lines = Files.lines(path).count();	
		} 
		
		catch (IOException e) {
			workingDir = "";
			path = Paths.get(workingDir);
			workingDir = path.toAbsolutePath().toString();
			workingDir = workingDir + "\\TRResources\\sentenceBank.txt";
			path = Paths.get(workingDir);
			
			try {
				lines = Files.lines(path).count();
			} 
			
			catch (IOException e1) {
				e1.printStackTrace();
			}
		}
		return (int) lines;
	}
	
	String[] readFile(int lines) {
		
		String sentenceBank[] = new String[lines];
		File file = new File(workingDir); 
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
