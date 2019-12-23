package java_0617;

public class Switch_7
{
	public static void main(String[] args) 
	{
		int score = 77;
		char grade = ' ';
//		double score = 77;���⼭ 77�� ���ڰ� �ƴϰ� �ȴ�.
//		double grade = ' ';
//      �Ʒ� switch((int)/10)
	switch (score /10)
		{
	 case 10:

	case 9:
			 grade = 'A';
		        break;
	case 8:
			 grade = 'B';
		        break;
	case 7:
			 grade = 'C';
		        break;
     default:
			   grade = 'F';
		        break;

		}
		System.out.println("����� ������"+grade+"�Դϴ�.");
		
		System.out.println("Hello World !");
	}
}
