package question1;

public class Second extends First{
	
	int a2;
	int b2;
	
	Second()
	{
		super(10,20); //.....Calls constructor of it parent i.e First
		
		System.out.println("Second Class");
	}

	
	public void display()
	{
		super.display(); //.......super.display calls the display function of immediate parent
		System.out.println("Displaying Second class...");
	}
	
	public void displayNew()
	{
		System.out.println("Displaying Second class new...");
	}

}
