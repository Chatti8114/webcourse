package java_0617;

public class If_6
{
	public static void main(String[] args) 
	{
		for (int i = 0; i<=6 ; i++ )
		{
			System.out.print(i);
			if ( i==1 || i ==3|| i==5||i ==7||i ==9)
			System.out.println(" "+ i + "Ȧ�� �Դϴ�.");
			
			else if (i==2 || i ==4|| i==6||i ==8)
			System.out.println(" "+i + "¦�� �Դϴ�.");
			
			else
				System.out.println(" "+i + " �� ���ڰ� �ƴմϴ�.");
		}
		System.out.println("Hello World !");
	}
}
