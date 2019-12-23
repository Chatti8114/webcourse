package java_0612;

public class Operator_5
{
	public static void main(String[] args) throws Exception
	{
		int ccc;
		System.out.print("�ѹ��ڸ� �Է��ϼ���!");
		ccc = System.in.read();
		if(ccc>=65 && ccc<=90)
		{
		char upperCase = (char)(ccc+32);
		 System.out.println("�Է��� ������ �빮�ڴ� " + upperCase);
	}
	else
		{
		char upperCase = (char)(ccc-32);
		 System.out.println("�Է��� ������ �빮�ڴ� " + upperCase);
		System.out.println("Hello World !");
	}
}
}

