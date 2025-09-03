import java.lang.*;
import java.util.Scanner;
import java.util.InputMismatchException;

class MyException extends Exception{
	public MyException(){
			super("my exception occured");
	}
	public MyException(String msg){
		super(msg);
	}
}

public class Start {
    public static void main(String[] args) {
		System.out.println("Program Started..");
		
		Scanner sc = new Scanner(System.in);
		int numbers[] = new int[2];
		try{
			numbers[0] = Integer.parseInt(sc.next());
			numbers[1] = sc.nextInt();
			if(numbers[1]==0){
				throw new MyException("User is Trying to Divide by Zero");
			}
			System.out.println(numbers[0]/numbers[1]);
		}
		catch(ArithmeticException e){
			System.out.println("Divide by Zero is Undefined "+e.getMessage());
			e.printStackTrace();
		}
		catch(InputMismatchException e){
			System.out.println("Invalid Input : "+sc.nextLine());
			//e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		catch(MyException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		finally{
			System.out.println("Finally Block Running");
			sc.close();
		}
		
		System.out.println("Program Ended..");
   }
}
