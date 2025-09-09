package manager;
import entity.*;
public class CartItem{
	private Product product;
	private double quantity;
	public CartItem(Product product, double quantity){
		setProduct(product);
		setQuantity(quantity);
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
	
	public double getBill(){
		return product.getPrice()*quantity;
	}
	
	public void sellProduct(){
		product.sellQuantity(quantity);
	}
	
	public void showItem(){
		System.out.println(product.getId()+" | "+product.getName()+" | "+product.getPrice()+" | "+ quantity+ " | "+ getBill() );
	}
	public String toString(){
		return product.getId()+" | "+product.getName()+" | "+product.getPrice()+" | "+ quantity+ " | "+ getBill() + "\n";
	}
	
	
}