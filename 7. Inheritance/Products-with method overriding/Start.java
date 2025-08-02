import java.lang.*;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
		Product p1 = new Product("100","Taza Tea",210);
		p1.displayDetails();
		
		Electronics e1 = new Electronics("101","Sony Tv",100000,12);
		//e1.displayElectronicsDetails();
		e1.displayDetails();
		
		Clothing c1 = new Clothing("102","Shirt",2000,"XL","Cotton");
		//c1.displayClothingDetails();
		c1.displayDetails();
    }
}
