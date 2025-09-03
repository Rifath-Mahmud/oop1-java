import java.lang.*;
import java.util.Scanner;
import java.util.InputMismatchException;

import java.io.*;//File, FileNotFoundException


public class Start {
    public static void main(String[] args){
		try{
			Scanner sc =  new Scanner(new File("./files/data.txt"));
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				String data[] = line.split(";");
				System.out.println("Name: "+data[0]);
				System.out.println("Id: "+data[1]);
				System.out.println("Age: "+ ( Integer.parseInt(data[2]) +5));
				
			}
		}
		catch(FileNotFoundException e){
			System.out.println("Cannot Read File. "+ e.getMessage());
		}
	}
}
