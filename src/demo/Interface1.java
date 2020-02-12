package demo;

public interface Interface1 {

	default void myMethod() {
		System.out.println("In Interface1.myMethod");
	}
	
}
