package sec3;

public class Print2 {

	public static void main(String[] args) {
		int a = 100;
		float b = 3.14f;
		String c = "ahn";
		// %d : 정수, %f : 실수, %s : 문자열
		// %b : 2진수, %o : 8진수, %x : 16진수
		System.out.printf("반지름이 %d인 원은 원주율 %f를 반영하여 원의 넓이가 %f 임. %s의 규칙 ", a, b, a*a*b, c);
		System.out.printf("\n10진수 %d는 2진수로 %b 임", a, a);
		System.out.printf("\n10진수 %d는 8진수로 %o 임", a, a);
		System.out.printf("\n10진수 %d는 16진수로 %x 임", a, a);
	}

}
