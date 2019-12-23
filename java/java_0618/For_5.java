package java_0618;

public class For_5
{
	public static void main(String[] args) 
	{
		long startTime = System.currentTimeMillis();

		for (int i =1; i< 1000000; i++ )//1000000*3300*50 �����µ� 1�ʹۿ� �Ȱɸ���
		{
			 for (int j =1; j<3000 ; j++ )//
			 {
				 	 for (int k =1; k<50 ; k++ )//
			     {
			      ;// ����
			      }
	          }
		}
		long endTime = System.currentTimeMillis();
		System.out.println("���� �ð� :" + startTime);
		System.out.println("���� �ð� : " + endTime);
		System.out.println("�ҿ� �ð� : " + (endTime - startTime));

		System.out.println("Hello World !");
	}
}
