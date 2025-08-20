
public class Start{
	public static void main(String[] args){
		Account a = new Account();
		a.setAccountNumber(6454);
		a.setAccountHolderName("Tasnim Binta Kamran");
		a.setBalance(54511.12);
		Customer B = new Customer();
		B.setPhoneNumber("315642");
		B.setAccount(a);
		a.showDetails();
		B.showDetails();
		Account C = new Account(9473,"Nafisa", 214548.12);
	    Customer D= new Customer("1426455", C);
	    D.showDetails();   
	}	
}

