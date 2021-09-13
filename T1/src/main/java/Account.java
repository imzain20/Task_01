
public class Account extends Customer {
	private int balance;
	//private String created_date;
	
	public Account()
	{}
	
	public Account(String name, String address, String phno, int account_no, int bal)
	{
		super(name,address,phno,account_no);
		this.balance=bal;
		//this.created_date=created_date;
		System.out.println("Account created on ");
		System.out.println(java.time.LocalDate.now());
	}
	
	public void CreateCustomer()
	{
		//Customer c2=new Customer("Zain","C-195","03303511511","001");
		
	}
	
	public void setBalance(int bal) {
		this.balance=bal;
	}
	/*
	public void setAccountNo(int acc_no) {
		this.account_no=acc_no;
	}*/
	/*
	public void setDate(String date) {
		this.created_date=date;
	}
	*/
	public int getBalance() {
		return this.balance;
	}
	/*
	public int getAccountNo() {
		return this.account_no;
	}*/
	/*
	public String getDate() {
		return this.created_date;
	}
	*/
	public void checkBalance() {
		//System.out.println("Name " + this.name);
		System.out.println("Your balance is " + this.balance);
	}
	
	public void printStatement() {
		System.out.println("Your balance is " + this.balance);
	}
	
	public void makeDeposit(int amount) {
		this.balance=balance+amount;
	}
	
	public void makeWithdrawal(int amount) {
		//Type of account needed to be checked
		this.balance=balance-amount;
	}
	
	public void transferAmount(int amount) {
		this.balance=balance-amount;
	}
	
	public void calculateZakat() {
	//Type of account needed to be checked (only savings account)
		if(this.balance>20000)
		{
		double zakat=0;
		zakat=this.balance*(2.5/100);
		this.balance=(int) (this.balance-zakat);
		}
	}
	
	public void AllDeductions()
	{
		//System.out.println("Your balance is " + this.balance);
	}
	
	
	//Customer c1=new Customer();
	//Customer c2=new Customer("Zain","C-195","03303511511","001");
	//public void information_new() {
	  //  System.out.println(c2.phno);
	  //}
}
