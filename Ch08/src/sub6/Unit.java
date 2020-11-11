
package sub6;
//추상클레스: 1개이상의 추상메서드를 갖는 클래스 
public abstract class Unit { 
	
	//Unit u = new Unit(); >> 추상클레스여서 만들수 없음 
	 public void move() { 
		 System.out.println("Unit move.."); 
	 } 
	 
	 //추상 메서드 
	 public abstract void attack();  

}
