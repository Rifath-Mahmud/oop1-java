package manager;
import entity.*;
import interfaces.*;

public class Inventory implements IInventoryOperations{
	private Product[] products;
	public Inventory(){
		products = new Product[1000];
	}
	public Inventory(int size){
		products = new Product[size];
	}
	public void addProduct(int pNo, Product p){
		if(pNo>=0 && pNo<products.length){
			products[pNo] = p;
		}
	}
	
	public Product getProduct(int pNo){
		return products[pNo];
	}
	
	public Product getProductById(String id){
		for(Product p : products){
			if(p!=null){
				if(p.getId().equals(id)){
					return p;
				}
			}
		}
		return null;
	}
	
	public void remove(int pNo){
		products[pNo] = null;
	}
	
	public void showInventory(){
		System.out.println("------------ Inventory Details --------------");
		for(Product p : products){
			if(p!=null){
				p.displayDetails();
			}
		}
		System.out.println("-------------------------------------------");
	}
	
	
	public String toString(){
		String allData = "";
		
		allData+= "------------ Inventory Details --------------"+"\n";
		for(Product p : products){
			if(p!=null){
				allData += p.toString();
			}
		}
		allData+="-------------------------------------------"+"\n";
		
		return allData;
	}
}