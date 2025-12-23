package gui;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

import entity.*;
import manager.*;

public class InventoryPage extends JFrame implements ActionListener{
	Font font15 = new Font("Consoles",Font.BOLD,15);
	JComboBox type;
	JLabel noLabel, idLabel, nameLabel, priceLabel, quantityLabel, monthsLabel, sizeLabel, materialsLabel;
	JTextField noField, idField, nameField, priceField, quantityField, monthsField, sizeField, materialsField;
	JButton addBtn, updateBtn, deleteBtn;
	
	JTextArea outputArea;
	
	Inventory inventory;
	
	public InventoryPage(){
		//Frame SetUp
		super("Inventory Page");
		this.setSize(700,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(null);
		
		//inventory data
		inventory = new Inventory(500);
		//inventory.addProduct(0, new Product("101","P1",200,30));
		//inventory.addProduct(1, new Product("102","P2",300,30));
		inventory.addProduct(0, new Electronics("100","E0",3000,12));
		inventory.addProduct(1, new Electronics("101","E1",2000,12));
		inventory.addProduct(2, new Electronics("102","E2",3500,12));
		inventory.addProduct(3, new Electronics("103","E3",2500,12));
		inventory.addProduct(4, new Clothing("104","C1",1500,"XL","Cotton"));
		inventory.addProduct(5, new Clothing("105","C1",800,"L","Cotton"));
		inventory.addProduct(6, new Clothing("106","C2",800,"L","Cotton"));
		inventory.addProduct(7, new Clothing("107","C2",800,"XL","Cotton"));
		
		int x=20,y=20,w=100,h=30 , xGap=10, yGap = 10;
		
		noLabel = createLabel(x,y,w,h,"Product No.");
		noField = createTextField(x+w+xGap,y,w,h,"");
		y+= h+xGap;
		
		idLabel = createLabel(x,y,w,h,"ID");
		idField = createTextField(x+w+xGap,y,w,h,"");
		y+= h+xGap;
		
		nameLabel = createLabel(x,y,w,h,"Name");
		nameField = createTextField(x+w+xGap,y,w,h,"");
		y+= h+xGap;
		
		priceLabel = createLabel(x,y,w,h,"Price");
		priceField = createTextField(x+w+xGap,y,w,h,"");
		y+= h+xGap;
		
		quantityLabel = createLabel(x,y,w,h,"Stock");
		quantityField = createTextField(x+w+xGap,y,w,h,"");
		y+= h+xGap;
		
		type = new JComboBox(new String[]{"Electronics","Clothing"});
		type.setBounds(x,y,2*w+xGap,h);
		type.addActionListener(this);
		this.add(type);
		y+= h+xGap;
		
		monthsLabel = createLabel(x,y,w,h,"Warranty");
		monthsField = createTextField(x+w+xGap,y,w,h,"");
		//y+= h+xGap;
		
		
		sizeLabel = createLabel(x,y,w,h,"Size");
		sizeField = createTextField(x+w+xGap,y,w,h,"");
		y+= h+xGap;
		
		materialsLabel = createLabel(x,y,w,h,"Materials");
		materialsField = createTextField(x+w+xGap,y,w,h,"");
		y+= h+xGap;
		
		sizeLabel.setVisible(false);
		sizeField.setVisible(false);
		materialsLabel.setVisible(false);
		materialsField.setVisible(false);
		
		
		addBtn = createButton(x,y,2*w+xGap,h,"Add");
		y+= h+xGap;
		
		updateBtn = createButton(x,y,2*w+xGap,h,"Update");
		updateBtn.setBackground(Color.RED);
		y+= h+xGap;
		
		
		//outputArea = new JTextArea();
		//outputArea.setFont(font15);
		//JScrollPane jsp = new JScrollPane(outputArea);
		//outputArea.setText(inventory.toString());
		
		JPanel allProductsPanel = new JPanel();
		allProductsPanel.setLayout(new BoxLayout(allProductsPanel,BoxLayout.Y_AXIS));
		JScrollPane jsp = new JScrollPane(allProductsPanel);
		jsp.setBounds(300,30,350,300);
		
		for(Product p : inventory.getAll()){
			if(p!=null){
				allProductsPanel.add(createProductPanel(p));
			}
		}
		
		this.add(jsp);
		
		//Show Frame
		this.setVisible(true);
	}

	JLabel createLabel(int x,int y, int w, int h,String text){
		JLabel c = new JLabel(text);
		c.setBounds(x,y,w,h);
		c.setFont(font15);
		//c.setOpaque(true);
		//c.setBackground(Color.GRAY);
		c.setForeground(Color.BLACK);
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
		this.add(c);
		return c;
	}

	
	public JPanel createProductPanel(Product p){
		JPanel productPanel = new JPanel(new GridLayout(0,2,5,5));
		productPanel.add(new JLabel("ID"));
		productPanel.add(new JLabel(p.getId()));
		productPanel.add(new JLabel("Name"));
		productPanel.add(new JLabel(p.getName()));
		productPanel.add(new JLabel("Price"));
		productPanel.add(new JLabel(""+p.getPrice()));
		
		if(p instanceof Electronics){
			productPanel.add(new JLabel("Warranty"));
			productPanel.add(new JLabel(""+((Electronics)p).getMonths()));
		}
		else if(p instanceof Clothing){
			productPanel.add(new JLabel("Size"));
			productPanel.add(new JLabel(((Clothing)p).getSize()));
			productPanel.add(new JLabel("Material"));
			productPanel.add(new JLabel(((Clothing)p).getMaterials()));
		}
		
		productPanel.setPreferredSize(new Dimension(150,100));
		productPanel.setMaximumSize(new Dimension(150,100));
		productPanel.setBackground(new Color(100,200,200));
		productPanel.setBorder(BorderFactory.createLineBorder(Color.WHITE,2));
		return productPanel;
	}
	
	public void actionPerformed(ActionEvent ae){
		if(ae.getSource()==type){
			if(type.getSelectedItem().toString().equals("Electronics")){
				monthsLabel.setVisible(true);
				monthsField.setVisible(true);
				
				sizeLabel.setVisible(false);
				sizeField.setVisible(false);
				materialsLabel.setVisible(false);
				materialsField.setVisible(false);
			}
			else if(type.getSelectedItem().toString().equals("Clothing")){
				monthsLabel.setVisible(false);
				monthsField.setVisible(false);
				
				sizeLabel.setVisible(true);
				sizeField.setVisible(true);
				materialsLabel.setVisible(true);
				materialsField.setVisible(true);

			}
		}
	}
}