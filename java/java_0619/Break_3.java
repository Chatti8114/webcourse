package java_0619;

public class Break_3
{
	public static void main(String[] args) 
	{
		next: {//���̺�
             for (int i =0 ; i<10 ; i++)
                {
				 for (int j=0 ; j<10 ; j++ )
				 {
					 for (int k =0; k<10;k++ )
					 {
						 System.out.println(i+"*"+j+"*"+k+"="+(i*j*k)); // �� ������ ���ٸ� 10*10*10 �ؼ� 1000���� ����ȴ�.
					     break next;//next ������ k�� ������ i,j�� ������, next�� ���� }�ڿ� �´ٸ� j���� �ٲ��� �ʴ´�.
					 }
				 }
                   }
		}
		System.out.println("Hello World !");
	}
}
