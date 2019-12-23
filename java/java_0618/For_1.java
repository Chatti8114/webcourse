package java_0618;

public class For_1
{
	public static void main(String[] args) 
	{
	int  cnt, sum = 0;
	for ( cnt =1;cnt<=100 ;cnt++ )
		{
			sum +=cnt;
	//	System.out.println("cnt ="+cnt); 
			//sum += cnt; // sum = sum+cnt �׷��� ���� ���� �� ���� �ӵ��� ���Ѵ�. ������ �������� ������

		}
		System.out.println("1 + 2 + 3 + ~ + 100 ="+sum); 
		System.out.println("Hello World !");
	}
}
