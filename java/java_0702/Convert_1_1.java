package java_0702;

class AB_1_1 {
	int a = 33;
	void display() {
		System.out.println("텀블러");
	}
}

class ABB_1_1 extends AB_1_1 {
	int b = 55;
}

class AC_1_1 extends ABB_1_1 {
	int a = 77;
	int c = 99;
	void display() {
		System.out.println("추운 겨울이");
	} void show() {
		System.out.println("서늘한 겨울이");
	}
}

public class Convert_1_1 {
	public static void main(String[] args) {
		
		AB_1_1 obj_2 = new AC_1_1();
		AC_1_1 obj_3 = null;
		
		obj_3 = (AC_1_1) obj_2;
		
		System.out.println("AC_1_1 a = " + obj_3.a);
	}

}
