package java_0617;

public class Switch_4
{
	public static void main(String[] args) 
	{
		char ch = (char)(Math.random() *4 +'F');
		int score =0;
		switch (ch)
		{
	case 'F':
           score = 90;
		     break;
	case 'G':
           score = 80;
		     break;
	case 'H':
           score = 70;
		     break;
	case 'I':
           score = 60;
		     break;
		
		}
		System.out.println("����� ������"+score +"�Դϴ�.");
		System.out.println("Hello World !");
	}
}
