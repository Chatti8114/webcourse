package java_0813;

import java.io.File;

public class JDir {  // java_0813 이렇게 경로명만 적으면 그 안의 파일을 보여줌, 뒤에 파일을 적으면 파일 정보가 나옴
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("사용법 : java JDir c:\\kortea.txt");
			System.exit(111);
		}
		File file = new File(args[0]);
		
		if (! file.exists()) {
			System.out.println(args[0] + "파일이 존재하지 않습니다.");
			System.exit(0);
		}
		System.out.println("절대 경로 : " + file.getAbsolutePath());
		
		if (file.isDirectory()) {
			File[] list = file.listFiles();
			System.out.println(args[0] + "디렉토리 파일 목록 출력");
			
			for (int i = 0; i < list.length; i++) {
				if (list[i].isFile()) {
					System.out.println(list[i].getName() + "\t : " + list[i].length());
					System.out.println();
				} else {
					System.out.println(list[i].getName() + "\t [디렉토리]");
					System.out.println();
				}
			}
		} else {
			System.out.println(args[0] + "파일 상세 정보");
			System.out.println("파일 속성 : " + file.length());
			System.out.println("읽기 속성 : " + file.canRead());
			System.out.println("파일 경로 : " + file.getParent());
			System.out.println("숨김 속성 : " + file.isHidden());
			System.out.println("해쉬 코드 : " + file.hashCode());
		}
	}

}
