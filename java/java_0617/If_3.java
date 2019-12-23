package java_0617;

import java.io.*;

public class If_3
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("�湮���� �Է��ϼ���");
	//	int visitCount =System.in.read()-48;

BufferedReader in = 
	new BufferedReader(new InputStreamReader(System.in));
int visitCount = Integer.parseInt(in.readLine());

		if (visitCount <1)
		{
			System.out.println("ó�� ���̱��� �湮���ּż� �����մϴ�.");
		}		
else {
	System.out.println("��湮 ����帳�ϴ�.");
	System.out.println("����� �湮Ƚ���� "+visitCount+"�Դϴ�.");
}

		System.out.println("Hello World !");
	}
}
