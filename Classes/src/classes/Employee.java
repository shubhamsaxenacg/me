package classes;

import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);	
	private String id;
	private String department;
	private String name;
	private String manager;
	
	
	Employee()
	{
		System.out.print("Enter Name");
		name = sc.next();
		System.out.print("Enter ID");
		id = sc.next();
		System.out.print("Enter department");
		department = sc.next();
		System.out.print("Enter manager");
		manager = sc.next();
		
	}
	
	public void display()
	{
		System.out.print("Welcome"+name);
		System.out.print("\nID: "+id);
		System.out.print("\ndepartment: "+department);
		System.out.print("\nManager: "+manager);
	}
}
