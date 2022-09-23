package intro;

public class Lesson23Codes {

	public static void main(String[] args) {

		int[] numbers = new int[] {1,2,5,7,9,0};
		int sought = 6;
		boolean isThere = false;
		
		for(int number: numbers) {
			if(number == sought) {
				isThere = true;
				break;
			}
		}
		
		if(isThere) {
			System.out.println("number is available.");
		} else {
			System.out.println("number is not available.");
		}

	}

}
