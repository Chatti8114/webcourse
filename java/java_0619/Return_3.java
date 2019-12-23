package java_0619;

public class Return_3
{
	public static void main(String[] args) 
	{
		int result;
		sum(100,20);
		sub(100,20);
		result = mul(10,20);// sum �޼ҵ�� ȣ��(ȣ��Ǹ� ���ǰ� �վ�� �Ѵ�)
        	System.out.println("10*20 ="+result);
		result=div(100,20);
		System.out.println("10/20 ="+result);
	
		System.out.println("Hello World !");
	}
		static void sum(int x, int y)//����( Ÿ���� ���ƾ� �Ѵ�. ���� ����� ��)
       	{
			 System.out.println("10+20 ="+(x+y));
	    }
      static void sub(int x, int y)
	{
		 System.out.println("10*20 ="+(x-y));
	  }
     static int mul(int x, int y)
	{
		 return(x*y);
	}
	static int div(int x, int y)
	{
		return(x/y);
	}
}
