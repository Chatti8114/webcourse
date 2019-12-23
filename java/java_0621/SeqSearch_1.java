package java_0621;

import java.util.Scanner;
public class SeqSearch_1
{
	public static void main(String[] args) 
	{
      int[] data = {0,10,20,30,40,50,60,70,80,90,100};
	  int value, index = -1;

	  Scanner input = new Scanner(System.in);//�̰� ���� ����ó�� ���ص� �ȴ�.
	  System.out.print("Ž���� ���� �Է��ϼ���");

	  value = input.nextInt();

	  for (int i =0 ; i<data.length ; i++ )
	  {
		  if (data[i] == value)
		  {
			  index = i;
		  }
	  }
	  if (index <data.length && index>=0)//index�� 0~ ��� �ε����� ����, -1�� �ȴٸ� ��ã�Ҵٴ� ���̴�. ������ -1�� ����� ������ ���� �����Ͷ�� ���̴�.
	  {
		  System.out.println("\n ã��"+ value + "����" +index+"��ġ�� �ֽ��ϴ�");
	  }
	  else 
		  System.out.println("\n ã��"+ value + "���� �������� �ʽ��ϴ�");

		
	}
}
//scanner�� buffered reader���� �� ���� ����. �� �����ϴ� ����. �� �� ���߿� ������� Ŭ����,
// 