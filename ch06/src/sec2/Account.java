package sec2;

public class Account {
	private String account_num;
	private String account_holder;
	private int balance;
	private int money;
	
	public String getAccount_num() {
		return account_num;
	}
	public void setAccount_num(String account_num) {
		this.account_num = account_num;
	}
	public String getAccount_holder() {
		return account_holder;
	}
	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
//	runDeposit(계좌입금작업) 은 입출금액을 입력받아 입금작업을 진행하여 해당 계좌에 잔액이 증가된다.
//	runWithdraw(계좌출금작업) 은 입출금액을 입력받아 출금작업을 진행하여 해당 계좌에 잔액이 감소된다.
//		※ 다만, 잔액은 음수(-)일 수 없음
//	runBalance(잔액조회) 은 해당 계좌에 잔액을 조회하여 반환한다.
//	printAccount(계좌정보보기) 는 해당 계좌의 계좌번호, 계좌주, 잔액 을 출력하도록 한다.
	public void runDeposit(int money){
		this.balance += money;
	}
	public void runWithdraw(int money){
		if(this.balance - money > 0){
			this.balance -= money;
		}

	}
	public int runBalance(){
		return this.balance;
	}
	public void printAccount(){
		System.out.println("계좌번호 : "+ this.account_num);
		System.out.println("계좌주 : " + this.account_holder);
		System.out.println("잔액 : " + this.balance);
	}
	
}
