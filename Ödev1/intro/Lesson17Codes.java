package intro;

public class Lesson17Codes {

	public static void main(String[] args) {
		
		String message = "The weather is very nice today.";
		System.out.println(message);

		System.out.println("Number of elements: "+message.length());
		System.out.println("5th element: "+message.charAt(4));
		System.out.println(message.concat(" Yuppie !"));
		
		System.out.println(message.startsWith("T"));
		System.out.println(message.endsWith("."));
		
		char[] characters = new char[5];
		message.getChars(0, 5, characters, 0);
		System.out.println(characters);
		System.out.println(message.indexOf("ve"));
		System.out.println(message.lastIndexOf("s"));
	}

}
