public class Electronics extends Product{
	private int months;
	
	public Electronics(){
		super();
		System.out.println("E-Electronics");
	}
	public Electronics(String id,String name,double price,int months){
		super(id,name,price);
		System.out.println("P-Electronics");
		setMonths(months); 
	}
	public void setMonths(int months){
		if(months>=0){
			this.months = months;
		}
		else{
			System.out.println("Invalid Warranty Period.");
		}
	}
	
	//Overriding
	public void displayDetails(){
		//super.displayDetails();
		System.out.println("............................");
		System.out.println("Product-"+super.getId()+" "+super.getName());
		System.out.println("Warranty Period: "+this.months);
		System.out.println("............................");
	}
	
}