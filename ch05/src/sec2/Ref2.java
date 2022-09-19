package sec2;

import java.util.Calendar;

public class Ref2 {
	public static void main(String[] args) {
		//today가 열거형
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		int w = cal.get(Calendar.DAY_OF_WEEK);	//오늘 날짜의 요일번호 가져오기
//		System.out.println(w);	// 1~7(일 ~ 토)
		System.out.println();
		
		switch(w) {
			case 1:
				today = Week.SUNDAY;
				break;
			case 2:
				today = Week.MONDAY;
				break;
			case 3:
				today = Week.TUESDAY;
				break;
			case 4:
				today = Week.WEDNEDAY;
				break;
			case 5:
				today = Week.THURSDAY;
				break;
			case 6:
				today = Week.FRIDAY;
				break;
			case 7:
				today = Week.SATURDAY;
				break;
			
		}
		
		System.out.println("오늘의 요일 : " +today);			//출력 결과가 값이 나온 것
		System.out.println("name : " + today.name());	//출력 결과가 이름이 나온 것  --> 즉 열거형은 이름과 값이 값은 것이 출력 된다.
		System.out.println("ordinal : " + today.ordinal()); //	0~6, index의 값을 출력
		Week day1 = Week.SATURDAY;
		System.out.println("요일 비교 : " + today.compareTo(day1));	// 1 : true, 1인 아닌 값 : false
		System.out.println();
		
		Week days[] = Week.values();
//		for(int i=0; i<days.length; i++){
//			System.out.println(days[i]);
//		}
		for(Week day : days){
			System.out.println(day);
		}
	}

}