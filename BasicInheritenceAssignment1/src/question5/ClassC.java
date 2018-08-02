package question5;

// ClassC inherits ClassB
public class ClassC extends ClassB {

	// Constructor of ClassC will first execute constructor of ClassB
	public ClassC() {
		super(); 
		System.out.println("ClassC constructor is called..");
	}


}
