package java_0620;

public class Array_7
{
	public static void main(String[] args) 
	{
		int sum=0;
		float average =0.0f;//double�� �� 0.0�Ƚᵵ �ȴ�(int�� double�� ���ԵǴϱ�)

		int[] score = {100,88,77,56,93};

 for (int i=0; i<score.length ;i++ )
 {
	 sum+=score[i];
 }
average = (float)sum/ score.length; //������ �� 
 System.out.println("���� = "+sum);
 System.out.printf("��� = %7.2f",average);
		System.out.println("\n Hello World !");
	}
}
