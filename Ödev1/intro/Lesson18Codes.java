package intro;

public class Lesson18Codes {
	
	public static void main(String[] args) {
		
		String message = "The weather is very nice today.";
		System.out.println(message);
		System.out.println(message.replace(" ", "-"));
		
		System.out.println(message.substring(4,11));
		
		for(String word : message.split(" ")) {
			System.out.println(word);
		}
	}

}
