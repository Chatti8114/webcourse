package java_0618;

public class While_3
{
	public static void main(String[] args) 
	{
		int sum =0;
		int i = 1;
		while (true)
		{
			if(sum>100)
			{
				break;//(�ۿ� �ִ� �ݺ� ������.)
			}
				sum += i;//�� ���� �ڿ� �ؾ� ���� �Ʒ��� �־�� ���� �ݵ�� ��ġ�� �� �ľ��Ѵ�
				i ++;
		}
		System.out.println("���� 100�� ���� �� i= " +i);
		System.out.println("�� : " +sum);

		System.out.println("Hello World !");
	}
}
