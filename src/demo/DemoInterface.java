package demo;

public interface DemoInterface {

	public void method1();
	
	default public void method2() {
		System.out.println("In DemoInterface.method2");
	}
	
}
