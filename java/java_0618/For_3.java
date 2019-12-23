package java_0618;

public class For_3
{
	public static void main(String[] args) 
	{
    int cnt, sum =0; // cnt�� �ʱ�ȭ �ȵư� sum�� �ʱ�ȭ��. ���߿� cnt�� �ʱ�ȭ�ɰ���
     for (cnt =1 ; cnt <=100 ; cnt ++)//���⼭ �ʱ�ȭ��
   {
   			if (cnt %21==0)// ((cnt % 3 ==0 && cnt %7 ==0)) �ΰ��� ���� �׸��� �� if(cnt %3==0){ if(cnt %7==0){ ��� �ص� ����
	   {
	   System.out.printf("%6d",cnt);//t��� ���� ĭ�� ���߰� �ʹٸ� printf�� ����ȴ� 3d 4d 5d
        sum +=cnt;
	   }
	   if(cnt % 50==0)
	   {
		   System.out.print("\n");
	   }

     }
		System.out.println("3�� 7�� ����� �� = "+sum);
	}
}
