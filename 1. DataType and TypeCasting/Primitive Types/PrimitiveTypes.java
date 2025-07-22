import java.lang.*;
public class PrimitiveTypes{
	public static void main(String[] args){
		 // Declaring and initializing a boolean variable
        boolean flag = true; // Stores either true or false (1-bit logical data)

        // Declaring and initializing a byte variable (8-bit signed integer, range: -128 to 127)
        byte b = 50;

        // Declaring and initializing a short variable (16-bit signed integer, range: -32,768 to 32,767)
        short s = 130;

        // Declaring and initializing an int variable (32-bit signed integer, range: ~±2 billion)
        int i = 99999;

        // Declaring and initializing a long variable (64-bit signed integer, add 'L' suffix for long literals)
        long largeNumber = 99999999999L;

        // Declaring and initializing a char variable (16-bit Unicode character)
        char c = 'A'; // Stores a single character

        // Declaring and initializing a float variable (32-bit floating point, add 'f' suffix)
        float f = 3.9f;

        // Declaring and initializing a double variable (64-bit floating point)
        double d = 0.00000000006673;

        // Printing all the variables using System.out.println()
        System.out.println("boolean true/false: " + flag);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + largeNumber);
        System.out.println("char: " + c);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
		
		
		 // === IMPLICIT CASTING (Widening: small -> large type) ===
        System.out.println("\n--- Implicit Casting (Widening) ---");
        int fromByte = b;              // byte to int
        long fromShort = s;            // short to long
        float fromInt = i;             // int to float
        double fromLong = largeNumber; // long to double
        int fromChar = c;              // char to int (gives ASCII)

        System.out.println("byte to int: " + fromByte);
        System.out.println("short to long: " + fromShort);
        System.out.println("int to float: " + fromInt);
        System.out.println("long to double: " + fromLong);
        System.out.println("char to int (ASCII): " + fromChar);

        // === EXPLICIT CASTING (Narrowing: large -> small type) ===
        System.out.println("\n--- Explicit Casting (Narrowing) ---");
        byte toByte = (byte) s;            // short to byte (may lose data)
        short toShort = (short) i;         // int to short (possible overflow)
        int toInt = (int) d;               // double to int (fraction lost)
        char toChar = (char) i;            // int to char (may be unprintable)
        float toFloat = (float) d;         // double to float (possible precision loss)

        System.out.println("short to byte: " + toByte);
        System.out.println("int to short: " + toShort);
        System.out.println("double to int: " + toInt);
        System.out.println("int to char: " + toChar);
        System.out.println("double to float: " + toFloat);

        // Note for boolean
        System.out.println("\nNote: boolean type cannot be cast to or from any other type.");
		
	}
}