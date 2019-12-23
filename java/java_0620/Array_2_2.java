package java_0620;

public class Array_2_2
{
	public static void main(String[] args) 
	{
		int[][] score = {{80,75,90,65},
							  {90,43,90,100},
			                  {23,78,80,34},
			                  {70,67,70,56},
			                  {23,44,99,76}};      
		int korTotal =0;
	   int engTotal=0;
	   int mathTotal=0;
	   int sciTotal=0;

      System.out.println("��ȣ\t����\t����\t����\t����\t����\t���");
      System.out.println("========================================================");
	  
	  for (int i=0 ; i < score.length ; i++ )
	  {
		  int sum=0;
		  korTotal +=score[i][0];
		  engTotal +=score[i][1];
		  mathTotal +=score[i][2];
		  sciTotal +=score[i][3];
		  System.out.print(" " + (i+1) + "\t");

		  for (int j =0 ; j<score[i].length ; j++ )
		  {
			  sum +=score[i][j];//���� ���� ������ ���� �� ���ض�
			  System.out.print(score[i][j] + "\t");
		  }
       //System.out.println(sum + "\t" + (float)sum/score[i].length);//���ʽ��� ���� �� �Ʒ����� 3��° ���� ©������
	  System.out.printf(sum + "\t" + "%7.1f",(float)sum/score[i].length);
	  System.out.println();
	  }
	  System.out.println("========================================================");
	  System.out.println(" ���� : " + korTotal + "\t" + engTotal + "\t" + mathTotal+ "\t" + sciTotal);
	System.out.println("Hello World !");
	}
}
//���ͳ� ����Ʈ��� �÷��� �� ���� ������ �����͵� ���� �� �ִ�.
// ������ ������ ���� ó���Ǵ°͵� ���� �� �ִ�.
