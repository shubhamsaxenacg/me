package question6;

//ClassC inherits ClassA

public class ClassC extends ClassA {

	// Constructor of ClassC will first execute constructor of ClassA
	public ClassC() {
		super(); 
		System.out.println("ClassC constructor is called..");
	}

}