package java_0701;

class AA_5_1 {
	String str;
	public AA_5_1(String str) {
		this.str = str;
		System.out.println("AA_5 ������ ȣ��" + str);
	}
}

class BB_5_1 extends AA_5_1 {
	public BB_5_1(String aa) {
		super(aa);
		System.out.println("BB_5 ������ ȣ��" + aa);
	}
}

class CC_5_1 extends BB_5_1 {
	public CC_5_1(String kk) {
		super(kk);
		System.out.println("CC_6 ������ ȣ��" + kk);
	}
}

public class SuperTest_6_1 {
	public static void main(String[] args) {
		
		CC_5_1 obj_1 = new CC_5_1("�����ٶ󸶹ٻ������īŸ����");
		
		System.out.println(obj_1.str);
		
	}

}
