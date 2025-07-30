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
	
	public void displayClothingDetails(){
		super.displayDetails();
		System.out.println("Cloth Size: "+size);
		System.out.println("Cloth Matetials: "+materials);
		System.out.println("............................");
	}
}