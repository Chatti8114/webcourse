package java_0619;

public class DoWhile_1
{
	public static void main(String[] args) 
	{
		int cnt=0, sum=0;

		do
		{
			sum+=cnt;
			cnt +=1;
			}
		while (cnt <=100);
		System.out.println("1+2+3+...+100="+sum);
		System.out.println("Hello World !");
	
	}
}
