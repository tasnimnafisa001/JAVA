
public class Account{
private Integer accountNumber;
private String accountHolderName;
private Double balance;
public Account(){	
	System.out.println("This is an empty contractor for Account");

}
public Account(Integer accountNumber,String accountHolderName,Double balance){	
	this.accountNumber = accountNumber;
	this.accountHolderName = accountHolderName;
	this.balance = balance;
	System.out.println("This is parameterized contractor for Account");

}
public void setAccountNumber(Integer accountNumber){
	this.accountNumber = accountNumber;
}
public void setAccountHolderName(String accountHolderName){
	this.accountHolderName = accountHolderName;
}
public void setBalance(Double balance){
	this.balance = balance;
}
public Integer getAccountNumber(){
	return accountNumber;
}
public String getAccountHolderName(){
	return accountHolderName;
}
public Double getBalance(){
	return balance;
}
public void showDetails(){
	System.out.println("Account Number      : "+accountNumber);
	System.out.println("Account Name        : "+accountHolderName);
	System.out.println("Account Balance     : "+balance);
}
}


