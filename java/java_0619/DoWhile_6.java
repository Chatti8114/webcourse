package java_0619;

//import java.io.IOException;
public class DoWhile_6
{
	public static void main(String[] args) throws java.io.IOException
	{
		int input =0;
		System.out.println("Please enter sentence");
		System.out.println("please enter 'x'");

		do
		{
			input =System.in.read();
			System.out.print((char)input);
		}
		while (input!='x');
System.out.print("\n Hello World!");
	}
}
//����� Ű���� ���ۿ� �մ� ������ ���͸� ���ؼ� ������ �ȴ�.
//Ű���� ���� : Ű���� �ȿ� ������ ����� �ִ� ��
//Ű���� �� �� ġ�� �� �Ҹ� ���� �� ���۰� �ִ�
//���⼭ ����Ű�� ���� �� ����� �޾Ƶ鿩����.
// ���� import ���� ������ IOException ���� �������� ���ؼ� �׷��ǵ� �Ʒ� throws �� ���ų� ���� import�� ���ų� ���߿� �ϳ��� �ϸ� �ȴ�.
//.*; ���� �ᵵ �Ǵµ� ��ü������ ���ִ°��� �� ����. ������ ����
//
