import java.lang.*;
import Entity.Player;
import Entity.Team;

public class Start{
	public static void main(String[] args){
		Team t1 = new Team("AIUB",11);
		t1.insertPlayer(0,new Player("Karim",22,15000));
		t1.insertPlayer(2,new Player("Rahim",12,20000));
		t1.insertPlayer(4,new Player("Jamal",23,30000));
		t1.insertPlayer(7,new Player("Kamal",15,18000));
		
		//t1.showTeam();
		//t1.removePlayer(2);
		//t1.removePlayer(4);
		
		t1.showTeam();
		
		Team t2 = new Team("NSU",11);
		t2.insertPlayer(0,new Player("Player 0",22,15000));
		t2.insertPlayer(1,new Player("Player 1",22,15000));
		t2.insertPlayer(2,new Player("Player 2",22,15000));
		t2.insertPlayer(3,new Player("Player 3",22,15000));
		t2.insertPlayer(4,new Player("Player 4",22,15000));
		
		t2.showTeam();
		
		t1.transferPlayer(0,t2,5);
		
		t1.showTeam();
		t2.showTeam();
		
	}
}