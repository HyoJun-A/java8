package sec3;

import java.util.Scanner;

public class Loop2 {
	public static void main(String[] args) {
		int jum[] = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < jum.length; i++) {
			System.out.print((i+1)+"번째 사람 점수 : ");
			jum[i] = sc.nextInt();
		}
		
/*
		반복변수=초기값; ①
		while(조건식){ ②
			반복실행문; ③
			증감식;   ④
		}
		① -> ② -> ③ -> ④ 실행되다가 조건이 만족하는 동안 ② -> ③ -> ④ 순으로 반복 수행됨
*/
		int i = 0;
		int sum = 0;
		while(i < jum.length) {
			System.out.println("점수"+(i+1)+" : "+jum[i]);
			sum += jum[i];
			i++;
		}
		System.out.println("전체 총점 :"+sum);
		sc.close();
	}

}