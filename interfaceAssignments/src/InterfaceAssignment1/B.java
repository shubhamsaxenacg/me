package InterfaceAssignment1;

public interface B extends A {
	//...........interface B disp2 method
	default void disp2() {
		System.out.println("Interface B");
	}
}
