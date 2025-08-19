public class VariableType{
	static{
		System.out.println("Loading VariableType class.");
	}
	private int instanceVariable;
	public static int classVariable=200;
	
	public void setInstanceVariable(int value){
		instanceVariable = value;
	}
	public int getInstanceVariable(){
		return instanceVariable;
	}
	static{
		System.out.println("VariableType class Loaded.");
	}
}