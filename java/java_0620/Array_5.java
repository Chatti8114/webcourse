package java_0620;

public class Array_5
{
	public static void main(String[] args) 
	{
		int sum=0;
		int average =0;

		int[] score = {100,88,77,56,93};

 for (int i=0; i<score.length ;i++ )
 {
	 sum+=score[i];
 }
average = sum/ score.length; //������ �� 
 System.out.println("���� = "+sum);
 System.out.println("��� = "+average);
		System.out.println(" Hello World !");
	}
}
