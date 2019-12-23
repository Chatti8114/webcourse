package java_0618;

public class GuGuDan_3
{
	public static void main(String[] args) throws Exception
	{
  int max, min, temp;
     System.out.print("ù ��° ���� �Է��ϼ��� !");
     min = System.in.read()-48; 

	 System.in.read();
	 System.in.read();

    System.out.print("�� ��° ���� �Է��ϼ��� !");
     max = System.in.read()-48; 
	 if (min>max)
			{
		 temp = min;
		 min = max;
		 max = temp;
			}
for (int i = min ;i<=max ;i++ )
		{
			for (int j =1;j<=9 ;j++ )
			{
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
	}
}