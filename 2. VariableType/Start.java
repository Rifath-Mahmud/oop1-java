public class Start{
	public static void main(String[] args){
		System.out.println("Class Variable: "+VariableType.classVariable);
		
		VariableType vt1 = new VariableType();
		VariableType vt2 = new VariableType();
		
		vt1.setInstanceVariable(111);
		vt2.setInstanceVariable(222);
		VariableType.classVariable = 500;
		
		System.out.println("Class Variable: "+vt1.classVariable);
		System.out.println("Instance Variable: "+vt1.getInstanceVariable());
		
		System.out.println("Class Variable: "+vt2.classVariable);
		System.out.println("Instance Variable: "+vt2.getInstanceVariable());
		
		System.out.println();
		System.out.println("Some Class Variable from Wrapper Class");
		System.out.println("Max Integer: "+Integer.MAX_VALUE);
		System.out.println("Min Integer: "+Integer.MIN_VALUE);
		System.out.println("SIZE int Bits: "+Integer.SIZE);
		
	}
}