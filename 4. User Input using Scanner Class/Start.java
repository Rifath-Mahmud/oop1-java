import java.lang.*;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		Scanner cinLine = new Scanner(System.in);
		
		System.out.print("Enter int: ");
		int i = cin.nextInt();
		System.out.println("Value: "+i);
			
		System.out.print("Enter double: ");
		double d = cin.nextDouble();
		System.out.println("Value: "+d);
		
		System.out.print("Enter a Word: ");
		String w = cin.next();
		System.out.println("Word: "+w);
		//System.out.println("Leftover: "+cin.next());
		
		//cin.nextLine();//clean
		System.out.print("Enter a Line: ");
		String line = cinLine.nextLine();
		System.out.println("Line: "+line);
		
		
		
    }
}
