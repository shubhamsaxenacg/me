package question4;

//.........This class inherits another class with the name of ClassA
public class ClassB extends ClassA{

	private int b = 15;
	ClassB()
	{
		System.out.println("This is class B"); //....Will call the constructor of ClassA
	}
	
// Displays the value of variable declared in the class
	void display()
	{
		super.display();
		System.out.println("Value of inherited a: "+a);	//Inheriting the protected variable from ClassA
		System.out.println("Value of b: "+b);
	
	}
}
