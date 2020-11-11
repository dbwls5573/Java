package sub4;
/* 
 * 2020.11.11 
 * 이름 : 황유진 
 * 내용 : 다형성 (poloymorphism) 실습하기 교재 p205
 */
public class PolyTest {
	public static void main(String[]args) {

		Animal a1 = new Tiger(); 
		Animal a2 = new Eagle(); 
		Animal a3 = new Shark(); 		//부모타입으로 선언 
		
		a1.move();
		a2.move();
		a3.move();
		
		a1.hunt();
		a2.hunt();
		a3.hunt();
		
}
}
