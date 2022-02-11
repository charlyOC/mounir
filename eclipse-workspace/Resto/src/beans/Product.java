package beans;

public class Product {
	
	private String desc;
	private double price; 
	private int quantity;

	public Product(String Desc, double Price, int Quantity) {
		this.desc = Desc; 
		this.price = Price; 
		this.quantity = Quantity; 
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity; 
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity; 
	}

	

}
