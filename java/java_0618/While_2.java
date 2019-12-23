package java_0618;

public class While_2
{
	public static void main(String[] args) 
	{
		int cnt=1;
		int sum=0;
		int even=0,odd=0 ;

		while (cnt <= 10)
		{
			System.out.println("cnt =" +cnt);
          sum +=cnt;

		  if (cnt % 2 ==0)
		   even +=cnt; //even =even+cnt
		    else
			 odd+=cnt; //odd =odd+cnt
	 		cnt ++;
		}
System.out.println("1~10������ �� ="+sum);
System.out.println("1~10������ ¦�� �� ="+even);
System.out.println("1~10������ Ȧ�� �� ="+odd);
		System.out.println("Hello World !");
	}
	}
	
	
