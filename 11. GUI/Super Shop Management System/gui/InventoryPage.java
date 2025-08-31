package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


import entity.*;
import manager.*;

public class InventoryPage implements ActionListener{
	JFrame frame = new JFrame("Inventory Page");
	Font font15 = new Font("Cambria",Font.BOLD,15);
	Font font20 = new Font("Cambria",Font.BOLD,20);
	
	JLabel noLabel, idLabel, nameLabel, priceLabel, quantityLabel, monthsLabel;
	JTextField noField, idField, nameField, priceField, quantityField, monthsField;
	JButton addBtn, updateBtn, deleteBtn;
	JTextArea screen;
	
	Inventory inventory = new Inventory(500);
	
	public InventoryPage(){
		frame.setSize(700,600);//w, h
		//frame.setLocation(500,400);//x,y
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setIconImage(new ImageIcon("./images/icon.png").getImage());
		
		//========== Inventory Data Initialization =======
		inventory.addProduct(0, new Electronics("100","E0",5000,6));
		inventory.addProduct(1, new Electronics("101","E1",3400,12));
		inventory.addProduct(2, new Electronics("102","E2",2800,24));
		inventory.addProduct(3, new Electronics("103","E3",2500,3));
		inventory.addProduct(4, new Clothing("104","C1",1500,"XL","Cotton"));
		inventory.addProduct(5, new Clothing("105","C2",800,"L","Cotton"));
		
		//System.out.println(inventory.toString());
		
		//================================================
		
		
		JLabel welcomeLabel = new JLabel("Welcome to Inventory Management");
		welcomeLabel.setBounds(10,10,300,30);//x,y,w,h
		welcomeLabel.setFont(font15);
		welcomeLabel.setOpaque(true);
		welcomeLabel.setBackground(new Color(84,253,218));
		welcomeLabel.setForeground(Color.BLACK);
		frame.add(welcomeLabel);
		
		
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
		
		
		monthsLabel = createLabel(x,y,w,h,"Warranty");
		monthsField = createTextField(x+w+xGap,y,w,h,"");
		y += h+yGap;
		
		addBtn = createButton(x,y,210,h,"Add");
		addBtn.setBackground(Color.GREEN);
		y += h+yGap;
		
		updateBtn = createButton(x,y,210,h,"Update");
		updateBtn.setBackground(Color.BLUE);
		updateBtn.setForeground(Color.WHITE);
		
		
		
		screen = new JTextArea();
		screen.setFont(font15);
		screen.setEditable(false);
		updateTextArea();
		
		JScrollPane jsp = new JScrollPane(screen);
		jsp.setBounds(310,50, 350, 400);
		frame.add(jsp);
		
		
		frame.setVisible(true);
	}
	
	public JLabel createLabel(int x,int y, int w, int h, String text){
		JLabel label = new JLabel(text);
		label.setBounds(x,y,w,h);
		label.setFont(font15);
		label.setOpaque(true);
		label.setBackground(new Color(84,253,218));
		label.setForeground(Color.BLACK);
		frame.add(label);
		return label;
	}
	
	public JTextField createTextField(int x,int y, int w, int h, String text){
		JTextField field = new JTextField(text);
		field.setBounds(x,y,w,h);
		field.setFont(font15);
		frame.add(field);
		return field;
	}
	
	public JButton createButton(int x,int y, int w, int h, String text){
		JButton button = new JButton(text);
		button.setBounds(x,y,w,h);
		button.setFont(font15);
		button.addActionListener(this);
		frame.add(button);
		return button;
	}
	
	public void updateTextArea(){
		screen.setText(inventory.toString());
	}
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource() == addBtn){
			System.out.println("Add Button Clicked");
			
			if(!noField.getText().isEmpty() && 
			!idField.getText().isEmpty() &&
			!nameField.getText().isEmpty() &&
			!priceField.getText().isEmpty() &&
			!quantityField.getText().isEmpty() &&
			!monthsField.getText().isEmpty()){
				int no = Integer.parseInt( noField.getText() );
				String id = idField.getText();
				String name = nameField.getText();
				double price = Double.parseDouble( priceField.getText() );
				double quantity = Double.parseDouble( quantityField.getText() );
				int months = Integer.parseInt( monthsField.getText() );
				
				inventory.addProduct(no, new Electronics(id,name,price,quantity,months));
				updateTextArea();	
				
				JOptionPane.showMessageDialog(frame,"New Product Added.");
				
				noField.setText("");
				idField.setText("");
				nameField.setText("");
				priceField.setText("");
				quantityField.setText("");
				monthsField.setText("");
				
			}
			else{
				JOptionPane.showMessageDialog(frame,"Enter All Data","Warning", JOptionPane.WARNING_MESSAGE);
			}
			
			
			
		}
		else if(ae.getSource() == updateBtn){
			System.out.println("Update Button Clicked");
		}
	}
	
}