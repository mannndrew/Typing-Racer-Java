public class RandomNumGen {
	
	int[] numArr;
	
	void generate(int bankNum) {
		boolean[] checkArr = new boolean[bankNum];
		int randomNum = (int) (Math.random() * bankNum);
		numArr = new int[bankNum];
		
		int counter = 0;
		
		while(counter<bankNum) {
			
			while(checkArr[randomNum]==true) {
				randomNum = (int) (Math.random() * bankNum);
			}
			
			checkArr[randomNum] = true;
			numArr[counter] = randomNum;
			counter++;
		}
	}
}
