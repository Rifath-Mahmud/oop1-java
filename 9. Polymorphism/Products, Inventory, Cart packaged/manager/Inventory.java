package manager;
import entity.*;
public class Inventory{
	private Product[] products;
	public Inventory(){
		products = new Product[100];
	}
	public Inventory(int size){
		products = new Product[size];
	}
	
	public void addProduct(int pNo,Product p){
		if(pNo>=0 && pNo<products.length){
			products[pNo] = p;
		}
	}
	
	public void removeProduct(int pNo){
		products[pNo] = null;
	}
	
	public Product getProduct(int pNo){
		return products[pNo];
	}
	
	public Product getProductById(String id){
		for(int i=0;i<products.length;i++){
			if(products[i]!=null){
				if(products[i].getId().equals(id)){
					return products[i];
				}
			}
		}
		return null;
	}
	
	public void showInventory(){
		System.out.println("----- Inventory Details -----");
		//double totalCost = 0;
		for(int i=0;i<products.length;i++){
			if(products[i]!=null){
				//totalCost += products[i].getPrice() * products[i].getQuantity();
				products[i].displayDetails();
			}
		}
		//System.out.println("##### Total Cost of Product: "+totalCost+" BDT #########");
	}
}