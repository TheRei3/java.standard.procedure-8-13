package ex8no13;

public class ex8no13 {  //  430p
	public static void main(String[] args) {
		method1();
	}

	static void method1() {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1�޼��忡�� ���ܰ� ó���Ǿ����ϴ�.");
			e.printStackTrace();
		}
	}
}
