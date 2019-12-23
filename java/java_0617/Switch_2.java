package java_0617;

public class Switch_2
{
	public static void main(String[] args) 
	{
		int score = 4; //	int score = (int)(Math.random()*5)+1;
		switch (score * 100)
		{
		case 100:
			System.out.println("����� ������ 100 ��ǰ�� ������ �Դϴ�.");
		  break;
		 case 200:
			System.out.println("����� ������ 200 ��ǰ�� ��ǳ�� �Դϴ�.");
		  break;
		 case 300:
			System.out.println("����� ������ 300 ��ǰ�� TV �Դϴ�.");
		  break;
		 case 400:
			System.out.println("����� ������ 400 ��ǰ�� ��Ʈ�� �Դϴ�.");
		  break;

		  default:
			  System.out.println("�˼������� ����� ��ǰ�� �����ϴ�.");
		}
		System.out.println("Hello World !");
	}
}
