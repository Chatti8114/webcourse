package java_0617;

public class Switch_3
{
	public static void main(String[] args) 
	{
		int score =0;
		for (int i = 1; i <=100 ; i++)
		{
			score =(int)(Math.random()*(80-49))+50;
			System.out.print("\t"+ score);
			if ( i %6 == 0)
				System.out.println();
		}
		
		System.out.println("Hello World !");
	}
}
