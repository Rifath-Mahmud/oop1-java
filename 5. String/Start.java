import java.lang.*;
public class Start {
    public static void main(String[] args) {
		String s1 = "Hello World";
		String s2 = "Hello World";
		String s3 = new String("Hello World");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s2.equals(s3));
		
		String email = "jamal.uddin.karim@aiub.edu";
		System.out.println(email);
		System.out.println("Length of Email: "+ email.length() );
		System.out.println("Index of @: "+ email.indexOf('@') );
		System.out.println("Index of #: "+ email.indexOf('#') );
		System.out.println("Index of gmail: "+ email.indexOf("@gmail.com") );
		System.out.println("Index of outlook: "+ email.indexOf("@outlook.com") );
		
		//System.out.println("Domain Name: "+email.substring(5));
		//System.out.println("Domain Name: "+email.substring(5,11));
		
		//String domain = email.substring(email.indexOf('@')+1 , email.indexOf(".com") );
		String temp = email.substring(email.indexOf('@')+1);
		String domain = temp.substring(0, temp.indexOf('.'));
		System.out.println("Domain Name: "+domain);
		
		String number = "017XXXXXXXX";
		//System.out.println(number.charAt(2) == '7');
		//System.out.println(number.startsWith("017"));
		System.out.println( number.charAt( number.length()-1 -8) );
		
		String name = "Jmala UDDin";
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		name = name.toUpperCase();
		System.out.println(name);
		
		String s4 = "First String";
		String s5 = "Second String";
		
		System.out.println(s4+" "+s5);
		System.out.println(s4.concat(" ").concat(s5));
		
		String s6=" ";
		String s7="";
		System.out.println(s6.isEmpty());
		System.out.println(s7.isEmpty());
		
    }
}
