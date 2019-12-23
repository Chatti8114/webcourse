package java_0619;

public class GuGuDan
{
	public static void main(String[] args) 
	{
		int i =1, j=1;

		while (i<9)
		{
			i ++;//i�� 1���� ��ٸ�
			j =1;//j�� 10�� �ǹǷ� �ٽ� �ʱ�ȭ ������� �Ѵ�.
			while (j<=9)
			{
            System.out.println(i+"*"+j+"="+(i*j));
			j++;
	
			}
			//i++ i�� 2�� ��ٸ�
		}
		System.out.println("\n");
	}
}
