package manager;
import entity.*;
public class CartItem{
	private Product product;
	private double quantity;
	public CartItem(Product product, double quantity){
		this.product = product;
		this.quantity = quantity;
	}
	public void setProduct(Product product){
		this.product = product;
	}
	public Product getProduct(){
		return product;
	}
	
	public void setQuantity(double quantity){
		if(quantity>0){
			this.quantity = quantity;
		}
	}
	public double getQuantity(){
		return quantity;
	}
	public void displayDetails(){
		System.out.printf("%-10s | %-10s | %-10s | %-10s | %-10s\n", product.getId(), product.getName(), product.getPrice(),quantity,product.getPrice()*quantity);
	}
}