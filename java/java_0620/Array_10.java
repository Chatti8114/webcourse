package java_0620;

public class Array_10
{
	public static void main(String[] args) 
	{
		int[] number = new int [10];
		for (int i=0;i<number.length ;i++ )
		{
			number[i]=i;//0~9������ �ѹ��� ���� ������ ź��, ��������� �� ���� ����.
			System.out.print(number[i]+"\t");
		}
		System.out.println();
      for (int i =0; i<200; i++)//100,200 ���� �� �ö󰥼��� Ȯ���� ��������. 
     {
		  int n = (int)(Math.random()*10);//0~9������ ������ ���� ��´�/ *10�� �����߻� ����
          int temp = number[0];
		  number[0] = number[n];// �ѹ��� 3������ ������ 0������ �ٲٰ� ��� �� ������ ���� ���̴�.0���� �������� ��� ���̴� ��. / �ζ� ���� / ���� ���´ٴ� �����̴�
		  number[n] = temp;
	 }
      for (int i=0;i<number.length ;i++ )
      {
		  System.out.print(number[i]+"\t");
      }
		System.out.println("Hello World !");
	}
}
//�����  ��ǻ�� ���� �ٸ�. �����̱� ������ 
//