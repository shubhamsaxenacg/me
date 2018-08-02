package question1;
//....Contains constructor with no parameter and two parameters
public class First {
	int a1;
	int b1;

//....No parameter Constructor
	First()
	{
		System.out.println("First Class without parameter in constructor");
	}
//...Constructor with two parameters
	First(int a1, int b1)
	{
		this.a1 = a1;
		this.b1 = b1;
		System.out.println("This is First Class with parameter passed in constructor");
	}
//Display function 	
	public void display()
	{
		System.out.println("Displaying First class...");
	}
	//Display function 	
	public void disp()
	{
		System.out.println("Displaying First class using disp function...");
	}


}
