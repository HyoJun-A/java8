package sec4;

import java.util.Scanner;

public class BankApplication {
	private static Account[] accountArray = new Account[100];
	private static Scanner sc= new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.계좌 생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int selectNo = sc.nextInt();
			
			if(selectNo == 1){
				createAccount();
			} else if(selectNo == 2){
				accountList();
			} else if(selectNo == 3){
				deposit();
			} else if(selectNo == 4){
				withdraw();
			} else {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}

	//계좌생성하기
	private static void createAccount(){
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		System.out.println("계좌주 : ");
		String owner = sc.next();
		System.out.println("초기입금액 : ");
		int balance = sc.nextInt();
		
		Account acc= new Account(ano, owner, balance);
		for(int i = 0; i< accountArray.length; i++){
			if(accountArray[i] == null){
				accountArray[i] = acc;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
	}
	
	//계좌목록보기
	private static void accountList() {
		System.out.println("------");
		System.out.println("계좌목록");
		System.out.println("------");
		for(int i=0; i< accountArray.length; i++){
			if(accountArray[i]==null) break;
			System.out.println(accountArray[i].getAno()+"\t"+accountArray[i].getOwner()+"\t"+accountArray[i].getBalance());
		}
	}

	private static void deposit() {
		System.out.println("------");
		System.out.println("예금");
		System.out.println("------");
		
		System.out.print("계좌번호 : ");
		String ano = sc.next();
		
		System.out.println("초기입금액 : ");
		int balance = sc.nextInt();
	}
	
	
	private static void withdraw() {

	}
	
	private static void findAccount(String ano){
		Account acc = new Account();
		for(int i=0; i<accountArray.length; i++){
			if(accountArray[i] == null){
				acc = null;
			}
		}
//		return acc;
	}
}