package java_0620;

public class Array_3 //3��°�� ���� ���ϴ�
{
	public static void main(String[] args) 
	{
		int[] month = {31,28,31,30,31,30,31,31,30,31,30,31};
		//�Ǽ� .���� ��������� �ȵ� > double�� �ٲ���� ��(float�� ������. �ذ��Ϸ��� 28.0f�� �ٲ������)>28.0�� �����̾ floatŸ������ �Ѿ���� ���Ѵ�.

 for (int  i =0; i<12;i++)

		{
	 System.out.println((i+1)+"�� :"+month[i]+"��");
 }                                    
	System.out.println("Hello World !");	
	}
}
