package java_0614;

public class ConditionalOperator_1
{
	public static void main(String[] args) 
	{
		 int a =14, b=21, c =43, d = 59;
		 int max, min;
			
	 max = (a>b) ? a:b;
	 max = (max>c) ? max :c;
	 max = (max>d) ? max :d;
    System.out.println("max :"+max);

	max = 100;
	 max = (a<b) ? a : b;
	 max = (max<c) ? max:c;
	 max = (max<d) ? max :d;
    System.out.println("max :"+max);

        min = (a<b) ? a :b ;
		min = (min<c)?  min :c;
		min = (min<d)? min :d;
		 System.out.println("min :"+min);
		System.out.println("Hello World !");
	}
}
