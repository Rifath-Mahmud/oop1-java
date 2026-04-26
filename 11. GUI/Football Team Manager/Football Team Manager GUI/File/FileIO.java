package File;
import Entity.*;
import java.io.*;
import java.util.*;

public class FileIO{
	public static void loadFromFile(Team[] teams){
		try{
			Scanner sc = new Scanner(new File("./File/Teams.txt"));
			while(sc.hasNextLine()){
				String data[] = sc.nextLine().split(";");
				teams[Integer.parseInt(data[0])] = new Team(data[1]);
			}
			sc.close();
			
			sc = new Scanner(new File("./File/Players.txt"));
			while(sc.hasNextLine()){
				
				String data[] = sc.nextLine().split(";");
				int teamNo = Integer.parseInt(data[0]);
				int position = Integer.parseInt(data[1]);
				String name = data[2];
				int jNo = Integer.parseInt(data[3]);
				double price = Double.parseDouble(data[4]);
				
				teams[teamNo].insertPlayer(position, new Player(name,jNo,price));
			}
			
			sc.close();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void saveChangesInFile(Team[] teams){
		try{
			FileWriter teamWriter = new FileWriter(new File("./File/Teams.txt"));
			FileWriter playerWriter = new FileWriter(new File("./File/Players.txt"));
			
			for(int teamNo=0;teamNo<teams.length;teamNo++){
				if(teams[teamNo]!=null){
					teamWriter.write(teamNo+";"+teams[teamNo].getTeamName()+"\n");
					Player[] players = teams[teamNo].getAllPlayer();
					for(int position=0;position<players.length;position++){
						if(players[position] != null){
							
							String name = players[position].getPlayerName();
							int jNo = players[position].getJNo();
							double price = players[position].getPrice();
							
							playerWriter.write(teamNo+";"+position+";"+name+";"+jNo+";"+price+"\n");
						}
					}
				}
			}
			teamWriter.close();
			playerWriter.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
}