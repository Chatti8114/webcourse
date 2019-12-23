package java_0617;

public class If_5
{
	public static void main(String[] args) throws Exception
	{
		int ch;
        System.out.println("���ڸ� �Է��ϼ���!");
		
		ch = System.in.read();

       if (ch == 'A' || ch == 'a')
		{
       System.out.println("America");
       System.out.println("Australia");
		}
		else if (ch =='K' || ch == 'k')
		{
       System.out.println("Korea");
       System.out.println("Kuwait");
		}
		else if (ch =='M' || ch == 'm')
		{
       System.out.println("Mexico");
       System.out.println("Monaco");
		}
		System.out.println("Hello World !");
	}
}
