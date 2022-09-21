package sec2;

import java.util.Scanner;

public class AccountEx {

	public static void main(String[] args) {
		Account ac = new Account();
		Scanner sc = new Scanner(System.in);
		String account_num;			//계좌번호
		String account_holder;		//계좌주
		int money;					//입금, 출금
		boolean run = true;			//실행
		int num;					//사용자가 원하는 실행번호
		System.out.println("---------------------------------");
		System.out.print("계좌번호를 입력해주세요 : ");	//계좌번호 입력받기
		account_num = sc.next();
		ac.setAccount_num(account_num);
		System.out.println("---------------------------------");
		System.out.print("계좌주를 입력해주세요 : ");		//계좌주 입력받기
		account_holder = sc.next();
		ac.setAccount_holder(account_holder);
		
		while(run){
			System.out.println("---------------------------------");
			System.out.print("| 1.입금 | 2.출금 | 3.잔액조회 | 4.계좌정보 보기 | 5.종료 | : ");
			num = sc.nextInt();		//사용자가 원하는 실행번호
			System.out.println("---------------------------------");
			
			switch(num){
				case 1:		//입금
					System.out.print("입금액 : ");
					money = sc.nextInt();
					ac.setMoney(money);
					ac.runDeposit(money);;
					break;
				case 2:		//출금
					System.out.print("출금액 : ");
					money = sc.nextInt();
					ac.setMoney(money);
					if(ac.getBalance() < ac.getMoney()){	//출금액인 잔액보다 많을경우 사용
						System.out.println("출금액이 잔액보다 많습니다. 다시 입력해주세요");
						ac.setMoney(0);
						System.out.print("출금액 : ");
						money = sc.nextInt();
						ac.setMoney(money);
					}
					ac.runWithdraw(money);
					break;
				case 3:
					System.out.println("잔액 : "+ac.runBalance());
					break;
				case 4:
					ac.printAccount();
					break;
				case 5:
					System.out.println("종료합니다.");
					run = false;
					break;
				default:
					System.out.println("번호를 다시 입력해주세요");
			}
		}
	}

}