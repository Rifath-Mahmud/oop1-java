package files;
import java.io.*;//File, FileWriter, FileNotFoundException 
import java.util.*;
import entity.*;
import manager.*;

public class FileIO{
	public static void loadFromFile(Inventory inventory){
		try{
			File fileElectornics = new File("files/electronics.txt");
			Scanner sc = new Scanner(fileElectornics);
			int productNo = 0;
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				String data[] = line.split(";");
				String id = data[0];
				String name = data[1];
				double price = Double.parseDouble(data[2]);
				double quantity = Double.parseDouble(data[3]);
				int months = Integer.parseInt(data[4]);
				
				inventory.addProduct(productNo++,new Electronics(id,name,price,quantity,months));
			}
			sc.close();
			
			File fileClothing = new File("files/clothing.txt");
			sc = new Scanner(fileClothing);
			while(sc.hasNextLine()){
				String line = sc.nextLine();
				String data[] = line.split(";");
				String id = data[0];
				String name = data[1];
				double price = Double.parseDouble(data[2]);
				double quantity = Double.parseDouble(data[3]);
				String size = data[4];
				String materials = data[5];
				
				inventory.addProduct(productNo++,new Clothing(id,name,price,quantity,size,materials));
			}
			sc.close();
			
		}
		catch(FileNotFoundException e){
			System.out.println(e.getMessage());
		}
	}
	
	public static void writeInFile(Inventory inventory){
		try{
			FileWriter electronicsWriter = new FileWriter( new File("files/electronics.txt"));
			FileWriter clothingWriter = new FileWriter( new File("files/clothing.txt"));
			
			Product products[] = inventory.getAll();
			
			for(Product p : products){
				if(p instanceof Electronics){
					Electronics ep = (Electronics) p;
					String line = ep.getId()+";"+ep.getName()+";"+ep.getPrice()+";"
									+ep.getQuantity()+";"+ep.getMonths()+"\n";
					electronicsWriter.write(line);
					//electronicsWriter.flush();
				}
				else if(p instanceof Clothing){
					Clothing cp = (Clothing) p;
					String line = cp.getId()+";"+cp.getName()+";"+cp.getPrice()+";"
									+cp.getQuantity()+";"+cp.getSize()+";"+cp.getMaterials()+"\n";
					clothingWriter.write(line);
					//clothingWriter.flush();
				}
			}
			electronicsWriter.close();
			clothingWriter.close();
		}
		catch(IOException e){
			System.out.println(e.getMessage());
		}
	}
	
}