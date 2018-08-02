package classes;

import java.util.Scanner;

public class Date {
	Scanner sc = new Scanner(System.in);
	Date()
	{
			
		System.out.print("Enter the date in format");
		String dat= sc.next();
		String arr2[]= {"Invalid","January","February","March","April","May","June","July","August","September","October","Novemeber","December"};
		String arr[]= dat.split(",");
		
		int s=Integer.parseInt(arr[1]);
		System.out.println(arr[0]+"/"+arr2[s]+"/"+arr[2]);
	}
}
