import java.lang.*;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
		Cart cart = new Cart("01700000000");
		cart.addProduct(0, new Electronics("111","E1",2000,12));
		cart.addProduct(1, new Electronics("112","E2",3000,16));
		cart.addProduct(2, new Electronics("113","E3",4000,24));
		cart.addProduct(3, new Clothing("114","C1",1000,"XL","Cotton"));
		cart.addProduct(4, new Clothing("115","C3",2000,"XXL","Cotton"));
		cart.addProduct(5, new Clothing("116","C3",3000,"XXXL","Cotton"));
		
		//cart.showCart();
		
		cart.showAllElectronics();
    }
}
