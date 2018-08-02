package question10;

import java.util.Scanner;

public class ShapeDemo {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		Shape shape[] = new Shape[5];
		System.out.println("Enter the no. of shapes to be drawn....");
		int quantity = scanner.nextInt();
		for(int i=0; i<quantity; i++)
		{
			System.out.println("1. Circle \n2. Rectangle");
			int option = scanner.nextInt();
			
			switch(option) {
			
				case 1: shape[i] = new Circle();
						shape[i].draw();
						break;
				
				case 2: shape[i] = new Rectangle();
						shape[i].draw();
						break;
			}
			
		}
		scanner.close();
	}
}
