package intro2.Lesson33Codes;

import intro2.Lesson31Codes.Product;
import intro2.Lesson31Codes.ProductManager;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		
		product.name = "Laptop";
		product.setId(1);
		product.description = "Asus Laptop";
		product.price = 5000;
		product.stockAmount = 3;
		
		ProductManager productManager = new ProductManager();
		productManager.add(product);
		
		System.out.println(product.getCode());

	}

}
