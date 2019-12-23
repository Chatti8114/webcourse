package java_0619;

public class Return_4
{
	public static void main(String[] args) 
	{
		int result1,result2,result3;
		float result4;
		result1 =sum(10,20);
		result2 =sub(10,27);
		result3 =mul(5,7);
		result4 =div(35,6);

	   	System.out.println("10+20 ="+result1);
	   	System.out.println("10-27 ="+result2);
	   	System.out.println("5*7 ="+result3);
		System.out.printf("35/6 =%7.3f",result4);//�Ҽ��� ����3�ڸ��� �̷��� ���ľ� �Ѵ�. �Ҽ��� ���ϴϱ� .������ ǥ���Ǵ� �Ű� �ٸ� �� sfó�� ǥ��ȴ�. ���� f�� ǥ��.

	
		System.out.println("\n Hello World !");
	}
		static int sum(int x, int y)
       	{
			 return(x+y);
	    }
       static int sub(int x, int y)
    	{
         	return(x-y);
   	    }
       static int mul(int x, int y)
	   {
		 return(x*y);
	    }
	     static float div(int x, int y)//�ڿ�floató������ �ʰ� ���� float x, float y)ó���ص� �ȴ�.
	   {
		return((float)x/y);

	    }
}

