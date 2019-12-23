package java_0617;

public class Switch_5
{
	public static void main(String[] args) 
	{
		int score = (int)(Math.random()*10)+1;
		String msg = "";
		score *= 100;
		msg = "����� ������" +score +"�̰�, ��ǰ��";
		
		switch (score)
		{
		case 1000:
			msg +="������, ";
		     break;

		case 900:
			msg +="���, ";
		     break;

		case 800:
			msg +="����, ";
		     break;

		case 700:
			msg +="���, ";
		     break;
	 default :
		  msg += " ���� ";
		}
		System.out.println(msg + "�Դϴ�." );

		System.out.println("Hello World !");
	}
}
