import java.lang.*;
public class Start{
	public static void main(String[] args){
		Planet earth = new Planet("Earth",9.8);
		Planet mars = new Planet("Mars",3.73);
		//ExoPlanet exoEarth = new ExoPlanet("ExoEarth",12.8);
		earth.show();
		mars.show();
		
		//earth.g = 12;
		//earth.G = 10;
		//mars.g = 20;
		//mars.G = 20;
		
		
		earth.show();
		mars.show();
		//exoEarth.show();
	}
}