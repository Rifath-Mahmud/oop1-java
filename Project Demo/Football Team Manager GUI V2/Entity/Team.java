package Entity;
public class Team{
	private String teamName;
	private Player[] players = new Player[15];
	
	public Team(){
		//System.out.println("E-Team Created.");
	}
	public Team(String teamName){
		//System.out.println("P-Team Created.");
		this.teamName = teamName;
	}
	
	public void setTeamName(String teamName){
		this.teamName = teamName;
	}
	public String getTeamName(){
		return teamName;
	}
	
	public void insertPlayer(int index, Player p){
		players[index] = p;
	}
	public Player getPlayer(int index){
		return players[index];
	}
	
	public void removePlayer(int index){
		players[index] = null;
	}
	
	public void transferPlayer(int from, int to, Team t){
		t.insertPlayer(to, players[from]);
		players[from] = null;
		System.out.println("Transfer Complete...");
	}
	
	public void exchangePlayer(int index1, int index2, Team t){
		Player p = players[index1];
		players[index1] = t.getPlayer(index2);
		t.insertPlayer(index2,p);
		System.out.println("Exchange Complete...");
	}
	
	
	public void showTeam(){
		System.out.println("-------- "+teamName+" --------");
		for(int i=0;i<players.length;i++){
			if(players[i] != null){
				System.out.println("-------- "+i+" --------");
				players[i].showPlayer();
			}
		}
		System.out.println("-------------------------\n");
	}
	
	public String getTeam(){
		String data="";
		data += "******** "+teamName+" **********\n";
		double cost = 0;
		int count = 0;
		for(int i=0;i<players.length;i++){
			if(players[i] != null){
				cost = cost + players[i].getPrice();
				count++;
				
				data+= "~~~~~~~~ "+i+" ~~~~~~~~\n";
				data+= players[i].getPlayer();
			}
		}
		data+="+++++++++++++++++++++++++\n";
		data+= "Total Cost of Team : "+cost+"\n";
		data+= "Total Number of Players : "+count+"\n";
		
		data+= "*******************************\n";
		
		return data;
	}
	public Player[] getAllPlayer(){
		return players;
	}
	
}