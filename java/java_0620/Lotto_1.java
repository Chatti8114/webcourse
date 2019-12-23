package java_0620;

public class Lotto_1
{
	public static void main(String[] args) 
	{
		 int[] ball = new int[45];  //45 ���� ������ ����
		 for (int i =0; i<ball.length ;i++ )
		 {
			 ball[i] = i+1;
		 }
		 int temp = 0;
		 int j = 0;

		 for (int i =0;i<100 ; i++)
		 {
			 j = (int)(Math.random()*45);
		  temp = ball[0];
		  ball[0] = ball[j];
		  ball[j]=temp;
		 }
		 System.out.println();
		 System.out.println("278 �� �ζ� ��÷ ��ȣ \n");

		for (int i=0;i<6 ;i++ )
		{
			System.out.print(ball[i] +"\t");
		}
		 System.out.println();
		 System.out.println("\n ���ʽ� ��÷��ȣ \n");
		 System.out.println("\t"+ball[6]+"���Դϴ�.");// ball[6] �� 7��° �� number�����̴�
		System.out.println("Hello World !");
	}
}
