package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import Entity.*;
import File.*;
import java.util.Random;


public class TeamManagerPage extends JFrame implements ActionListener, MouseListener{
	Font font15 = new Font("Consoles",Font.BOLD,15);
	JLabel title, teamNoLabel, teamNameLabel;
	JLabel teamLabel, playerLabel;
	
	JLabel playerTeamNoLabel, positionLabel, nameLabel, jerseyNoLabel, priceLabel;
	JLabel searchLabel;
	
	JButton createTeamButton, createPlayerButton;
	JButton updateTeamButton, removeTeamButton;
	JButton updatePlayerButton, removePlayerButton;
	
	JButton teamClearButton, playerClearButton;
	
	JButton searchTeamButton, saveChangesButton;
	
	JTextField createTeamNoTextField, teamNameTextField;
	JTextField playerTeamNoTextField, positionTextField, nameTextField, jerseyNoTextField,priceTextField;
	JTextField searchTextField;
	
	JTextArea screen;
	
	Team[] teams = new Team[100];
	
	public TeamManagerPage(){
		
		super("Team Manager");
		this.setSize(800,600);
		this.setLocation(200,50);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.setIconImage(new ImageIcon("./images/icon.png").getImage());
		this.setLayout(null);
		
		//Load Data From File
		FileIO.loadFromFile(teams);
		
		title = createLabel(10,0,200,30,"Football Team Manager");
		
		teamLabel = createLabel(10,40,150,30,"Create New Team");
		JLabel teamImage = new JLabel(new ImageIcon("./images/team.png"));
		teamImage.setBounds(160,40,30,30);
		this.add(teamImage);
		
		teamClearButton = new JButton(new ImageIcon("./images/refresh.png"));
		teamClearButton.setBounds(280,40,30,30);
		teamClearButton.addActionListener(this);
		this.add(teamClearButton);
		
		
		teamNoLabel = createLabel(10,80,150,30,"Team No.");
		createTeamNoTextField = createTextField(160,80,150,30,"");
		teamNameLabel = createLabel(10,120,150,30,"Team Name");
		teamNameTextField =  createTextField(160,120,150,30,"");
		createTeamButton = createButton(10,160,300,30,"Create Team");
		
		updateTeamButton = createButton(10,200,145,30,"Update");
		updateTeamButton.setBackground(new Color(66, 179, 255));
		updateTeamButton.setForeground(Color.WHITE);
		
		removeTeamButton = createButton(165,200,145,30,"Remove");
		removeTeamButton.setBackground(Color.RED);
		removeTeamButton.setForeground(Color.WHITE);
		
		playerLabel = createLabel(10,240,150,30,"Create Player");
		
		JLabel playerImage = new JLabel(new ImageIcon("./images/player.png"));
		playerImage.setBounds(160,240,30,30);
		this.add(playerImage);
		
		playerClearButton = new JButton(new ImageIcon("./images/refresh.png"));
		playerClearButton.setBounds(280,240,30,30);
		playerClearButton.addActionListener(this);
		this.add(playerClearButton);
		
		
		playerTeamNoLabel = createLabel(10,280,150,30,"Team No.");
		playerTeamNoTextField = createTextField(160,280,150,30,"");
		
		positionLabel = createLabel(10,320,150,30,"Position No.");
		positionTextField = createTextField(160,320,150,30,"");
		
		nameLabel = createLabel(10,360,150,30,"Player Name");
		nameTextField = createTextField(160,360,150,30,"");
		
		jerseyNoLabel = createLabel(10,400,150,30,"Jersey No.");
		jerseyNoTextField = createTextField(160,400,150,30,"");
		
		priceLabel = createLabel(10,440,150,30,"Price");
		priceTextField = createTextField(160,440,150,30,"");
		
		createPlayerButton = createButton(10,480,300,30,"Create and Assign Player");
		
		updatePlayerButton = createButton(10,520,145,30,"Update");
		updatePlayerButton.setBackground(new Color(66, 179, 255));
		updatePlayerButton.setForeground(Color.WHITE);
		
		removePlayerButton = createButton(165,520,145,30,"Remove");
		removePlayerButton.setBackground(Color.RED);
		removePlayerButton.setForeground(Color.WHITE);
		
		searchTextField = createTextField(330,5,140,30,"");
		searchTeamButton = createButton(480,5,140,30,"Search Team");
		
		saveChangesButton = createButton(625,5,145,30,"Save Changes");
		saveChangesButton.setBackground(Color.YELLOW);
		saveChangesButton.setBackground(Color.YELLOW);
		
		
		
		
		screen = new JTextArea();
		screen.setFont(font15);
		JScrollPane scrollPane = new JScrollPane(screen);
		scrollPane.setBounds(330,40,440,510);
		this.add(scrollPane);
		updateScreen();
		
		JLabel background = new JLabel(new ImageIcon("./images/bg.jpg"));
		background.setBounds(0,0,800,600);
		this.add(background);
		
		this.setVisible(true);
	}
	
	JLabel createLabel(int x,int y, int w, int h,String text){
		JLabel c = new JLabel(text);
		c.setBounds(x,y,w,h);
		c.setFont(font15);
		//c.setOpaque(true);
		//c.setBackground(Color.GRAY);
		c.setForeground(Color.WHITE);
		this.add(c);
		return c;
	}
	
	JTextField createTextField(int x,int y, int w, int h,String text){
		JTextField c = new JTextField(text);
		c.setBounds(x,y,w,h);
		c.setFont(font15);
		c.addActionListener(this);
		this.add(c);
		return c;
	}
	
	JButton createButton(int x,int y, int w, int h,String text){
		JButton c = new JButton(text);
		c.setBounds(x,y,w,h);
		c.setFont(font15);
		c.setBackground(new Color(66, 245, 179));
		//c.setForeground(Color.WHITE);
		c.addActionListener(this);
		c.addMouseListener(this);
		this.add(c);
		return c;
	}
	
	public void updateScreen(){
		String allTeamData = "";
		for(int i=0;i<teams.length;i++){
			if(teams[i]!=null){
				allTeamData+= i+". "+teams[i].getTeam()+"\n";
			}
		}
		screen.setText(allTeamData);
	}
	
	@Override
	public void actionPerformed(ActionEvent e){
				
		if(e.getSource() == createTeamButton){
			String tno = createTeamNoTextField.getText();
			String tname = teamNameTextField.getText();
			
			if(!tno.isEmpty() && !tname.isEmpty()){
				if(teams[Integer.parseInt(tno)]==null){
					teams[Integer.parseInt(tno)] = new Team(tname);
					updateScreen();
				}
				else{
					JOptionPane.showMessageDialog(this,"Team No. Taken !","Warning",JOptionPane.WARNING_MESSAGE);
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Enter Team No. and Team Name!","Warning",JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(e.getSource() == createPlayerButton){
			String tno = playerTeamNoTextField.getText();
			String pno = positionTextField.getText();
			String name = nameTextField.getText();
			String jno = jerseyNoTextField.getText();
			String price = priceTextField.getText();
			
			if(!tno.isEmpty() && !pno.isEmpty() && !name.isEmpty() && 
				!jno.isEmpty() && !price.isEmpty()){
				
				Player p = new Player(name,Integer.parseInt(jno),Double.parseDouble(price));
				teams[Integer.parseInt(tno)].insertPlayer(Integer.parseInt(pno), p);
				updateScreen();
			}	
		}
		else if(e.getSource() == removeTeamButton){
			String tno = createTeamNoTextField.getText();
			if(!tno.isEmpty()){
				if(JOptionPane.showConfirmDialog(this,"Are You Sure to Remove The Player")== JOptionPane.YES_OPTION){
					teams[Integer.parseInt(tno)] = null;
					updateScreen();
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Enter Team No.!","Warning",JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(e.getSource() == removePlayerButton){
			
			String tno = playerTeamNoTextField.getText();
			String pno = positionTextField.getText();
			if(!tno.isEmpty() && !pno.isEmpty()){
				if(JOptionPane.showConfirmDialog(this,"Are You Sure to Remove The Player")== JOptionPane.YES_OPTION){
					teams[Integer.parseInt(tno)].removePlayer(Integer.parseInt(pno));
					updateScreen();
				}
			}
			else{
				JOptionPane.showMessageDialog(this,"Enter Team No. and Player Position!","Warning",JOptionPane.WARNING_MESSAGE);
			}
		}
		else if(e.getSource() == teamClearButton){
			createTeamNoTextField.setText("");
			teamNameTextField.setText("");
		}
		else if(e.getSource() == playerClearButton){
			playerTeamNoTextField.setText("");
			positionTextField.setText("");
			nameTextField.setText("");
			jerseyNoTextField.setText("");
			priceTextField.setText("");
		}
		else if(e.getSource() == saveChangesButton){
			if(JOptionPane.showConfirmDialog(this,"Save Changes?")== JOptionPane.YES_OPTION){
				//FileIO.saveChangesInFile(teams);
			}
		}
	}
	
	public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
		if(me.getSource() == createTeamButton){
			createTeamButton.setBackground(new Color(66, 200, 100));
			createTeamButton.setForeground(Color.WHITE);
		}
		if(me.getSource() == saveChangesButton){
			Random random = new Random();
			int randX = random.nextInt(750);
			int randY = random.nextInt(550);
			saveChangesButton.setLocation(randX,randY);
		}
	}
	public void mouseExited(MouseEvent me){
		if(me.getSource() == createTeamButton){
			createTeamButton.setBackground(new Color(66, 245, 179));
			createTeamButton.setForeground(Color.BLACK);
		}
	}
	
	
	
}