package java_0621;

import java.util.Scanner;

public class Division
{
	public static void main(String[] args) 
	{
        Scanner scan = new Scanner (System.in);
		System.out.print("���� ������ �Է��Ͻÿ�:");
		int n = scan.nextInt();

		System.out.println(n+"�� ����� ������ ����");
		for (int i =1;i<=n ;i++ )
		{
			if (n%1 == 0)
			{
				System.out.print(" " + i);
			}
		}
		
	}
}
