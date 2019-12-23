package java_0619;

public class Return_1
{
	public static void main(String[] args) 
	{
		int result;
		result = sum(10,20);// sum �޼ҵ�� ȣ��(ȣ��Ǹ� ���ǰ� �վ�� �Ѵ�)

		System.out.println("10+20 ="+result);

		System.out.println("Hello World !");
	}
		static int sum(int x, int y)//����( Ÿ���� ���ƾ� �Ѵ�. ���� ����� ��)
       	{
			 return(x+y);
	    }

	}

