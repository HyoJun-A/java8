package sec4;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		boolean run = true;	//while 조건
		int balance = 0;	//잔고
		Scanner sc = new Scanner(System.in);
		
		while(run){
			System.out.println("--------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 |");
			System.out.println("--------------------------");
			System.out.print("선택> ");
			int num = sc.nextInt();	//번호 선택
			int money = 0;			//예금, 출금
			switch (num) {
				case 1:
					System.out.print("예금액> ");
					money = sc.nextInt();
					balance += money;
					break;
				case 2:
					System.out.print("출금액> ");
					money = sc.nextInt();
					balance -= money;
					break;
				case 3:
					System.out.println("잔고> " + balance);
					break;
				case 4:
					System.out.println("프로그램종료");
					run = false;
					break;
				default:	//지정해준 1~4의 번호가 아닐 겨우에 반복문 다시 실행
					System.out.print("\n");
					System.out.println("번호를 다시 확인해 주세요");
			}
		}
	}

}