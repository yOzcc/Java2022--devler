package intro2;

public class Lesson26Codes {

	public static void main(String[] args) {
		String message = "The weather is very nice today.";
		String newMessage = giveCity();
		System.out.println(newMessage);
		int number = sum(15,7);
		System.out.println(number);
		int sum = sum2(2,3,4);
		System.out.println(sum);
	}

	public static void add() {
		System.out.println("Added");
	}

	public static void delete() {
		System.out.println("Deleted");
	}

	public static void update() {
		System.out.println("Updated");
	}
	
	public static int sum(int number1, int number2) {
		return number1+number2;
	}
	
	public static int sum2(int... numbers) {
		int sum = 0;
		for (int number:numbers) {
			sum = sum + number;
		}
		return sum;
	}
	
	public static String giveCity() {
		return "Ankara";
	}

}
