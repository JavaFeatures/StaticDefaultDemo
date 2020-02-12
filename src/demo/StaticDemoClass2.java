package demo;

public class StaticDemoClass2 implements StaticDemoInterface {

	public static void main(String[] args) {
		StaticDemoClass2 obj = new StaticDemoClass2();
		obj.defaultMethod();
		StaticDemoInterface.staticMethod();
	}

}
