package TimeSum;

import java.util.Scanner;

public class TimeTest {

	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		TimeSum time1 = new TimeSum();
		TimeSum time2 = new TimeSum();
		int hour1,minute1 ,hour2, minute2;
		
		System.out.println("Enter first time:   ");
		hour1 = scanner.nextInt();
		minute1 = scanner.nextInt();
		
		System.out.println("Enter second time:    ");
		hour2 = scanner.nextInt();
		minute2 = scanner.nextInt();
		
		time1.set(hour1,minute1);
		time2.set(hour2,minute2);
		System.out.println("First time is: ");
		time1.display();
		System.out.println("Second time is: ");
		time2.display();
		
		TimeSum time3 = new TimeSum();
		System.out.println("Final time is :    ");
		time3 = time3.sum(time1,time2);
		time3.display();
		
		scanner.close();
	}
}
