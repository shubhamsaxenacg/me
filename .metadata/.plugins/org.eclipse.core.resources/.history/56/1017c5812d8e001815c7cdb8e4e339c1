package Distance;

import java.util.Scanner;

public class DistanceTest {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
				
		DistanceSum distance1=new DistanceSum();
		DistanceSum distance2=new DistanceSum();
		DistanceSum addDistance=new DistanceSum();
		
		System.out.println("Enter the 1st distance in feet and inches...");
		int feet1 = scanner.nextInt();
		int inch1 = scanner.nextInt();
		distance1.set(feet1,inch1);
		
		System.out.println("Enter the 2nd distance in feet and inches...");
		int feet2 = scanner.nextInt();
		int inch2 = scanner.nextInt();
		distance2.set(feet2,inch2);
		
		addDistance=addDistance.add(distance1, distance2);
		addDistance.disp();
		
	}

}
