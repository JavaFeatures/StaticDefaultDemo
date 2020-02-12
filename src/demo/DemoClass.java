package demo;

public class DemoClass implements DemoInterface {

	@Override
	public void method1() {
		System.out.println("In DemoClass.method1");
	}
	
	@Override
	public void method2() {
		System.out.println("In DemoClass.method2");
	}

	public static void main(String args[]) {
		DemoClass obj = new DemoClass();
		obj.method1();
		obj.method2();
	}
	
}
