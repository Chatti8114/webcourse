package java_0618;

public class While_5
{
	public static void main(String[] args) 
	{
	int snail =0;
	int day =0;
		while(true)
		{	
			snail +=3;
			day++;		//++day �ص� �������. �ܵ����� �ص� ������� 
	System.out.println("�� : " +snail); // �̰� �����ص� ��
			if (snail>=13)
			{
				break;
		}
 snail--;
 		System.out.println("�� : " +snail); // �̰� �����ص� ��
		}
System.out.println("�����̰� 1�ϳ� ����� �ߴٰ� �����ϸ� = " +day);

		System.out.println("Hello World !");
	}
}
