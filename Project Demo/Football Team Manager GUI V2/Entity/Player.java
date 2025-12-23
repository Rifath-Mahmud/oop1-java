package Entity;
public class Player{
	private String playerName;
	private int jNo;
	private double price;
	
	public Player(){
		System.out.println("E-Player Created.");
	}
	public Player(String playerName, int jNo, double price){
		System.out.println("P-Player Created.");
		setPlayerName(playerName);
		setJNo(jNo);
		setPrice(price);
	}
	
	public void setPlayerName(String playerName){
		this.playerName = playerName;
	}
	public String getPlayerName(){
		return playerName;
	}
	
	public void setJNo(int jNo){
		this.jNo = jNo;
	}
	public int getJNo(){ return jNo; }
	
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	
	public void showPlayer(){
		System.out.println("Player Name: "+playerName);
		System.out.println("Player J. No: "+jNo);
		System.out.println("Price: "+price+" USD");
	}
	public String getPlayer(){
		return  "Player Name: "+playerName+"\n"+
				"Jersey No: "+jNo+"\n"+
				"Price: "+price+" USD "+"\n";
	}
	
}