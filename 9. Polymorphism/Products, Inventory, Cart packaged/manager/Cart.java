package manager;
import entity.*;
public class Cart{
	private CartItem[] cartItems;
	public Cart(){
		cartItems = new CartItem[100];
	}
	public Cart(int size){
		cartItems = new CartItem[size];
	}
	
	public void add(int itemNo,Product p,double quantity){
		if(itemNo>=0 && itemNo<cartItems.length){
			cartItems[itemNo] = new CartItem(p,quantity);
		}
	}
	
	public void remove(int itemNo){
		cartItems[itemNo] = null;
	}
	
	public Product get(int itemNo){
		return cartItems[itemNo].getProduct();
	}
	
	public void showCart(){
		System.out.println("====================== Cart Details =======================");
		double totalCost = 0;
		System.out.printf("%-10s | %-10s | %-10s | %-10s | %-10s\n","ID ","Name","Price","Quantity","Bill");
		for(int i=0;i<cartItems.length;i++){
			if(cartItems[i]!=null){
				totalCost += cartItems[i].getProduct().getPrice() * cartItems[i].getQuantity();
				cartItems[i].displayDetails();

			}
		}
		System.out.println("*************** Total Bill : "+totalCost+" BDT *****************");
	}
}