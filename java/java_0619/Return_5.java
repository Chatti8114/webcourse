package java_0619;

public class Return_5 //���Ϲ��� �ʴ� ����
{
	public static void main(String[] args) 
	{
		int result1,result2,result3;
		float result4;

		sum(10,20);
		sub(10,27);
		mul(5,7);
		div(35,6);

	
		System.out.println("\n Hello World !");
	}
		static void sum(int x, int y)
       	{
	     	System.out.println("10+20 ="+(x+y));
	    }
       static void sub(int x, int y)
    	{
      	System.out.println("10-27 ="+(x-y));
   	    }
       static void mul(int x, int y)
	   {
		System.out.println("5*7 ="+(x*y));
	    }
	     static void div(int x, int y)//�ڿ�floató������ �ʰ� ���� float x, float y)ó���ص� �ȴ�.
	   {
		System.out.printf("35/6 =%7.3f",((float)x/y));

	    }
}

