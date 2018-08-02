package car;

import java.util.Scanner;

public class VehicleMain {
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		Vehicle vehicle = new Vehicle();
		String name;
		System.out.println("Enter the amount of vehicles...");
		int number = scanner.nextInt();
		for(int i=0; i<number; i++)
		{
			System.out.println("Enter your name....");
			name = scanner.next();
			Vehicle vehicle1[] = new Vehicle[number];
			vehicle1[i] = new Vehicle(name);
		
			
			int option;
			do {
				System.out.println("Enter your option.....");
				System.out.println("1. Change Speed");
				System.out.println("2. Stop Speed");
				System.out.println("3. Change direction (give angle)");
				System.out.println("4. Change direction (give left or right)");
				System.out.println("5. Give highest ID");
				System.out.println("6. Get Information");
				System.out.println("7. Exit");
				
				option = scanner.nextInt();
				
				switch (option) {
				case 1:
					System.out.println("Enter speed");
					int speed = scanner.nextInt();
					vehicle1[i].changeSpeed(speed);
					System.out.println("Speed changed");
					break;
					
				case 2:
					vehicle1[i].stopSpeed();
					System.out.println("vehicle Stopped");
					break;
					
				case 3:
					System.out.println("Enter direction");
					double directionAngle = scanner.nextDouble();
					double finalAngle = vehicle1[i].turn(directionAngle);
					System.out.println("Direction is "+finalAngle);
					break;
					
				case 4:
					System.out.println("Enter left or right");
					String directionAngle2 = scanner.next();
					double finalAngle2 = vehicle1[i].turn(directionAngle2);
					System.out.println("Direction is "+finalAngle2);
					break;
					
				case 5:
					
					int highest = Vehicle.getHighestVehicleId();
					System.out.println("highest vehicle Id is :  "+highest);
					break;
				
				case 6:
					
					String information = vehicle1[i].toString();
					System.out.println(information);
					
				case 7:
					break;
	
				default:
					System.out.println("Invalid Option");
					break;
				}
				
				
				
				
			}while(option!=7);
			
		}
		
		
		scanner.close();
	}
}
