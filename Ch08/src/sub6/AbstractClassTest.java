
package sub6;
/*
 * 날짜: 2020.11.11 
 * 이름: 황유진 
 * 내용: 추상 클레스 실습하기 교제 p216
 * 
 * 추상클레스 
 * - 추상 메서드가 선언된 클래스
 * - 추상클래스를 상속 받아 통일성 있는 구조를 갖는 클래스 정의 
 * - 추상클래스를 상속 받는 자식 클레스의 타입 선언은 다형성을 적용해야한다. 
 * */
public class AbstractClassTest {
	
	public static void main(String[]args) {  
		
		//추상클래스는 직접 객체생성을 할 수 없다. 
		// Unit = u new Unit(); 
		
	
		
		/* Marine u1 = new Marine(); 
		Zealot u2 = new Zealot(); */ 
		
		Unit u1 = new Marine(); 
		Unit u2 = new Zealot();   //다형성 성립 ; 
		
		u1.move(); 
		u2.attack(); 
		
		u2.move(); 
		u2.attack(); 
	}

}
