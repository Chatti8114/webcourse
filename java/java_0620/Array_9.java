package java_0620;

public class Array_9
{
	public static void main(String[] args) 
	{
		int[] score ={79,88,91,35,100,55,97,1};
		int max = score[1];
		int min =score[1];//�迭 ���ڸ� �𸣴� ���¿��� �ʱⰪ�� �ִ� ����� ����ִ� ���߿� �ϳ��� ����. ���� ǥ���Ȱ���. �ݵ�� �ȿ� �ִ� ������ �ʱⰪ�� ���.
		                           // �׳� ���ھ� �Ⱦ��� 0���� �ȵȴ�. �׷��� �ִ밪�� ������ �ּҰ��� �ȳ��´�.

		for (int i=2 ; i<score.length ; i++ )//���� ���ھ 1���� ���� i ���� 2�� ��� ��
		{
			if (score[i] > max)
			{
				max =score[i];
			}
			if (score[i]<min)
			{
				min = score[i];
			}
		}
		System.out.println("�ִ� �� : "+max);
		System.out.println("�ּ� �� : "+min);
		System.out.println("Hello World !");
	}
}
