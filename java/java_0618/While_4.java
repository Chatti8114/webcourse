package java_0618;

public class While_4
{
	public static void main(String[] args) 
	{
		int sum =0;
		int i = 3;
		while (true)
		{
		sum = i;//�� ���� �ڿ� �ؾ� ���� �Ʒ��� �־�� ���� �ݵ�� ��ġ�� �� �ľ��Ѵ�
	
			if(sum>13)	
			{
				break;//(�ۿ� �ִ� �ݺ� ������.)
				}
	i++ ;	
		}
		System.out.println("���� 13�� ���� �� i= " +i);
		System.out.println("�� : " +sum);

		System.out.println("Hello World !");
	}
}
