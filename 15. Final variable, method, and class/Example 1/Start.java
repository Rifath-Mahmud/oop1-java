import java.lang.*;
public class Start{
	public static void main(String[] args){
		Planet earth = new Planet("Earth",9.8);
		Planet mars = new Planet("Mars",3.73);
		SatellitePlanet moon = new SatellitePlanet("Moon",mars);
		earth.show();
		mars.show();
		moon.show();
		
		//earth.g = 10;
		//earth.G = 10;
		
		//mars.g = 20;
		//mars.G = 20;
		
		earth.show();
		mars.show();
		
	}
}