package entity;
public abstract class Product{
	private String id;
	private String name;
	private double price;
	private double quantity;
	
	public Product(){
		System.out.println("E-Product");
	}
	public Product(String id,String name,double price){
		System.out.println("P-Product");
		setId(id);
		setName(name);
		setPrice(price);
	}
	public Product(String id,String name,double price, double quantity){
		System.out.println("P-Product");
		setId(id);
		setName(name);
		setPrice(price);
		setQuantity(quantity);
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
	
	public void setQuantity(double quantity){
		if(quantity>=0){			
			this.quantity = quantity;
		}
	}
	public double getQuantity(){
		return quantity;
	}
	
	public void addQuantity(double quantity){
		this.quantity += quantity;
	}
	public void sellQuantity(double quantity){
		if(quantity<= this.quantity){
			this.quantity -= quantity;
		}
	}
	
	public abstract void displayDetails();
	public abstract String toString();
	// public void displayDetails(double vat){
		// System.out.println(".....................");
		// System.out.println("Product Id: "+id);
		// System.out.println("Product Name: "+name);
		// System.out.println("Product Price: "+price);
		// System.out.println("Product Price With Vat: "+(price+price*vat));
	// }
	
}
