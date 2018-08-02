package classes;

import java.util.Scanner;

public class Customer {
	Scanner sc = new Scanner(System.in);	
	private String buildingNumber;
	private String sector;
	private String name;
	private String city;
	private String state;
	private int pinCode;
	
	Customer()
	{
		System.out.print("Enter Name");
		name = sc.next();
		System.out.print("Enter Building Number");
		buildingNumber = sc.next();
		System.out.print("Enter Sector");
		sector = sc.next();
		System.out.print("Enter City");
		city = sc.next();
		System.out.print("Enter State");
		state = sc.next();
		System.out.print("Enter Pin Code");
		pinCode = sc.nextInt();
	}
	
	public void display()
	{
		System.out.print("Welcome"+name);
		System.out.print("\n Your address is:"+buildingNumber+", Sector: "+sector+", "+city+", "+state+", "+pinCode);
	}
}
