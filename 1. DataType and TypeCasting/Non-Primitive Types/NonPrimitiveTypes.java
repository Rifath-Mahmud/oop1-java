import java.lang.*;
public class NonPrimitiveTypes{
	public static void main(String[] args){
		System.out.println("Any User Defined Type or Library Classes are Non Premitive Type");
		
		String s = "String is a Non Primitive Type";
		System.out.println(s);
		
		 // Integer Wrapper Example
        System.out.println("\nWrapper Classes are Non-Primitive Types");

        Integer i = 10;
        System.out.println("\n--- Integer Wrapper ---");
        System.out.println("Value: " + i);
        System.out.println("Max Value: " + Integer.MAX_VALUE);
        System.out.println("Min Value: " + Integer.MIN_VALUE);
        System.out.println("Size in Bits: " + Integer.SIZE);

        // Byte Wrapper Example
        Byte b = 100;
        System.out.println("\n--- Byte Wrapper ---");
        System.out.println("Value: " + b);
        System.out.println("Max Value: " + Byte.MAX_VALUE);
        System.out.println("Min Value: " + Byte.MIN_VALUE);
        System.out.println("Size in Bits: " + Byte.SIZE);

        // Short Wrapper Example
        Short sh = 32000;
        System.out.println("\n--- Short Wrapper ---");
        System.out.println("Value: " + sh);
        System.out.println("Max Value: " + Short.MAX_VALUE);
        System.out.println("Min Value: " + Short.MIN_VALUE);
        System.out.println("Size in Bits: " + Short.SIZE);

        // Long Wrapper Example
        Long l = 9999999999L;
        System.out.println("\n--- Long Wrapper ---");
        System.out.println("Value: " + l);
        System.out.println("Max Value: " + Long.MAX_VALUE);
        System.out.println("Min Value: " + Long.MIN_VALUE);
        System.out.println("Size in Bits: " + Long.SIZE);

        // Float Wrapper Example
        Float f = 3.14f;
        System.out.println("\n--- Float Wrapper ---");
        System.out.println("Value: " + f);
        System.out.println("Max Value: " + Float.MAX_VALUE);
        System.out.println("Min Value: " + Float.MIN_VALUE);
        System.out.println("Size in Bits: " + Float.SIZE);

        // Double Wrapper Example
        Double d = 3.14159265359;
        System.out.println("\n--- Double Wrapper ---");
        System.out.println("Value: " + d);
        System.out.println("Max Value: " + Double.MAX_VALUE);
        System.out.println("Min Value: " + Double.MIN_VALUE);
        System.out.println("Size in Bits: " + Double.SIZE);

        // Character Wrapper Example
        Character c = 'A';
        System.out.println("\n--- Character Wrapper ---");
        System.out.println("Value: " + c);
        System.out.println("Is Letter: " + Character.isLetter(c));
        System.out.println("Is Digit: " + Character.isDigit(c));
        System.out.println("To Lower Case: " + Character.toLowerCase(c));
        System.out.println("Size in Bits: " + Character.SIZE);

        // Boolean Wrapper Example
        Boolean bool = true;
        System.out.println("\n--- Boolean Wrapper ---");
        System.out.println("Value: " + bool);
        System.out.println("Boolean TRUE constant: " + Boolean.TRUE);
        System.out.println("Boolean FALSE constant: " + Boolean.FALSE);
	}
}