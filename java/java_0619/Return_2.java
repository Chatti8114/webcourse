package java_0619;

public class Return_2
{
	public static void main(String[] args) 
	{
		int result;
		sum(10,20);
		System.out.println("Hello World !");
	}
		static void sum(int x, int y)//void �� ��� �� �������� �ʰڴٴ� �޼ҵ��
	{
		System.out.println("10+20 ="+(x+y));
			return;//�� ���� �������� 
	}
}
//�� Return_1�� ���ؼ� �� �ݵ�� �ΰ��� Ÿ���� �˰� �־�� �Ѵ�.
//main �޼ҵ嵵 �������� �ʰڴٴ� ���̴�.
//