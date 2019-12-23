package java_0619;

public class GuGuDan_2
{
	public static void main(String[] args) throws Exception
	{
		int max, min, temp, line=1;
			System.out.println("ù��° ���� �Է��ϼ���");
		min = System.in.read()-48;

System.in.read();
System.in.read();

		System.out.println("ù��° ���� �Է��ϼ���");
		max = System.in.read()-48;
		if (min>max)
     	{
			temp=min;
			min = max;
			max=temp;
		}

while (min<=max)
{

while (line<=9)
{
	System.out.println( min+"*"+max+"="+(min*max));
	line++;
	if (line ==10)
	{
	line =1;
	break;
	}
}
		System.out.println();
min ++;
}
System.out.println("Hello");
	}
}
