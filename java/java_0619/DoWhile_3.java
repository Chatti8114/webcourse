package java_0619;

public class DoWhile_3
{
	public static void main(String[] args) 
	{
		int cnt =1, sum=0;
        int even =0, odd=0;

		do
		{
			if (cnt%2 ==0)
			{  
		even+=cnt;
			}
	else 
			{
        odd +=cnt;
			}
			sum+=cnt;
			cnt ++;
		}
		while (cnt <=100);
		System.out.println("1~100������ ¦����="+sum);
		System.out.println("1~100������ Ȧ����"+even);
		System.out.println("1~99������ Ȧ����"+odd);
		System.out.println("Hello World !");
	
	}
}
//�߰��� 