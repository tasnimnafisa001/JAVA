
public class Customer
{
	private String phoneNumber;
	private Account account;
	public Customer(){
		System.out.println("This is an empty contractor for Customer");
	}
	public Customer(String phoneNumber,Account account){
		this.phoneNumber = phoneNumber;
		this.account = account;
		System.out.println("This is parameterized contractor for Customer");

	}
	public void setPhoneNumber(String phoneNumber){	
		this.phoneNumber = phoneNumber;

	}
	public void setAccount(Account account){
		this.account = account;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
	public Account getAccount(){
		return account;
	}
	public void showDetails(){
		System.out.println("Account Phone Number: "+phoneNumber);
		account.showDetails();
	}
}



