package intro2;

public class Lesson35Codes {

	public class FourTransaction {
		public int sum(int number1, int number2) {
			return number1 + number2;
		}

		public int sum(int number1, int number2, int number3) {
			return number1 + number2 + number3;
		}
	}
	
	public static void main(String[] args) {
	FourTransaction fourTransaction = new FourTransaction();
	
	System.out.println(fourTransaction.sum(2,3));
	fourTransaction.sum(2,3,5);
	}
}