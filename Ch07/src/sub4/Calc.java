package sub4;

public class Calc {
	
	// �̱��� ��ü����
	private static Calc instance = new Calc();
	
	public static Calc getInstance() {
		return instance;
	}
	
	// �ܺο��� ��ü������ �� �� ���� private �����ڸ� ����
	private Calc() {}
	
	
	public int plus(int x, int y) {
		return x+y;
	}
	
	public int minus(int x, int y) {
		return x-y;
	}
	
	public int multi(int x, int y) {
		return x*y;
	}
	
	public int div(int x, int y) {
		return x/y;
	}
}