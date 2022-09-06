package sec1;

public class Oper4 {

	public static void main(String[] args) {
		int a=200, b=100, c=20, d=10;
		//비교연산자(==, !=, >, >=, <, <=) -> True or False의 결과가 산출됨
		//== 같다(이다)
		//!= 같지 않다(다르다)
		//> 크다(초과)
		//>= 크거나 같다(이상==이후)
		//< 작다(미만=전)
		//<= 작거나 같다(이하==이전)
		System.out.println("a==b => "+(a==b));	//False
		System.out.println("a!=b => "+(a!=b));	//True
		System.out.println("a>b => "+(a>b));	//True
		System.out.println("a>=b => "+(a>=b));	//True
		System.out.println("a<b => "+(a<b));	//False
		System.out.println("a<=b => "+(a<=b));	//False
		System.out.println("a가 문자열 맞나?	=> "+a instanceof String);	//True, "문자열"+a 가 먼저 실행 되기때문에 True가 나온다
		//논리 연산자(이항 연산)
		//	입력1		입력2		a>b  && C>d		a>b || c>d
		//  0		0		0				0
		//	0		1		0				1
		//	1		0		0				1
		//	1		1		1				1
		//위의 0 1로 값을 알 수 있는 것이 진리 테이블이라고 한다.
		
		
		
		//논리 연산자(단항 연산)		
		//입력	!(a>b)
		//0		1
		//1		0
		System.out.println("a>b && c<d => "+(a>b && c<d));	//False
		System.out.println("a>b || c<d => "+(a>b || c<d));	//True
		System.out.println("!(a>b) => "+(!(a>b)));			//False
		
		//논리 연산자(삼항 연산자)	=> 조건 ? 참일때식 : 거짓일때식
		System.out.println(a>=b ? "크거나 같다" : "작다");
		
	}

}