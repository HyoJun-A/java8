package sec1;

import java.util.Scanner;

public class BankApplication {
	private static Account accountArr[] = new Account[100];
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run){
			System.out.println("-----------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-----------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = sc.nextInt();
			
			switch (selectNo) {
				case 1:
					createAccount();
					break;
				case 2:
					acList();
					break;
				case 3:
					deposit();
					break;
				case 4:
					withdraw();
					break;
				case 5:
					run = false;
					break;
				default:
					System.out.println("선택 번호를 다시 확인해 주세요");
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		System.out.println("--------------");
		System.out.println("  계좌 생성   ");
		System.out.println("--------------");
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		System.out.print("계좌주 : ");
		String owner = sc.next();
		
		System.out.print("초기 입금액 : ");
		int balance = sc.nextInt();
		
		Account acc = new Account(ano, owner, balance);
		
		for(int i=0;i<accountArr.length;i++){
			if(accountArr[i] == null){
				accountArr[i] = acc;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	private static void acList() {
		System.out.println("--------------");
		System.out.println("  계좌 목록   ");
		System.out.println("--------------");
		System.out.println("계좌번호\t계좌주\t잔액");
		for(int i=0;i<accountArr.length;i++){
			if(accountArr[i]==null) break;
			System.out.println(accountArr[i].getAno()+"\t"
					+accountArr[i].getOwner()+"\t"
					+accountArr[i].getBalance());
		}
	}
	
	private static void deposit(){
		System.out.println("--------------");
		System.out.println("  예금하기   ");
		System.out.println("--------------");
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		System.out.print("예금액 : ");
		int balance = sc.nextInt();
		
		Account acc = findAccount(ano);
		
		if(acc==null){
			System.out.println("결과 : 계좌가 존재하지 않습니다.");
			return;
		}
		
		acc.setBalance(acc.getBalance()+balance);
		System.out.println("결과 : "+balance+"가 성공적으로 입금처리 되었습니다.");
	}
	
	private static void withdraw(){
		System.out.println("--------------");
		System.out.println("  출금하기   ");
		System.out.println("--------------");
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		System.out.print("출금액 : ");
		int balance = sc.nextInt();
		
		Account acc = findAccount(ano);
		
		if(acc==null){
			System.out.println("결과 : 계좌가 존재하지 않습니다.");
			return;
		}
		
		if(acc.getBalance()<balance) {
			System.out.println("예금액이 출금액보다 적어서 출금할 수 없습니다.");
			return;
		}
		
		acc.setBalance(acc.getBalance()-balance);
		System.out.println("결과 : "+balance+"가 성공적으로 출금처리 되었습니다.");		
	}
	
	private static Account findAccount(String ano){
		Account acc = null;
		for(int i=0;i<accountArr.length;i++){
			if(accountArr[i]!=null){
				if(accountArr[i].getAno().equals(ano)){
					acc = accountArr[i];
					break;
				}
			}
		}
		return acc;
	}
}