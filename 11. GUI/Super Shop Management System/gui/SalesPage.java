package gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import entity.*;
import manager.*;
import files.*;
public class SalesPage implements ActionListener{
	JFrame frame = new JFrame("Inventory Page");
	Font font15 = new Font("Cambria",Font.BOLD,15);
	Font font20 = new Font("Cambria",Font.BOLD,20);
	
	JTextArea inventoryScreen, cartScreen;
	JTextField noField,idField, quantityField;
	JButton addToCartBtn, confirmOrderBtn;
	
	
	
	Inventory inventory = new Inventory(500);
	Cart cart = new Cart(50);
	
	
	public SalesPage(){
		frame.setSize(800,600);//w, h
		//frame.setLocation(500,400);//x,y
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		frame.setIconImage(new ImageIcon("/images/icon.png").getImage());
		
		//========== Inventory Data Initialization =======
		FileIO.loadFromFile(inventory);
		
		//================================================
		
		
		JLabel welcomeLabel = new JLabel("Welcome to Point of Sales");
		welcomeLabel.setBounds(10,10,300,30);//x,y,w,h
		welcomeLabel.setFont(font15);
		welcomeLabel.setOpaque(true);
		welcomeLabel.setBackground(new Color(84,253,218));
		welcomeLabel.setForeground(Color.BLACK);
		frame.add(welcomeLabel, BorderLayout.NORTH);
		
		inventoryScreen = new JTextArea();
		inventoryScreen.setFont(font15);
		inventoryScreen.setEditable(false);
		updateInventoryTextArea();
		
		JScrollPane inventorySP = new JScrollPane(inventoryScreen);
		inventorySP.setBounds(10,50, 300, 400);
		frame.add(inventorySP);
		
		cartScreen = new JTextArea();
		cartScreen.setFont(font15);
		cartScreen.setEditable(false);
		updateCartTextArea();
		
		JScrollPane CartSP = new JScrollPane(cartScreen);
		CartSP.setBounds(450,50, 300, 400);
		frame.add(CartSP);
		
		createLabel(330,50,50,30,"No: ");
		noField = createTextField(380,50,50,30,"0");
		
		createLabel(330,90,50,30,"Id: ");
		idField = createTextField(380,90,50,30,"");
		
		createLabel(330,130,50,30,"Q: ");
		quantityField = createTextField(380,130,50,30,"");
		
		addToCartBtn = createButton(330,180,100,30,"Add");
		confirmOrderBtn = createButton(500,450,200,30,"Confirm Order");
	
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
	
	public void updateInventoryTextArea(){
		inventoryScreen.setText(inventory.toString());
	}
	public void updateCartTextArea(){
		cartScreen.setText(cart.toString());
	}
	
	public void actionPerformed(ActionEvent ae){
		
		if(ae.getSource() == addToCartBtn){
			System.out.println("Add Button Clicked");
			int no = Integer.parseInt(noField.getText());
			String id = idField.getText();
			double quantity = Double.parseDouble(quantityField.getText());
			
			Product p = inventory.getProductById(id);
			if(p!=null){
				if(cart.addItem(no,p,quantity)){
					updateCartTextArea();
					no++;
					noField.setText(no+"");
				}
				else{
					JOptionPane.showMessageDialog(frame, "Not Enough Stock");
				}
			}
			else{
				JOptionPane.showMessageDialog(frame,"No Product Found");
			}
		}
		else if(ae.getSource() == confirmOrderBtn){
			System.out.println("Confrim Button Clicked");
			
			if(JOptionPane.showConfirmDialog(frame,"Is Billing Completed? \n"+cart.toString()) == 0){
				cart.confirmOrder();
				updateCartTextArea();
				updateInventoryTextArea();
			}
		}
	}
	
}