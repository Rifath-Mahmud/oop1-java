import java.lang.*;
public class Product{
	private String id;
	private String name;
	private double price;
	
	public Product(){
		System.out.println("E-Product");
	}
	public Product(String id,String name,double price){
		//this();
		System.out.println("P-Product");
		setId(id);
		setName(name);
		setPrice(price);
	}
	
	public void setId(String id){
		if(id.length() >=3 ){
			this.id = id;
		}
		else{
			System.out.println("Invalid Product Id");
		}
	}
	public String getId(){
		return id;
	}
	
	public void setName(String name){
		if(!name.isEmpty()){
			this.name = name;
		}
		else{
			System.out.println("Invalid Product Name");
		}
	}
	public String getName(){return name;}
	
	public void setPrice(double price){
		if(price>=0){
			this.price = price;
		}
		else{
			System.out.println("Invalid Product Price");
		}
	}
	public double getPrice(){
		return price;
	}
	
	public void displayDetails(){
		System.out.println(".....................");
		System.out.println("Product Id: "+id);
		System.out.println("Product Name: "+name);
		System.out.println("Product Price: "+price);
	}
}
