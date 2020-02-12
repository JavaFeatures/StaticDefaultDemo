package demo;

public interface Interface2 {

	default void myMethod() {
		System.out.println("In Interface2.myMethod");
	}
	
}
