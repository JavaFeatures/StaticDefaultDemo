package demo;

public interface StaticDemoInterface {
	
	static public void staticMethod() {
		System.out.println("In staticMethod in StaticDemoInterface");
	}

	default public void defaultMethod() {
		System.out.println("In defaultMethod in StaticDemoInterface");
	}
	
}
