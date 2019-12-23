package java_0619;

public class Break_1
{
	public static void main(String[] args) 
	{
		int sum =0;
		int tt = 0;
		for (int i =0;i<100 ;i++ )
		{
			if (i%3==0)
			{
				sum+=i;
				System.out.print(i+"\t");
			 tt++;
			}
     if (tt %6 ==0)
     {
		 System.out.println();
     }
	 if (sum>200)
	 {
		 break;
	 }
		}
		System.out.println("\n Sum="+sum);
		System.out.println("Hello World !");
	}
}
