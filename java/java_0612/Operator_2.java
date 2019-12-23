package java_0612;

public class Operator_2
{
	public static void main(String[] args) 
	{
		int a,b;
		a=10;
		b=++a; //���� ���� ������
		System.out.println("++a ="+a+", b ="+b);

		a=10;
		b=a++; //���� ���� ������
		System.out.println("a++ ="+a+", b ="+b);

		a=10;
		b=--a; //���� ���� ������
		System.out.println("--a ="+a+", b ="+b);

		a=10;
		b=a--; // ���� ���� ������
		System.out.println("a-- ="+a+", b ="+b);
		System.out.println("Hello World !");
	}
}
