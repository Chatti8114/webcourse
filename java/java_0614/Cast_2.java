package java_0614;

public class Cast_2
{
	public static void main(String[] args) 
	{
		char c1 = 'a'; // c1���� ���� 'a' �� �ڵ尪�� 97 ����
		char c2= c1;// c1�� ����� ���� c2  �� ����ȴ�

		char c3 =(char)(c1+1);// c3 �� �������� ����
		int i = c1+1; 
        c3++;
		c2++ ;
		c2++ ;

		 System.out.println("i ="+i);
		 System.out.println("c2 ="+c2);
		 System.out.println("c3 ="+c3);
		System.out.println("Hello World !");
	}
}
