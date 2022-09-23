package intro;

public class Lesson21Codes {

	public static void main(String[] args) {
		
		int number = 27;
		int total = 0;

		for(int i=1; i<number; i++) {
			if(number%i == 0) {
				total = total + i ;
			}
		}
		
		if(total == number) {
			System.out.println(number+ " is the perfect number.");
		} else {
			System.out.println(number+ " it's not a perfect number.");
		}
	}

}
