package java_0620;

public class Array_8
{
	public static void main(String[] args) 
	{
		int [] kbs = new int[100];
		int kk=0;

		for (int i =0;i<100 ; i++)
		{
			kbs[i] = i;
			kk ++;
			System.out.print(i+"\t");
		if (kk % 5==0)
		{
			System.out.print("\n");
		}
		}
		System.out.println("kbs �迭�� ũ�� : "+kbs.length);
		System.out.println("Hello World !");
	}
}
