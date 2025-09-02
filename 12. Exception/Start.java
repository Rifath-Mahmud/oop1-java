import java.lang.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Start{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Program Started..");
	
		try{
			int x = sc.nextInt();
			int y = sc.nextInt();
			System.out.println(x/y);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by Zero is Undefined " + e.getMessage());
			//e.printStackTrace();
		}
		catch(InputMismatchException e){
			System.out.println( sc.nextLine() + " Invalid Input.");
			//e.printStackTrace();
		}
		finally{
			System.out.println("Running Finally");
		}
		
		
		System.out.println("Program Ended..");
	}
}