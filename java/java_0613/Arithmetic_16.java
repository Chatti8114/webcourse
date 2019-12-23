package java_0613;

public class Arithmetic_16
{
	public static void main(String[] args) 
	{
		boolean a,b,c,d;
// ���� �������� (Short Circuit Logical Operator)
// &&,|| 

		a = (3>10)&(10>3);
		b = (3>10)&&(10>3);
        c = (10>3)|(3>10);
        d = (10>3)||(3>10);

		System.out.println("a ="+a);
		System.out.println("b ="+b);
		System.out.println("c ="+c);
		System.out.println("d ="+d);

		System.out.println("Hello World !");
	}
}
