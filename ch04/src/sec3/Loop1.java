package sec3;

public class Loop1 {
	public static void main(String[] args) {
		int[] data = {90, 80, 70, 65, 75, 95, 85, 60, 90, 95};		//배열기억장소, data[0]~data[9]
		int sum = 0;
		/*
		 *  ①                                   ②           ③
		for(반복변수 선언 및 초기화; 조건식; 증감식){
			반복할 실행문		④
		}
		반복변수가 부여된 초기값으로 시작하여 증감식에 따라 증감이 되고 조건식이 만족하지 않으면 더이상 실행하지 않는다.
		① -> ②  -> ④  -> ③ -> ②  -> ④  실행하다가 ③ -> ② -> ④를 조건이 만족하는 동안 반복 실행
		*/
		for (int i = 0; i < data.length; i++) {						//i : index변수
			System.out.println(i + "번째 사람의 점수 : " + data[i]);
			sum += data[i];		//누산(누적 계산)
		}
		
		double avg = (float) sum/data.length;
		System.out.println("전체 총점 : "+sum+", 전체 평균 : "+avg);
	}

}
