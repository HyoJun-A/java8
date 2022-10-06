package sec1;
// FunctionalInterface 메소드를 기반으로 람다식을 정의하여 활용
// 인터페이스를 선언하고, 추상체를 구현하믈써 람다식을 사용 
public class Lambda1 {
	// 일반 메소드 정의
	public int method1(int x, int y){
		return x + y;
	}
	
	/* 람다식 구현방식 정의
	(x, y) -> {x + y};
	*/
}
