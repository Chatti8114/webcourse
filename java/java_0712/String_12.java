package java_0712;

public class String_12 {
	public static void main(String[] args) {
		
		String str = "높이 나는 새가 멀리 본다. 일찍 일어나는 새가 모이를 줍는다.";
		
		System.out.println("검색할 문자열 \n" + str);
		System.out.println("indexOf(새)		: " + str.indexOf("새")); //처음부터 새를 찾는다.
		System.out.println("indexOf(새,10)		: " + str.indexOf("새",10)); //10번부터 새를 찾아라 어디에 있나.
		System.out.println("lastIndexOf(새)		: " + str.lastIndexOf("새"));
		// 마지막 '새' 글자는 왼쪽에서부터 몇 번째에 있는가? 24
		System.out.println("lastIndexOf(새, 10)	: " + str.lastIndexOf("새", 10)); 
		// 마지막 '새' 글자에서부터 10번째 이후에 '새' 는 몇 번째에 있는가? 6
	}

}
