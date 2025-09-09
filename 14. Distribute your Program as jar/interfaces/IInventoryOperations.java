package interfaces;
import entity.*;
public interface IInventoryOperations{
	public abstract void addProduct(int pNo, Product p);
	public abstract Product getProduct(int pNo);
	public abstract Product getProductById(String id);
	public abstract void remove(int pNo);
	//public abstract void removeById(String id);
}