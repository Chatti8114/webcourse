package java_0621;

public class Array_23
{
	public static void main(String[] args) 
	{
		
		if (args.length !=3)//�װ��� �ƴ϶�� ! �� ���� ����. 3���� �ƴ϶��
		{
			System.out.println("usage : java Array_23 num_1 OP num2");
			System.exit(0);
		}

		int num1 = Integer.parseInt(args[0]);//args[0] �ǹ̴� 0���� �μ��Է°��� 1��° ��, 1���� 2���� ���̴�. �װ� ���� ���ڷ� �ٲٰڴٴ� ���� parseInt
		char op = args[1].charAt(0);// charAt(0)�� �ǹ̴� args[1]�� 2��° ���� �ڿ� ���ᵵ ù��°�� �ν��Ѵ� > +kasd �̷��� >+�̰͸� �ν��Ѵ�. 
		int num2 = Integer.parseInt(args[2]);
		int result =0;// 

        switch (op)
        {
        case '+':
                    result= num1 + num2;
		            break;
	    case '-':
                    result= num1 - num2;
		            break;
		case 'x':
                    result= num1 * num2;
		            break;
		case '/':
                    result= num1 / num2;
		            break;
		default:
			     System.out.println("�������� �ʴ� ���� �Դϴ�");
        }
		System.out.println("��� : "+result);
		System.out.println("Hello World !");
	}
}
//���ϱ� �����ڴ� ���� �μ� �Է��� �� ���� �Ѵ�.
// control +3 > 56+3 >�̷������� ����� �Ѵ�.
