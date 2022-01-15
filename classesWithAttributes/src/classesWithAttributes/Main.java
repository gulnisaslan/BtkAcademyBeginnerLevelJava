package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setId(1);
		product.setProductName("Hp laptop");
		product.setDescription("8 gb ram");
		product.setPrice(10000);
		product.setUnitsInStock(10);
	
		
		ProductManager productManager = new ProductManager();
		
		productManager.add(product);
		
		System.out.println(product.getKod());
		


	}

}
