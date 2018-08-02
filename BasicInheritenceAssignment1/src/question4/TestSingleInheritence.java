package question4;
//........Contains the main method which calls ClassA and ClassB
public class TestSingleInheritence {
	
	public static void main(String args[])
	{
		ClassB classB = new ClassB(); //.......will call constructor A in constructor B
		classB.display();	//....Override the display function
		
		ClassA classA = new ClassA();
		classA.display();
	}
}
