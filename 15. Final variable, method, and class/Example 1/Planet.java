public final class Planet{
	public String name;
	public final static double G = 6673E-14;
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

class SatellitePlanet{
	public String name;
	public Planet orbitingPlanet;
	public SatellitePlanet(String name, Planet orbitingPlanet){
		this.name = name;
		this.orbitingPlanet = orbitingPlanet;
	}
	
	public void show(){
		System.out.println("-------- SatellitePlanet: "+ name +" -----------");
		System.out.println("Orbiting Planet Name: "+ orbitingPlanet.name);
		System.out.println("Orbiting Planet g: "+ orbitingPlanet.g);
		System.out.println("Orbiting Planet G: "+ orbitingPlanet.G);
		System.out.println("--------------------------------");
	}
}