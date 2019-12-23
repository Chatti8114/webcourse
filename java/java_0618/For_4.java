package java_0618;

public class For_4
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for (int i = 2; i<=10 ; i+=2 ) // for(int i =10; i>=0; i-=2)�İ� �Ȱ���. Ȧ���� =9�� �Ѵ�
				{
			sum += i; 
			System.out.println( "\t"+i);
		}
		System.out.println("1~10 ������ ¦���� �� ="+sum);
	
	}
}
