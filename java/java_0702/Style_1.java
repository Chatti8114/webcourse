package java_0702;

abstract class ����
{
	int i = 33;
	abstract void draw ();	
}

class �簢�� extends ����
{
	@Override  //������ �Ϳ� �ణ�� ��ȭ�� �ְڴٴ� ���� => ������
	void draw()
	{
		System.out.println("�簢���� �׸��ϴ�");
	}
	void message()
	{
		System.out.println("�簢�� message() �޼ҵ�");
	}
}

public class Style_1 {
	public static void main(String[] args) {
		
		�簢�� obj_1 = new �簢��(); //���� class �� ��ü => �̿ϼ� ���赵���̱� ������ ��üȭ ��ų �� ����
		System.out.println("�簢�� Ŭ���� i = " + obj_1.i);	//�߻�Ŭ������ ��üȭ �� �� ����
		 obj_1.draw();
		 obj_1.message();
	}

}
