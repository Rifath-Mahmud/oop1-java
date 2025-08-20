public class Cart{
	private String customerNumber;
	private Product products[] = new Product[100];
	public Cart(String customerNumber){
		this.customerNumber = customerNumber;
	}
	public void addProduct(int pn,Product p){
		products[pn] = p;
	}
	public void showCart(){
		System.out.println("-------- Bill For: "+customerNumber+" ------------");
		double totalBill = 0;
		for(int i=0;i<products.length;i++){
			if(products[i]!=null){
				totalBill += products[i].getPrice();
				products[i].displayDetails();
			}
		}
		System.out.println(":::::::: Total Bill: "+totalBill+" BDT :::::::::");
	}
	
	
	public void showAllElectronics(){
		for(int i=0;i<products.length;i++){
			if(products[i]!=null){
				if(products[i] instanceof Electronics){
					Electronics e = (Electronics)products[i];
					System.out.println("Name: "+e.getName()+"  Warranty: "+e.getMonths()+" Months");
				}
			}
		}
	}
	
}