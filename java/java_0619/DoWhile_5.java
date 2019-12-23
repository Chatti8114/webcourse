package java_0619;

public class DoWhile_5
{
	public static void main(String[] args) throws Exception
	{
		int i, m, e=1, j=1;
		System.out.println("ù��° ���� �Է��ϼ���");
		i = System.in.read()-48;

		System.in.read();
		System.in.read();

		System.out.println("ù��° ���� �Է��ϼ���");
		m = System.in.read()-48;
		if (i>m)
     	{
			e=i;
			i = m;
			m=e;
		}

		 do
     {
		 do
		 {
			 	      System.out.println(i+"*"+j+"="+(i*j));
                         j++;
						 if(j==10)
						 {
							 j=1;
							 break;
						 }
		 }while (j<=9);
		 i++;
		 System.out.println();
     }while (i<=m);

	 System.out.println("Hello");
	}     
}
