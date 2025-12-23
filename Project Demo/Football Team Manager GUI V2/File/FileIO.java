package File;
import Entity.*;
import java.io.*;
import java.util.Scanner;

public class FileIO{
	public static void loadFromFile(Team[] teams){
		try{
			Scanner sc = new Scanner(new File("./File/teams.txt"));
			
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				String[] data = line.split(";");
				int teamNo = Integer.parseInt(data[0]);
				String teamName = data[1];
				teams[teamNo] = new Team(teamName);
			}
			sc.close();
			
			sc = new Scanner(new File("./File/players.txt"));
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				String[] data = line.split(";");
				int teamNo = Integer.parseInt(data[0]);
				int pNo = Integer.parseInt(data[1]);
				String name = data[2];
				int jNo = Integer.parseInt(data[3]);
				double price = Double.parseDouble(data[4]);
				
				Player p = new Player(name,jNo,price);
				teams[teamNo].insertPlayer(pNo,p);
			}
			sc.close();
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
}