package java_0808;

import java.util.HashSet;
import java.util.Set;

public class HashSet_1 { 		// 중복을 허용하지 않음
	public static void main(String[] args) {

		Object[] obj = { "1", new Integer(1), "2", new Integer(3), "2", "3", "3", "3", "4", "4", };
							// 문자열 1과 숫자형 1은 다른 것이기 때문에 다르게 인식(String 과 Integer) 순서는 상관없음

		Set sett = new HashSet();  // 그냥 HashSet 은 순서를 기억 못 하지만 LinkedHashSet 은 순서를 기억함

		for (int i = 0; i < obj.length; i++) {
			sett.add(obj[i]);
		}

		System.out.println(sett);
	}

}
