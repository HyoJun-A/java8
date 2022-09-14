package sec2;

import java.util.Scanner;

public class Condition3 {
	public static void main(String[] args) {
		//성명과 세 과목 (전산, PG, DB)의 점수를 입력받은 후 
		//판정은 세 과목의 점수가 모두 70점 이상이면, "합격" 아니면  "탈락" 이며,
		//평균은 세 과목의 점수에 합계에서 3으로 나눈 값으로 하되, 소수점 이하까지 표시될 수 있도록 실수로 구하며,
		//비고는 세 과목 중에서 어느 하나라도 90점 이상이 있으면, "과목우수" 로 하고, 아니면 공백으로 구함
		//아래와 같은 형태로 출력 될 수 있도록 할 것.
		//*입력값 예시
		//성명 : 김기태
		//전산점수 : 80
		//PG점수 : 95
		//DB점수 : 75
		//*출력예시
		//당신의 총점은 250점이며, 평균은 83.33333이고, 합격하셨으며, 비고는 과목우수입니다. 
		Scanner sc = new Scanner(System.in);
		
		System.out.print("성명 : ");
		String name = sc.next();	//성명
		
		System.out.print("전산점수 : ");
		int proc = sc.nextInt();	//전산점수
		
		System.out.print("PG점수 : ");
		int pg = sc.nextInt();		//PG점수
		
		System.out.print("DB점수 : ");
		int db = sc.nextInt();		//DB점수
		
		String judgment = "불합격";		//판정 합격 or 불합격, 모든 과목이 70점 이상일 경우 합격
		if (proc >= 70 && pg >= 70 && db >= 70) {
			judgment = "합격";
		} 
//		if(proc >= 70 && pg >= 70 && db >= 70) judgment = "합격";
		
		int sum = proc+pg+db;		//총점
		double avg = (double) sum/3;//평균	
		avg = Math.floor(avg*100000)/100000;
		
		String note = "";			//비고, 한과목이라도 90점 이상이면 과목우수
		if (proc >= 90 || pg >= 90 || db>= 90) {
			note = "과목우수";
		}
//		if(proc >= 90 || pg >= 90 || db>= 90) note = "과목우수";
		
		System.out.println(name+"님의 총점은 "+sum+"점이며, 평균은 "+avg+"이고, "+judgment+"하셨으며, 비고는 "+note+"입니다.");
		sc.close();
	}

}