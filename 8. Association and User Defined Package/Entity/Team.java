package Entity;
public class Team{
	private String teamName;
	private Player players[];
	
	public Team(){
		 players = new Player[14];
	}
	
	public Team(String teamName, int teamSize){
		 this.teamName = teamName;
		 players = new Player[teamSize];
	}
	public void setTeamName(String teamName){
		if(!teamName.isEmpty()){
			this.teamName = teamName;
		}
	}
	public String getTeamName(){
		return teamName;
	}
	
	public void insertPlayer(int pos, Player p){
		if(pos>=0 && pos<players.length){
			players[pos] = p;
		}
		else{
			System.out.println("Invalid Position");
		}
	}
	
	public Player getPlayer(int pos){
		if(pos>=0 && pos<players.length){
			return players[pos];
		}
		else{ 
			return null;
		}
	}
	
	public void removePlayer(int pos){
		if(pos>=0 && pos<players.length){
			players[pos] = null;
		}
	}
	
	public void transferPlayer(int fromPosition, Team t, int toPosition){
			if(getPlayer(fromPosition)!=null){
				System.out.println("*****************************");
				System.out.println("Starting Transfer From "+ teamName);
				System.out.println("Adding Player To "+ t.getTeamName());
				getPlayer(fromPosition).showPlayer();
				t.insertPlayer(toPosition,players[fromPosition]);
				
				System.out.println("Removing Player From "+ teamName);
				removePlayer(fromPosition);
				System.out.println("Transfer Completed ");
				System.out.println("*****************************");
			}
			else{
				System.out.println("Transfer Failed! (No Player Found) ");	
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