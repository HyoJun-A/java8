package sec3;

public class Loop3 {
	public static void main(String[] args) {
		int a = 10, sum = 0;

/*
		반복변수=초기값;	①
		do {
			실행문장;	②
			증감식;	③
		} while (조건식);	④
		① -> ② -> ③ -> ④ 	실행되다가 조건이 만족하는 동안 ② -> ③ -> ④ 반복 수행함
		그러므로 실행부터 하고, 조건을 나중에 비교하므로 최소 1번 이상 실행하게됨
*/
		
		do {
			sum += a;
			a++;
		}	while(a < 10);
	
		System.out.println("a = "+a+", sum = "+sum);
	}

}
