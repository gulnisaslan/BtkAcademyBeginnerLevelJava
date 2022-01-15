package classesWithAttributes;

public class Product {
	private int id;
	private String productName;
	private String description;
	private double price;
	private int unitsInStock;
	private String code;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	

	public Product(int id, String productName, String description, double price, int unitsInStock, String code) {
		super();
		this.id = id;
		this.productName = productName;
		this.description = description;
		this.price = price;
		this.unitsInStock = unitsInStock;
		this.code = code;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getKod() {
	return this.productName.substring(0,1)+id;
	}  

}
