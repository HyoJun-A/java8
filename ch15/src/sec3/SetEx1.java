package sec3;

import java.util.HashSet;
import java.util.Set;

public class SetEx1 {
	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		set1.add("안효준");
		set1.add("남송윤");
		set1.add("강병수");
		set1.add("남송윤");
		set1.add("안효준");
		System.out.println(set1);
		
		
	}
}
