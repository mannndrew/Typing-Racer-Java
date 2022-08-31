public class Main {
	
	public static void main(String []args) {
	
		LaunchWindow window = new LaunchWindow();
		fileInput bankFile = new fileInput();
		randomNumGen random = new randomNumGen();
		JTextFieldLimit max = new JTextFieldLimit(0);
		Stopwatch time = new Stopwatch();
		
		boolean startGame = false;
		
		int bankNum = 0;
		int wordCounter = 0;
		int sentenceLength = 0;
		int sentenceCounter = 0;
		int wordLength = 0;
		int lettersRight = 0;
		int totalRight = 0;
		
		String sentenceBank[] = null;
		String sentence = null;
		String split[] = null;
		String input = null;
		String buffer = null;
		
		char[] unTyped = null;
		char[] rightKey = null;
		char[] wrongKey = null;
		
		window.normalText.setText("");
		window.blueText.setText("");
		window.redText.setText("<html><span bgcolor='rgb(100,50,50)'>" + "" + "</span></html>");
		
		bankNum = bankFile.initFile();
		random.generate(bankNum);
		sentenceBank = bankFile.readFile(bankNum);
		sentence = sentenceBank[random.numArr[sentenceCounter]];
		sentenceLength = sentence.length();
		split = sentence.split("\\s+");
		max.limit = split[0].length()+5;
		wordLength = split[0].length();
		
		window.normalText.setText("Press any letter to start game.");
		
		while(sentenceCounter<bankNum) {
			 
			while(startGame==false) {
				buffer = window.textField.getText();
				
				if(buffer!=null && 0 < buffer.length()) {
					startGame = true;
					time.start();
					
					window.textField.setText("");
					window.textField.setDocument(max);
				}
			}
			
			buffer = window.textField.getText();
			
			if(buffer.length()<=sentence.length()) {
				input = buffer;
			}
			
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			unTyped = sentence.toCharArray();
			rightKey = new char[sentence.length()];
			wrongKey = new char[sentence.length()];
			
			lettersRight = 0;
			totalRight = 0;
			
			if(input!=null && input.length()<=split[wordCounter].length()+5) {
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
							wrongKey[i]='_';
						}
					}
				}
				
				for(int i=0; i<wordCounter; i++) {
					totalRight += split[i].length() + 1;
				}
				
				totalRight += lettersRight;
			
				if(wordCounter + 1 == split.length && split[wordCounter].equals(input)) {
					wordCounter++;
				}
				
				else if(wordLength + 1<=lettersRight  && input.charAt(wordLength)==32) {
				
					wordCounter++;
					
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
					max.limit=split[wordCounter].length()+5;
					wordLength = split[wordCounter].length();
				}
			}
			
			if(time.every_second()==true) {
				window.WPM.setText(String.format("WPM: \n%.0f \n\nTime: \n%d \n\nSentences Completed: \n%d", split.length*((float)totalRight/(float)sentenceLength)*((float)60/(float)time.seconds), time.seconds, sentenceCounter));
			}
			
			window.normalText.setText(String.valueOf(unTyped));
			window.blueText.setText(String.valueOf(rightKey));
			window.redText.setText("<html><span bgcolor='rgb(100,50,50)'>" + String.valueOf(wrongKey) + "</span></html>");
			window.redText.setBounds(150+(12*lettersRight), 0, 500, 150);
			
			if(totalRight == sentenceLength && sentenceCounter<bankNum) {
				
				wordCounter = 0;
				sentenceCounter++;
				
				time.stop();
				window.textField.setEditable(false);
				window.textField.setText("");
				
				if(sentenceCounter<=sentenceBank.length-1) {
					sentence = sentenceBank[random.numArr[sentenceCounter]];
					sentenceLength = sentence.length();
					split = sentence.split("\\s+");
					max.limit = split[0].length()+5;
					wordLength = split[0].length();
					
					window.WPM.setText(String.format("WPM: \n%.0f \n\nTime: \n%d \n\nSentences Completed: \n%d", split.length*((float)totalRight/(float)sentenceLength)*((float)60/(float)time.seconds), time.seconds, sentenceCounter));
					
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
					window.WPM.setText(String.format("WPM: \n%.0f \n\nTime: \n%d \n\nSentences Completed: \n%d", split.length*((float)totalRight/(float)sentenceLength)*((float)60/(float)time.seconds), time.seconds, sentenceCounter));
				}
			}
		}
		
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
