package game;

public class Game {
	
	boolean startGame = false;
	
	int bankNum = 0;
	int wordCounter = 0;
	int sentenceLength = 0;
	int sentenceCounter = 0;
	int wordLength = 0;
	int lettersRight = 0;
	int totalLettersRight = 0;
	
	char[] unTyped = null;
	char[] rightKey = null;
	char[] wrongKey = null;
	
	String sentenceBank[] = null;
	String sentence = null;
	String sentenceSplit[] = null;
	String input = null;
	String buffer = null;
	
	LaunchWindow window = new LaunchWindow();
	FileInput bankFile = new FileInput();
	RandomNumGen random = new RandomNumGen();
	TextLimit max = new TextLimit(0);
	Stopwatch time = new Stopwatch();
	
	void initialize() {
		
		window.normalText.setText("");
		window.blueText.setText("");
		window.redText.setText("<html><span bgcolor='rgb(100,50,50)'>" + "" + "</span></html>");
		
		bankNum = bankFile.lineCount();
		random.generate(bankNum);
		sentenceBank = bankFile.readFile(bankNum);
		sentence = sentenceBank[random.numArr[sentenceCounter]];
		sentenceLength = sentence.length();
		sentenceSplit = sentence.split("\\s+");
		max.limit = sentenceSplit[0].length()+5;
		wordLength = sentenceSplit[0].length();
	}
	
	void startGame() {
		
		
		window.normalText.setText("Press any letter to start game.");
		
		while(startGame==false) {
			buffer = window.textField.getText();
			
			if(buffer!=null && 0 < buffer.length()) {
				startGame = true;
				time.start();
				
				window.textField.setText("");
				window.textField.setDocument(max);
			}
		}
	}
	
	void inputCheck() {
		
		buffer = window.textField.getText();
		
		if(buffer.length()<=sentence.length()) {
			input = buffer;
		}	
	}
	
	void resetLetters() {
		
		unTyped = sentence.toCharArray();
		rightKey = new char[sentence.length()];
		wrongKey = new char[sentence.length()];
			
		lettersRight = 0;
		totalLettersRight = 0;
	}
	
	void checkLetters() {
		
		for(int i=0; i<input.length(); i++) {
			if(i==lettersRight && input.charAt(i)==unTyped[i]) {
				lettersRight++;
				rightKey[i] = sentence.charAt(i);
				unTyped[i] = 32;
			}
				
			else {
				wrongKey[i] = sentence.charAt(i);
				unTyped[i] = 32;
				if(sentence.charAt(i)==32) {
					wrongKey[i]=' ';
				}
			}
		}
	}
	
	int countTotalRight() {
		
		int previousLetters = 0;
		
		for(int i=0; i<wordCounter; i++) {
			previousLetters += sentenceSplit[i].length() + 1;
		}
		
		return previousLetters + lettersRight;
	}
	
	boolean checkLastWord() {
		
		boolean check = false;
		
		if(wordCounter + 1 == sentenceSplit.length && sentenceSplit[wordCounter].equals(input))
			check = true;
		
		return check;
	}
	
	boolean checkWord() {
		
		boolean check = false;
		
		if(wordLength + 1<=lettersRight  && input.charAt(wordLength)==32)
			check = true;
		
		return check;
	}
	
	void incrementWord() {
		
		if(wordLength+1<input.length()) {
					
			buffer = String.valueOf(buffer.toCharArray(), wordLength+1, buffer.length()-wordLength-1);
			window.textField.setText(buffer);
			window.textField.setCaretPosition(buffer.length());
		}
				
		else {
			
			buffer = "";
			window.textField.setText(buffer);
		}
				
		unTyped = sentence.toCharArray();
		sentence = String.valueOf(unTyped, wordLength+1, unTyped.length-wordLength-1);
		max.limit=sentenceSplit[wordCounter].length()+5;
		wordLength = sentenceSplit[wordCounter].length();
	}
	
	void everySecond() {
		
		if(time.every_second()==true) {
			window.WPM.setText(String.format("WPM: \n%.0f \n\nTime: \n%d \n\nSentences Completed: \n%d", sentenceSplit.length*((float)totalLettersRight/(float)sentenceLength)*((float)60/(float)time.seconds), time.seconds, sentenceCounter));
		}
	}
	
	void delay() {
		
		try {
			Thread.sleep(2);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	void displayText() {
		
		window.normalText.setText(String.valueOf(unTyped));
		window.blueText.setText(String.valueOf(rightKey));
		window.redText.setText("<html><span bgcolor='rgb(100,50,50)'>" + String.valueOf(wrongKey) + "</span></html>");
		window.redText.setBounds(150+(12*lettersRight), 0, 500, 150);
	}
	
	void nextSentence() {
			
		time.stop();
		window.textField.setEditable(false);
		window.textField.setText("");
			
		if(sentenceCounter<=sentenceBank.length-1) {
			sentence = sentenceBank[random.numArr[sentenceCounter]];
			sentenceLength = sentence.length();
			sentenceSplit = sentence.split("\\s+");
			max.limit = sentenceSplit[0].length()+5;
			wordLength = sentenceSplit[0].length();
			
			window.WPM.setText(String.format("WPM: \n%.0f \n\nTime: \n%d \n\nSentences Completed: \n%d", sentenceSplit.length*((float)totalLettersRight/(float)sentenceLength)*((float)60/(float)time.seconds), time.seconds, sentenceCounter));
				
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
				
			window.WPM.setText(String.format("WPM:\n0\n\nTime:\n0\n\nSentences Completed: \n%d", sentenceCounter));
			window.textField.setEditable(true);
			time.reset();
		}

		else {
			window.WPM.setText(String.format("WPM: \n%.0f \n\nTime: \n%d \n\nSentences Completed: \n%d", sentenceSplit.length*((float)totalLettersRight/(float)sentenceLength)*((float)60/(float)time.seconds), time.seconds, sentenceCounter));
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	void endGame() {
		
		window.redText.setText("");
		window.blueText.setText("");
		window.normalText.setText("All sentences are finished. Exiting...");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.exit(0);
	}
}
