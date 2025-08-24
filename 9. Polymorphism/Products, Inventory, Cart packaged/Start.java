import java.lang.*;
import entity.*;
import manager.*;
public class Start {
    public static void main(String[] args) {
		
		Inventory inventory = new Inventory(1000);
		inventory.addProduct(0,new Product("111","Item 1",2000));
		inventory.addProduct(1,new Electronics("222","EItem 2",15000,12));
		inventory.addProduct(2,new Clothing("333","CItem 3",1000,"L","Cotton"));
		inventory.addProduct(3,new Clothing("334","CItem 4",500,"L","Cotton"));
		inventory.addProduct(4,new Clothing("335","CItem 5",100,"XL","Cotton"));
		
		//inventory.showInventory();
		//inventory.getProduct(1).addQuantity(10);
		//inventory.showInventory();
		
		Cart cart = new Cart();
		cart.add(0,inventory.getProductById("111"),10);
		cart.add(1,inventory.getProductById("334"),2);
		cart.add(2,inventory.getProductById("222"),20);
		cart.showCart();
   }
}
