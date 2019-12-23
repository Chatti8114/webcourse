package java_0621;

import javax.swing.*;//awt�� �ȵ���̵忡�� ���� �̿�, swing�� �� ������ ���� �� �Ѵ� �Ȱ�����
public class Game_1
{
	public static void main(String[] args) 
	{
		int answer = (int)(Math.random()*100)+1;
		int input =0;
		String temp = "";
		int count = 0;

      do
	   {
			count ++;
			temp = JOptionPane.showInputDialog("1~100 ������ ���ڸ� �Է��ϼ���." + "�������� -1�� �Է��ϼ���.");//�� ���� temp�� ����ȴ�.
		if (temp == null || temp.equals("-1"))
		 {
			break;
		 }

		System.out.println("�Է°� :" + temp);//�����ڴ� ���꿡 ������� ���ؼ� �Ʒ� ���׷� �ٲ۰���

		input = Integer.parseInt(temp);

		if (answer > input)
		 {
			System.out.println("�� ū���� �Է��ϼ���.");
		 }

		  else if (answer< input)
			  {
			 System.out.println("�� �������� �Է��ϼ���.");
              }
	     else 
			{
			  System.out.println("���߾����ϴ�");
			  System.out.println(" �õ�Ƚ���� " + count +"���Դϴ�.");
		      break;
		    }
		}
		while (true);


		System.out.println("Hello World !");
	}
}
