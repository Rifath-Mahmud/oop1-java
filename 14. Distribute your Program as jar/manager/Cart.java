package manager;
import entity.*;
public class Cart{
	private CartItem[] cartItems;
	public Cart(){
		cartItems = new CartItem[1000];
	}
	public Cart(int size){
		cartItems = new CartItem[size];
	}
	public boolean addItem(int itemNo, Product p,double quantity){
		if(itemNo>=0 && itemNo<cartItems.length && p.getQuantity()>= quantity){
			cartItems[itemNo] = new CartItem(p,quantity);
			return true;
		}
		else{
			p.displayDetails();
			System.out.println("Out of Stock for Quantity : "+ quantity);
			return false;
		}
	}
	
	public CartItem getItem(int itemNo){
		return cartItems[itemNo];
	}
	
	public Product getProductById(String id){
		for(CartItem item : cartItems){
			if(item!=null){
				if(item.getProduct().getId().equals(id)){
					return item.getProduct();
				}
			}
		}
		return null;
	}
	
	public void remove(int itemNo){
		cartItems[itemNo] = null;
	}
	
	public void showCart(){
		System.out.println("------------ Cart Details --------------");
		double totalCost = 0;
		for(CartItem item : cartItems){
			if(item!=null){
				totalCost += item.getBill();
				item.showItem();
			}
		}
		System.out.println("-------------------------------------------");
		System.out.println("# Total Bill: "+totalCost);
		System.out.println("-------------------------------------------");
	
	}
	
	public void confirmOrder(){
		showCart();
		for(CartItem item : cartItems){
			if(item!=null){
				item.sellProduct();
			}
		}
		cartItems = new CartItem[1000];
	}
	
	
	public String toString(){
		String allData = "";
		allData+= "------------------- Cart Details -------------------\n";
		double totalCost = 0;
		for(CartItem item : cartItems){
			if(item!=null){
				totalCost += item.getBill();
				allData += item.toString();
			}
		}
		allData+="-----------------------\n";
		allData+="# Total Bill: "+totalCost+"\n";
		allData+="-----------------------\n";
		return allData;
	}
	
	
}