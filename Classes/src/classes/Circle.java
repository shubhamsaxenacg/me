package classes;
import java.util.*;
public class Circle {
	Scanner sc = new Scanner(System.in);	
	private double radius;
	private double area;
	
	Circle()
	{
		System.out.print("Enter the radius of rectangle");
		radius = sc.nextInt();
	}
	
	public double areaOfCircle()
	{
		area= 3.14*radius*radius;
		return area;
	}
}
