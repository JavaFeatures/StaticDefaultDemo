package demo;

public class MultipleInheritanceDemoClass implements Interface1, Interface2 {
	
	public void myMethod() {
		System.out.println("In MultipleInheritanceDemoClass.myMethod");
	}

	public static void main(String[] args) {
		MultipleInheritanceDemoClass obj = new MultipleInheritanceDemoClass();
		obj.myMethod();
	}

}
