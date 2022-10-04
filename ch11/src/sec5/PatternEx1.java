package sec5;

import java.util.regex.Pattern;

//Pattern(패턴) : regEx = 정규표현식 - 특정 형식에 맞는 데이터인지 검증
public class PatternEx1 {
	public static void main(String[] args) {
		String regExp = "(02|031|010)-\\d{3,4}-\\d{4}";
		String data1 = "(02)-1234-1234";
		String data2 = "042-1234-1234";
		String data3 = "010-1234-1234";
		String data4 = "031-1234-1234";
		
		boolean p1 = Pattern.matches(regExp, data1);
		System.out.println(data1+"은 형식에 맞습니까? " +p1);
		System.out.println(data2+"은 형식에 맞습니까? " +Pattern.matches(regExp, data2));
		System.out.println(data3+"은 형식에 맞습니까? " +Pattern.matches(regExp, data3));
		System.out.println(data4+"은 형식에 맞습니까? " +Pattern.matches(regExp, data4));

		regExp = "\\w+@\\w+(\\.\\w+)?";
		data1 = "kbs@google.com";
		data2 = "ahj@navercom";
		data3 = "hyojun.co.kr";
		System.out.println(data1+"은 형식에 맞습니까? " +Pattern.matches(regExp, data1));
		System.out.println(data2+"은 형식에 맞습니까? " +Pattern.matches(regExp, data2));
		System.out.println(data3+"은 형식에 맞습니까? " +Pattern.matches(regExp, data3));
	}
}
