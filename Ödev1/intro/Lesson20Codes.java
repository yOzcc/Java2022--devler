package intro;

public class Lesson20Codes {

	public static void main(String[] args) {
		
		char letter = 'A';
		
		switch(letter) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Bold vowel");
			break;
		default:
			System.out.println("Thin wowel");
		}
	}

}
