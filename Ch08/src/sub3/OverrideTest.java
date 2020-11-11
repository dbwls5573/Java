package sub3;
/*
 * 날짜: 2020.11.11
 * 이름: 황유진 
 * 내용: 오브라이드(재정의) 메서드실습하기 교재 p203
 *
 * Override(재정의) 메서드 
 * - 부모클래스의 멤버 메서드를 자식클레스에서 다시 정의하는 메서드. 
 * - 자식클래스에서 다시 정의한 메서가 부모클레스의 메서드를 덮어 씌운다. 
 */
public class OverrideTest {

	public static void main(String[] args) {
		
		CCC c = new CCC() ; 
		
		c.method1();
		c.method2(); 
		c.method2(100); 
		c.method3(); 
		c.method3(300);
		
		//AAA 증조부는 자식인 BBB에 의해서 오버라이드 되서 가려짐,BBB도 CCC에 의해 오버라이드 되면서 결론 적으로 CCC 만 출력됨.
		
		

		//Final 실습 
		/*
		 * final변수: 상수 
		 * final 메서드: 오버라이드 금지 
		 * final 클레스 : 상송금지 
		 * 
		 */
	
	final int NUM = 1; 			//final: num에 더이상 다른 값이 들어가지 못하도록 한다. 
	
	//변수 final 선언으로 상수로 만든다. 	
	// NUM = 2;
	
	}
}
