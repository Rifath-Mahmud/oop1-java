import java.lang.*;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
		String[] words = new String[]{"One","Two","Three",
									"Four","Number Five"};	
		
		for(int i=0;i<words.length;i++){
			System.out.println(words[i].charAt(0));
		}
		
		Scanner sc = new Scanner(System.in);
		Scanner scLine = new Scanner(System.in);
		
		System.out.print("Number of Input: ");
		int size = sc.nextInt();
		
		String[] lines = new String[size];
		for(int i=0;i<lines.length;i++){
			lines[i] = scLine.nextLine();
		}
		
		for(int i=0;i<lines.length;i++){
			System.out.println(lines[i]+" : "+lines[i].length());
		}
		
    }
}
