package java_0628;

class This_1 {
	private int kor;
	private int eng;
	private int math;
	
	public This_1(int kor, int eng, int math) {	  //  �ۿ� �ִ� �Ͱ� �ȿ� �ִ� �Ű������� ������ ���� �� �켱������ ����
		this.kor = kor;
		this.eng = eng;				// �̷������� this. �� �տ� �ٿ��ָ� ���������� ����� ��(�� ���̷��� �����̸��� �� �ϳ��� �ؾ� ��)
		this.math= math;
	}
	
	public int total() {  //  �ڵ����� ���������� kor, eng, math �� ��Ī�ϱ� ������ this �� �ٿ��� ��
		return (kor + eng + math);
	}
	
	// https://gmlwjd9405.github.io/2018/09/06/java-comparable-and-comparator.html
		// https://jeong-pro.tistory.com/173
}

public class ThisTest_1 {
	
	public static void main(String[] args) {
		This_1 obj_1 = new This_1(55, 77, 88);
		
		System.out.println(" �� �� : " + obj_1.total());
	}

}
