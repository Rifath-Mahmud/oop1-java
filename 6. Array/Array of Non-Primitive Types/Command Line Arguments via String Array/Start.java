import java.lang.*;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
		if(args.length>0){
			double sum = 0;
			for(int i=0;i<args.length;i++){
				sum += Double.parseDouble(args[i]);
			}
			System.out.println("Sum: "+sum);
		}
		
		
	}
}
