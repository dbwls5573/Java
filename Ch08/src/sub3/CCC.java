package sub3;

public class CCC extends BBB {
/* 부모클래스 BBB method1 dp final 선언으로 Override를 할수 없다. */
	
	/*@Override//BBB method 1
	public void method1() {
		System.out.println("CCC-method1...");
	}*/
	
	@Override //AAA method2를 오버라이드 
	public void method2() {
		System.out.println("CCC-method2...");

	}
	@Override//AAA'method3
	public void method3(int a) {
		System.out.println("CCC-method3...");

	}
	
	
}
