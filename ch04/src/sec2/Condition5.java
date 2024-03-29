package sec2;

import java.util.Scanner;

public class Condition5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean sw = true;			//while문 반복 조건
		int money=0, balance=0;		//money : 입금, 출금       balance : 잔액(현재 통장의 돈)
		
		while(sw) {
			System.out.print("작업할 번호 (1-입금, 2-출금, 3-잔액조회, 기타-종료)[1~9] : ");
			int job = sc.nextInt();	//작업 번호 
			
			if(job >= 1 && job <=9){//범위의 번호일 경우 실행
				switch (job) {
					case 1:			//입금
						System.out.print("입금액 : ");
						money = sc.nextInt();
						balance += money;
						break;
					case 2:			//출금
						System.out.print("출금액 : ");
						money = sc.nextInt();
						balance -= money;
						break;
					case 3:			//잔액조회
						System.out.println("잔액 : "+balance);
						break;
					default:		//종료
						System.out.println("모든 작업을 종료 합니다.");
						sw = false;
				}
			} else {				//범위의 번호가 아닐 경우 "숫자를 다시 입력해주세요"를 출력하고 처음부터 다시 실행
				System.out.println("숫자를 다시 입력해주세요");
			}
		}
		sc.close();
	}

}
