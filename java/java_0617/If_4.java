package java_0617;

import java.io.*;
public class If_4
{
	public static void main(String[] args) throws Exception
	{
		System.out.println("������ �Է��ϼ���!");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		float score = Float.parseFloat(in.readLine());
		String grade = " ";
		if (score >=90.6)
			{ 
			grade = "A";
        if(score >=97.7)
				{
			grade +="++";// grade = grade + "++'
				}
		else if(score <=93.8)
			grade +="--";
				}
		else if (score >=80.9)
			grade = "B";
			
        else if(score >=70.5)
			grade = "C";
			
		else if (score >=60.6)
			grade = "D";
			
		else 
		    grade = "F";		
			
		System.out.println("����� ������"+grade+"�Դϴ�.");
		System.out.println("Hello World !");
	
}
}
