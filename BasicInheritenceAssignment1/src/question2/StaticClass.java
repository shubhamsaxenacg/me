package question2;

public class StaticClass {
	private int a1;
	private int a2;
	private static int a3 = 0;
	
	public void display()
	{
		// Can use both static and non static variables in non static member function
		a1 = 1;
		a2 = 2;
		a3 = 3; //Value of a3 will be same across the objects as it is static
		System.out.println("values are "+a1+", "+a2+" and "+a3);
	}
	
	public static void getStatic()
	{
		//Cannot use non static variables here in static memeber function
		System.out.println("a3: "+a3);
	}
}
