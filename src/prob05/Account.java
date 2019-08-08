package prob05;

public class Account {
	private String accountNo;
	private int balance;
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public Account(String accountNo) {
		System.out.println(accountNo + "계좌가 개설되었습니다. ");
		this.accountNo = accountNo;
	}
	public void save(int i) {
		System.out.println(accountNo + "계좌에 " + i + "만원이 입급되었습니다. ");
		this.balance = balance + i;
	}
	public void deposit(int i) {
		System.out.println(accountNo + "계좌에 " + i + "만원이 출금되었습니다. ");
		this.balance = balance - i;
	}
}
