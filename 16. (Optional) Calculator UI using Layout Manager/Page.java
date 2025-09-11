import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page implements ActionListener{
	JFrame frame = new JFrame("Page");
	Font font15 = new Font("Cambria",Font.BOLD,15);
	Font font20 = new Font("Cambria",Font.BOLD,20);
	Font font30 = new Font("Cambria",Font.BOLD,30);
	
	JPanel nPanel, sPanel, ePanel, wPanel, cPanel;
	JTextField screen;	
	
	String numberText = "0123456789.";
	JButton numberBtns[] = new JButton[numberText.length()];
	
	String operatorText = "+-*/%^=()";
	JButton operatorBtns[] = new JButton[operatorText.length()];
	
	String triFunctionsText[] = new String[]{"sin", "cos", "tan", "cot"};
	JButton triFunctionsBtns[] = new JButton[operatorText.length()];


	
	public Page(){
		frame.setSize(400,500);//w, h
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new BorderLayout(5,5));
		
		nPanel = new JPanel(new GridLayout(0,1,10,10));
		sPanel = new JPanel(new GridLayout(0,1));
		ePanel = new JPanel(new GridLayout(0,1,2,2));
		wPanel = new JPanel(new GridLayout(0,1,2,2));
		cPanel = new JPanel(new GridLayout(0,3,10,10));
		
		nPanel.setBackground(Color.GREEN);
		sPanel.setBackground(Color.RED);
		ePanel.setBackground(Color.YELLOW);
		wPanel.setBackground(Color.BLUE);
		cPanel.setBackground(Color.GRAY);
	
		frame.add(nPanel, BorderLayout.NORTH);
		frame.add(sPanel, BorderLayout.SOUTH);
		frame.add(ePanel, BorderLayout.EAST);
		frame.add(wPanel, BorderLayout.WEST);
		frame.add(cPanel, BorderLayout.CENTER);
		
		
		screen = new JTextField("");
		screen.setFont(font20);
		screen.setPreferredSize(new Dimension(300,70));
		screen.setBackground(Color.BLACK);
		screen.setForeground(Color.WHITE);
		nPanel.add(screen);
		
		for(int i=0;i<numberText.length();i++){
			numberBtns[i] = new JButton(numberText.charAt(i)+"");
			numberBtns[i].setBackground(Color.BLACK);
			numberBtns[i].setForeground(Color.WHITE);
			numberBtns[i].setFont(font30);
			numberBtns[i].addActionListener(this);
			cPanel.add(numberBtns[i]);
		}
		
		for(int i=0;i<operatorText.length();i++){
			
			operatorBtns[i] = new JButton(operatorText.charAt(i)+"");
			operatorBtns[i].setBackground(Color.GRAY);
			operatorBtns[i].setForeground(Color.WHITE);
			operatorBtns[i].setFont(font30);
			operatorBtns[i].addActionListener(this);
			if(operatorText.charAt(i)=='='){
				sPanel.add(operatorBtns[i]);
				continue;
			}
			ePanel.add(operatorBtns[i]);
		}
		
		for(int i=0;i<triFunctionsText.length;i++){
			triFunctionsBtns[i] = new JButton(triFunctionsText[i]+"");
			triFunctionsBtns[i].setBackground(Color.WHITE);
			triFunctionsBtns[i].setForeground(Color.BLACK);
			triFunctionsBtns[i].setFont(font30);
			triFunctionsBtns[i].addActionListener(this);
			wPanel.add(triFunctionsBtns[i]);
		}
		
		frame.setVisible(true);
	
	}
	
	public void actionPerformed(ActionEvent ae){
		screen.setText(screen.getText()+ae.getActionCommand());
	}
	
}