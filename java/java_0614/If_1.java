package java_0614;

public class If_1
{
	public static void main(String[] args) throws Exception
	{
		int a ;
		System.out.println(" ���ڸ� �Է��ϼ���!");
		a = System.in.read();
     if ((a>='A')&&(a<='Z'))
     {
		 System.out.println(" "+(char)a+"�� �빮�� �Դϴ�.");
     }

	 else  if ((a>='a')&&(a<='z'))//�Ϲ����� else�� �ϸ� ���ڱ��� �ν��� �ȴ�. ������ ���� �����Բ�, �������� �׳� Hello World�� ���´�.
			{
			System.out.println(" "+(char)a+"�� �ҹ��� �Դϴ�.");
		}

			 else  if ((a>='0')&&(a<='9'))//�Ϲ����� else�� �ϸ� ���ڱ��� �ν��� �ȴ�. ������ ���� �����Բ�, �������� �׳� Hello World�� ���´�.
			{
			System.out.println(" "+(char)a+"�� ���� �Դϴ�.");
		}

		else{
			System.out.println(" "+(char)a+"�� ����, ���ڰ� �ƴմϴ�.");//�̰� ���ָ� ���ڷ� �ƴմϴٶ�� ����
		System.out.println("Hello World !");
	}
}
}
