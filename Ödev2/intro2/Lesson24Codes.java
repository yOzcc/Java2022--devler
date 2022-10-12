package intro2;

public class Lesson24Codes {

	public static void main(String[] args) {
		numberFind();
		numberFind();
		numberFind();
		numberFind();

	}
	
	public static void numberFind() {
		int[] numbers = {1,2,3,4,5,7,8};
		int sought = 6;
		boolean isThere = false;
		
		for (int number : numbers) {
			if(number == sought) {
				isThere=true;
				break;
			}
		}
		
		String message = "";
		
		if(isThere) {
			message = "Number is available: "+sought;
			sendMessage(message);
		}
		else {
			sendMessage("Number is not available: "+sought);
		}
	}
	
	public static void sendMessage(String message) {
		System.out.println(message);
	}

}
