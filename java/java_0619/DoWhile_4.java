package java_0619;

public class DoWhile_4
{
	public static void main(String[] args)
	{
		int i=1, j=1;
     do
     {
	  i++;
	  j=1;
	  do
		 {
		  System.out.println(i+"*"+j+"="+(i*j));
		  j++;
		 }
		 while (j<=9);
		 System.out.println();
     }
     while (i<9);
	 System.out.println("Hello");
	}
}
