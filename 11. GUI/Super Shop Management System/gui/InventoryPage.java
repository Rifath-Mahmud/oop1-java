package gui;
import javax.swing.*;
import java.awt.*;

public class InventoryPage extends JFrame{
	Font font15 = new Font("Cambria",Font.BOLD,15);
	JLabel noLabel, idLabel, nameLabel, priceLabel, quantityLabel, monthsLabel;
	JTextField noField, idField, nameField, priceField, quantityField, monthsField;
	
	public InventoryPage(){
		super("Inventory Page");
		this.setSize(700,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Welcome to Inventory Management");
		welcomeLabel.setBounds(10,10,300,30);//x,y,w,h
		welcomeLabel.setFont(font15);
		this.add(welcomeLabel);
		
		int x=10, y=50, w=100, h=30, xGap= 10, yGap=10;
		
		noLabel = createLabel(x,y,w,h,"Product No.");
		noField = createTextField(x+w+xGap,y,w,h,"");
		y += h+yGap;
		
		idLabel = createLabel(x,y,w,h,"Product ID");
		idField = createTextField(x+w+xGap,y,w,h,"");
		y += h+yGap;
		
		nameLabel = createLabel(x,y,w,h,"Name");
		nameField = createTextField(x+w+xGap,y,w,h,"");
		y += h+yGap;
		
		priceLabel = createLabel(x,y,w,h,"Price");
		priceField = createTextField(x+w+xGap,y,w,h,"");
		y += h+yGap;
		
		quantityLabel = createLabel(x,y,w,h,"Stock");
		quantityField = createTextField(x+w+xGap,y,w,h,"");
		y += h+yGap;
		
		this.setVisible(true);
	}
	
	public JLabel createLabel(int x,int y, int w, int h, String text){
		JLabel label = new JLabel(text);
		label.setBounds(x,y,w,h);
		label.setFont(font15);
		this.add(label);
		return label;
	}
	
	public JTextField createTextField(int x,int y, int w, int h, String text){
		JTextField field = new JTextField(text);
		field.setBounds(x,y,w,h);
		field.setFont(font15);
		this.add(field);
		return field;
	}
	
}