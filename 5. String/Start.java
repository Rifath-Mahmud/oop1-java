import java.lang.*;
public class Start{
	public static void main(String[] args){
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = s1;
		String s4 = new String("Hello World");
		
		System.out.println("Compare Ref.");
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s1==s4);
		
		System.out.println("Compare Value");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		String email = "KARim.RAHman123@yahoo.com";
		System.out.println("Length of a String: "+email.length());
		System.out.println("Index Of a Character: "+email.indexOf('@'));
		System.out.println("Index Of a Character: "+email.indexOf('#'));
		System.out.println("Index Of a Sub String: "+email.indexOf(".com"));
		System.out.println("Char At Index: "+email.charAt(3));
		
		String userName = email.substring(0,email.indexOf('@'));
		String domain = email.substring(email.indexOf('@')+1);
		System.out.println(userName);
		System.out.println(domain);
		
		System.out.println(userName.toLowerCase());
		System.out.println(domain.toUpperCase());
		
		System.out.println(userName);
		System.out.println(domain);
		
		String s5 = ""; //empty string
		String s6 = " ";
		
		System.out.println(s5.isEmpty());
		System.out.println(s6.isEmpty());
		
		String s7 = "First";
		String s8= "Second";
		
		System.out.println(s7+" "+s8);
		System.out.println(s7.concat(" ").concat(s8));
		
		String s9 =  "ABCEFGHIJ";
		String s10 = "ABC";
		System.out.println(s10.compareTo(s9));
		
		
	}
}