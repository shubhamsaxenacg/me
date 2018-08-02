package question2;

public class StaticMain {
	public static void main(String args[])
	{
		StaticClass statics = new StaticClass();
		statics.display(); //..non static functions are called normally by reference
		
		StaticClass.getStatic(); //...Static functions are accessed using StaticClass Reference type
	}
}
