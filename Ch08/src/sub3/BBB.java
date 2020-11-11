package sub3;
public class BBB extends AAA {		//BBB클래스 자체를 마지막클레스로 선언하면서, CCC로 상속되지 않는다. 
	
	@Override	
	public final void method1() {					//final 선언으로 마지막 메서드가됨 >CCC에서 override 불가
		System.out.println("BBB-method1...");
	}
	
	public void method2(int a) {
		System.out.println("BBB-method2...");

	}
	
	public void method3() {
		System.out.println("BBB-method3...");

	}
	
	
}

