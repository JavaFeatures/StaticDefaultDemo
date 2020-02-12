package demo;

public class StaticDemoClass implements StaticDemoInterface {

	@Override
	public void defaultMethod() {
		System.out.println("In defaultMethod in StaticDemoClass");
	}
	
	public void staticMethod() {
		System.out.println("In staticMethod in StaticDemoClass");
	}
	
}
