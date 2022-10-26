package intro3.Lesson45Codes;

public class ProductValidator {
	
	static {
		System.out.println("Static constructor worked.");
	}
	
	public ProductValidator() {
		System.out.println("Costructor worked.");
	}
	
	public boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
	
	public void anything() {
		
	}
	
	public static class AnotherClass{
		public static void delete() {
			
		}
	}
}
