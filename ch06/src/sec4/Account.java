package sec4;

public class Account {
	private int balance;
//	final static int MIN_BALACE = 0;
//	final static int MAX_BALACE = 1000000;
	private String ano;
	private String owner;
	
	public Account(){}
	
	public Account(String ano, String owner, int balance) {
		this.balance = balance;
		this.ano = ano;
		this.owner = owner;
	}
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getAno() {
		return ano;
	}
	public void setAno(String ano) {
		this.ano = ano;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
//	public int getBalance() {
//		return balance;
//	}
//	public void setBalance(int balance) {
//		if(MIN_BALACE <= balance && balance <= MAX_BALACE){
//			this.balance = balance;
//		}
//	}
	
	
}
