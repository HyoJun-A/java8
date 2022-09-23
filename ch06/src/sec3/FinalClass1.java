package sec3;

public class FinalClass1 {
	//상수는 대문자로 선언, 소문자를 사용하게 된다면 이클립스에서는 돌아가지만 코드 테스트를 하면 오류로 나옴
	final static double PI = 3.14;
	static final int MIN_VALUE = 0;
	static final int MAX_VALUE = 100;
	final static double CIRCLE_LENGTH() {	//항상 같은 결과를 얻는 메소드
		return PI*100;
	}
}
