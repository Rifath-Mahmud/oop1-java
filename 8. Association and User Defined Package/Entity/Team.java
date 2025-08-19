package Entity;
public class Team{
	private String teamName;
	private Player players[];
	private Coach coach;
	
	public Team(){
		 players = new Player[14];
	}
	
	public Team(String teamName, int teamSize){
		 this.teamName = teamName;
		 players = new Player[teamSize];
	}
	
	public String getTeamName(){return teamName;}
	
	public void insertPlayer(int pos, Player p){
		if(pos>=0 && pos<=players.length){
			players[pos] = p;
		}
		else{
			System.out.println("Invalid Position");
		}
	}
	
	public Player getPlayer(int pos){
		if(pos>=0 && pos<=players.length){
			return players[pos];
		}
		else{ 
			return null;
		}
	}
	
	public void removePlayer(int pos){
		if(pos>=0 && pos<=players.length){
			players[pos] = null;
		}
	}
	
	public void transferPlayer(int fromPostion, Team t, int toPostion){
		
		if(this.getPlayer(fromPostion) != null){
			
			System.out.println("Transfering Player to "+ t.getTeamName());
			t.insertPlayer(toPostion, this.getPlayer(fromPostion));
			System.out.println("Removing Player from "+ teamName);
			this.removePlayer(fromPostion);
			System.out.println("Transfer Completed..");
		}else{
			System.out.println(" !! Transfer Failed");
			System.out.println(" !! No Player Found at the Postion to be Transfered..");
		}
	}
	
	public void showTeam(){
		System.out.println("------ "+teamName.toUpperCase()+" --------");
		for(int i=0;i<players.length;i++){
			if(players[i]!=null){
				System.out.println("........Player: "+ i +".......");
				players[i].showPlayer();
			}
		}
		System.out.println("---------------------------\n\n");
	}
}