package java_0619;

public class DoWhile_2
{
	public static void main(String[] args) 
	{
		int cnt =1, sum=0, sum1=0;
        
		do
		{

			if (cnt%2 ==0)
			{  
			sum=sum+cnt;
			System.out.println(cnt);
			}
	else 
			{
		    sum1=sum1+cnt;
			System.out.println(cnt);
			}
			cnt ++;
		}
		while (cnt <=100);
		System.out.println("1~100������ ¦����="+sum);
		System.out.println("1~100������ Ȧ����"+sum1);
		System.out.println("Hello World !");
	
	}
}
//�߰��� 