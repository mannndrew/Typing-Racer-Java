public class Main {
	
	public static void main(String []args) {
		
		Game game = new Game();
		
		game.initialize();
		game.startGame();
		
		while(game.sentenceCounter<game.bankNum) {
			
			game.inputCheck();
			game.resetLetters();
			game.checkLetters();
			
			game.totalLettersRight = game.countTotalRight();
			
			if(game.checkLastWord()==true) {
				game.wordCounter++;
			}
			
			else if(game.checkWord()==true) {
				game.wordCounter++;
				game.incrementWord();
			}
			
			game.everySecond();
			game.delay();
			game.displayText();
			
			if(game.totalLettersRight == game.sentenceLength) {
				game.wordCounter = 0;
				game.sentenceCounter++;
				game.nextSentence();
			}
		}
		
		game.endGame();
	}
}
