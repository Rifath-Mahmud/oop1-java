import java.lang.*;
import java.util.Scanner;
public class Start {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Scanner scLine = new Scanner(System.in);
		
		System.out.print("Total Number of Students: ");
		int size = sc.nextInt();
		
		Student[] students = new Student[size];
		//System.out.println(students);
		//System.out.println(students[0]);
		
		for(int i=0;i<students.length;i++){
			
			System.out.println("Enter Details of Student: "+(i+1));
			
			System.out.print("Enter Name: ");
			String name = scLine.nextLine();
			
			System.out.print("Enter ID: ");
			String id = scLine.nextLine();
			
			System.out.print("Enter Age: ");
			int age = sc.nextInt();
			
			System.out.print("Enter Cgpa: ");
			float cgpa = sc.nextFloat();
			
			// Student s1 = new Student();
			// s1.setName(name);
			// s1.setId(id);
			// s1.setAge(age);
			// s1.setCgpa(cgpa);
				
			Student s1 = new Student(name,id,age,cgpa);
			
			students[i] = s1;
		}
		
		for(int i=0;i<students.length;i++){
			students[i].showDetails();
		}
		
	
	}
}
