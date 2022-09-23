package intro;

public class Lesson9Codes {

	public static void main(String[] args) {
		
		int number1 = 25;
		int number2 = 26;
		int number3 = 27;
		
		int biggerNumber=number1;
		
		if(biggerNumber<number2) {
			biggerNumber=number2;
		}
		if(biggerNumber<number3) {
			biggerNumber=number3;
		}
		
		System.out.println("Bigger number is: "+biggerNumber);
	}

}


