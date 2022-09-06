package sec1;

public class Oper5 {

	public static void main(String[] args) {
		//비트(2진) 연산자
		int a=10, b=20, c=30, d=40, e, f, g, h;
		e = c & d;
		f = c | d;
		g = ~(c & d);
		h = c ^ d;
		System.out.println("c & d => " + e);	//2진수로 계산이 되기 때문에 8이 나온다., 2진수 and->	8
		System.out.println("c | d => " + f);	//2진수 or->		62
		System.out.println("~(c & d) => " + g); //2진수 보수, -8이지만 1의 보수는 값에 +1을 하기때문에 -9->	-9
		System.out.println("c ^ d => "+h);		//배타적 OR(eXclusi OR, XOR), 입력이 서로 다를 때 1->	54
		System.out.println("d >> 2 => " + (d >> 2));	//오른쪽 이중 시프트, 2진수로 변환하여 횟수만큼 시프트->	10
		System.out.println("d <<< 2 는 존재하지 않음");	//왼쪽 이중 시프트 연산자가 없음
		
		//연산시 부정과 불능 그리고 예외처리
//		System.out.println(a / 0);	//Not a Number => NaN(부정)
//		System.out.println("k" / 4);	//"k"는 문자열
//		System.out.println('k' / 4);	//'k'는 문자
//		System.out.println(a % 0);		//Infinity(불능)
		try {	//예외처리
			int k = 20;
			//실행해야할 구문
			System.out.println(k / 0);
		} catch (Exception e1) {	//Exception대신 ArithmeticException을 사용해도 됨
			//실행해야할 구문이 오류 발생시 처리해야할 내용
			System.out.println("산술연산에 오류가 존재함");
			e1.printStackTrace();	//오류내용을 프린트 
		}
	
	}

}