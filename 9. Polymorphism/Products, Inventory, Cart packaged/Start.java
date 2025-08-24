import java.lang.*;
import entity.*;
import manager.*;
public class Start {
    public static void main(String[] args) {

		Inventory inventory = new Inventory(500);
		inventory.addProduct(0, new Product("101","P1",200,30));
		inventory.addProduct(1, new Product("102","P2",300,30));
		inventory.addProduct(2, new Electronics("103","E1",3000,12));
		inventory.addProduct(3, new Electronics("104","E2",2500,12));
		inventory.addProduct(4, new Clothing("105","C1",1500,"XL","Cotton"));
		inventory.addProduct(5, new Clothing("106","C2",800,"L","Cotton"));
		
		// inventory.showInventory();
		inventory.getProduct(4).setQuantity(15);
		inventory.getProductById("105").addQuantity(7);
		// inventory.remove(5);
		inventory.showInventory();
		
		Cart cart = new Cart(50);
		cart.addProduct(0,inventory.getProductById("103"),4);
		cart.addProduct(1,inventory.getProductById("105"),2);
		cart.addProduct(2,inventory.getProductById("106"),3);
		
		cart.showCart();
		cart.confirmOrder();
		inventory.showInventory();
   }
}
