package entity;
public class Clothing extends Product{
	private String size;
	private String materials;
	public Clothing(){
		super();
		System.out.println("E-Clothing");
	}
	public Clothing(String id,String name,double price, String size, String materials){
		super(id,name,price);
		System.out.println("P-Clothing");
		setSize(size);
		setMaterials(materials);
	}
	
	public void setSize(String size){
		this.size = size;
	}
	public String getSize(){return size;}
	
	public void setMaterials(String materials){
		this.materials = materials;
	}
	public String getMaterials(){
		return materials;
	}
	@Override
	public void displayDetails(){
		System.out.println("Id: "+super.getId());
		System.out.println("Name: "+super.getName());
		System.out.println("Price: "+super.getPrice());
		System.out.println("Cloth Size: "+size);
		System.out.println("Cloth Matetials: "+materials);
		System.out.println("Quantity : "+super.getQuantity());
		System.out.println("............................");
	}
	
	
	@Override
	public String toString(){
		String data = "";
		data+= "Id: "+super.getId()+"\n";
		data+= "Name: "+super.getName()+"\n";
		data+= "Price: "+super.getPrice()+"\n";
		data+= "Cloth Size: "+size+"\n";
		data+= "Cloth Matetials: "+materials+"\n";
		data+= "Quantity : "+super.getQuantity()+"\n";
		data+= "............................"+"\n";
		
		return data;
	}
}