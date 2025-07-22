//Code for Student.java file
// Define a class named Student
public class Student {
    
    // Private fields for encapsulation
    private String name;
    private String id;
    private int age;
    private float cgpa;
    public static int studentCount;
	
    // Default constructor
    public Student() {
        System.out.println("E-Constructor");
	studentCount++;
    }
	
    // Parameterized constructor with name, id, age, and cgpa
    public Student(String name, String id, int age, float cgpa) {
	System.out.println("P-Constructor");
        // Set the values using setter methods
	setName(name);
        setId(id);
        setAge(age);
        setCgpa(cgpa);
		
	studentCount++;
    }

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for id
    public void setId(String id) {
        this.id = id;
    }

    // Getter method for id
    public String getId() {
        return id;
    }

    // Setter method for age with validation
    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age should be positive");
        }
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for cgpa with validation
    public void setCgpa(float cgpa) {
        if (cgpa >= 0 && cgpa <= 4) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA");
        }
    }

    // Getter method for cgpa
    public float getCgpa() {
        return cgpa;
    }

    // Method to display student details
    public void showDetails() {
        System.out.println("------------------");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("------------------");
    }
}
