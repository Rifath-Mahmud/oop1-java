public final class Planet{
	public String name;
	public final static double G = 6673e-14;
	public final double g;
	public Planet(String name, double g){
		this.name = name;
		this.g = g;
	}
	public final void show(){
		System.out.println("-------- "+ name +" -----------");
		System.out.println("Value of g: "+ g);
		System.out.println("Value of G: "+ G);
		System.out.println("--------------------------------");
		
	}
}

// class ExoPlanet extends Planet{
	// public ExoPlanet(String name, double g){
		// super(name, g);
	// }
	// // @Override
	// // public void show(){
		// // System.out.println("-------- ExoPlanet: "+ name +" -----------");
		// // System.out.println("Value of g: "+ g);
		// // System.out.println("Value of G: "+ G);
		// // System.out.println("--------------------------------");
		
	// // }
// }

