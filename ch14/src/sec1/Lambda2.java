package sec1;
// 함수적 인터페이스 - 하나의 인터페이스는 하나의 메소드만 정의할 수 있다.
@FunctionalInterface
interface Calc {	//interface하나당 하나의 메소드만 정의할 수 있음
	public void method1();
//	public void method2(int x, int y);
}

@FunctionalInterface
interface Calc2 {	
	public void method2(int x,int y);
}

@FunctionalInterface
interface Calc3 {	
	public int method3();
}


@FunctionalInterface
interface Calc4 {	
	public int method4(int x,int y);
}

public class Lambda2 {
	public static void main(String[] args) {
		// 인터페이스명 객체명 = (매개변수) -> 리턴값
		Calc4 max = (x, y) -> x>y ? x : y;
		int data = max.method4(20, 18);
		System.out.println("최대값 : "+data);
	}
}
