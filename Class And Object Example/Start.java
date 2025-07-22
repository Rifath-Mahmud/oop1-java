//Code for Start.java file
// Define a class named Start
public class Start {
    
    // Main method, the entry point of the program
    public static void main(String[] args) {
		// Create an instance of the Student class using the parameterized constructor
		Student s1 = new Student("KARIM", "XX-XXXX-X", 20, 3.5f);
		// Display the details of the first student
		s1.showDetails();
	
		// Create another instance of the Student class using the default constructor
		Student s2 = new Student();
		// Set values for the second student using setter methods
		s2.setName("KAMAL");
		s2.setId("XX-XXXXX-Y");
		s2.setAge(20);
		// Attempt to set an invalid age (negative value)
		s2.setAge(-20);
		// Set a valid CGPA for the second student
		s2.setCgpa(3.5f);
		// Attempt to set an invalid CGPA (value greater than 4)
		s2.setCgpa(7.5f);
		
		// Display the details of the second student
		s2.showDetails();
    }
}
