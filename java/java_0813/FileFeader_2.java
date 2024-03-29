package java_0813;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileFeader_2 {
	public static void main(String[] args) {
		try {
			//파일 객체 생성
			File file = new File("C:\\temp_1\\Exception_1.java");
			//입력 스트림 생성
			FileReader filereader = new FileReader(file);
			//입력 버퍼 생성
			BufferedReader bufReader = new BufferedReader(filereader);  // 안 써도 되지만 쓰면 효율을 좋게 해준다.
			String line = "";
			//한줄씩 읽기
			while ((line = bufReader.readLine()) != null) {
				System.out.println(line);			
			}
			//.readLine()은 끝에 개행문자를 읽지 않는다.
			bufReader.close();
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			System.out.println(e);
		}
	}

}
