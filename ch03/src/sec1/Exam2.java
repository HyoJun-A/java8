package sec1;
// NaN값 검사
public class Exam2 {
	
	public static void main(String[] args) {
		double x = 5.0, y = 0.0;
		double z = x % y;
		
		if (Double.isInfinite(z)) {
			System.out.println("0.0으로 나눌 수 없습니다.");
		} else {
			double result = z + 10;
			System.out.println("결과  : " + result);
		}

	}

}
