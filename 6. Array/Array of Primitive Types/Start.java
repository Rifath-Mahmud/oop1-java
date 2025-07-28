import java.lang.*;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
		//1D Array
		int[] array1 = {1,2,3,4,5};
		int[] array2 = new int[]{11,22,33,44,55,66};
		int[] array3 = new int[10];
		
		for(int i=0;i<array1.length;i++){
			System.out.print(array1[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<array2.length;i++){
			System.out.print(array2[i]+" ");
		}
		System.out.println();
		
		for(int i=0;i<array3.length;i++){
			System.out.print(array3[i]+" ");
		}
		System.out.println();
		
		
		Scanner sc = new Scanner(System.in);
		
		double[] array4 = new double[5];
		System.out.println(array4);
		System.out.println(array4[0]);
		
		for(int i=0;i<array4.length;i++){
			array4[i] = sc.nextDouble();
		}
		System.out.println();
		
		for(int i=0;i<array4.length;i++){
			System.out.println(array4[i]);
		}
		System.out.println();
		
		
    }
}
