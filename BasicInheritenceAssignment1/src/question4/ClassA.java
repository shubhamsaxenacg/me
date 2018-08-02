package question4;

//This class is inherited by ClassB
public class ClassA {

	protected int a = 10;

	// Constructor called from the constructor of ClassB
	ClassA(){
		System.out.println("This is class A");
	}
	
	void display()
	{
		System.out.println("This is class A and value of a :"+a);
	}
}
