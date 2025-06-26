package basic;

class Banks{
	protected int max_limit_;
	protected String Bank_name_;
	protected boolean account_status_;
	protected static String[][] account;
	protected String account_no_;
	protected static int noa = 0;
	public void setbank(int max,String name) {
		this.max_limit_ = max;
		this.Bank_name_ = name;
		account = new String[max_limit_][3];
	}
	public void openAccounts(String b_name_,String acc_name,String account_no) {
		
		if(max_limit_ == 0 || max_limit_ < 0) {
			System.out.println("Not Requested or Contacted Bank");
		}else {
			if(noa < max_limit_) {
				for(int i=noa;i<=noa;i++) {
					account[i][0] = acc_name;
					account[i][1] = account_no;
					
				}
				
				
				System.out.println("Account Opened for Name : "+acc_name+"| Account Number : "+account_no);
			}else {
				System.out.println("Account full Cannot Add "+acc_name);
			}
		}
		noa++;
		
		
	}
	public void closeAccount(String account_no,String name) {
		for(int i=0;i<=noa-1;i++) {
			if(account[i][1] == account_no && account[i][0]== name) {
				account[i][1] = null;
				account[i][0] = null;
				account[i][2] = null;
				System.out.println("Account is Closed Reference Account Number "+account_no);
			}
		}
	}
	
	public void status(String account_no,String name) {
		int count=0;
		int ccount = 0;
		for(int i=0;i<=noa-1;i++) {
			if(account[i][1]==account_no && account[i][0] == name) {
				if(account[i][1]==null && account[i][0] == null && account[i][2] == null) {
					System.out.println("Account is InActive");
				}else {
					ccount++;
				}
			}else {
				count++;
			}
		}
		if(count==3) {
			System.out.println("Account is not Active");
		}
		if(ccount==1) {
			System.out.println("Account is Active");
		}
	}
	public void allaccountdisplay() {
		System.out.println("Total No of Accounts in the Bank : "+noa);
		try {
			for(int i=0;i<=noa-1;i++) {
				System.out.print("Account Holder : "+account[i][0]);
				System.out.println(", Account Number : "+account[i][1]);
				System.out.println(", Account Balance : "+account[i][2]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of indexbound Only can Print 10 Account Details");
		}
		
	}
	
	
}
class Account extends Banks{		
	protected String balance_;
	protected boolean account_status_;
	protected int account_count_=0;
	protected int ncount_ = 0;
	public void withdraw(String amount,String account_no) {
		int num = 0;
		int num2 = 0;
		int count = 0;
		for(int i=0;i<=noa-1;i++) {
			if(account[i][1] == account_no) {
				if(Integer.parseInt(account[i][2]) > 0) {
					num = Integer.parseInt(account[i][2]);
					num2 = Integer.parseInt(amount);
					if(num2 > num) {
						System.out.println("Insufficent Balance Please Enter lesser amount");
					}else {
						num = num - num2;
						account[i][2] = String.valueOf(num);
						System.out.println("\n");
						System.out.println(num2+" Euros Withdrawed in Account Number : "+account[i][1]);
						System.out.println("New Balance : "+account[i][2]+ " Euros");
					}
				}else {
					System.out.println("No Balance Withdrawal Not Possible");
				}
				
				
			}else {
				count++;
				if(count==noa) {
					System.out.println("\n");
					System.out.println("No Account Found or Incorrect Account Number Account Number : "+account_no);
				}
				
			}
		}
	}
	public void deposit(String amount,String account_no) {
		int num = 0;
		int num2 = 0;
		for(int i=0;i<=noa-1;i++) {
			if(account[i][1]==account_no) {
				if(account[i][2]==null) {
					account[i][2] = amount;
					System.out.println("\n");
					System.out.println("Amount "+amount+" Euros is Deposited for account_no "+account_no);
					System.out.println("New Balance : "+account[i][2]+ " Euros");
				}else {
					num = Integer.parseInt(account[i][2]);
					num2 = Integer.parseInt(amount);
					num = num + num2;
					account[i][2] = String.valueOf(num);
					System.out.println("\n");
					System.out.println("Amount "+amount+" Euros is Deposited for account_no "+account_no);
					System.out.println("New Balance : "+account[i][2]+ " Euros");
				}
			}else {
				ncount_++;
				
			}
		}
		if(ncount_ == noa) {
			System.out.println("\n");
			System.out.println("No Account Found or Incorrect Account Number Account Number : "+account_no);
		}
		account_count_++;
		
		
	}
	
	public void allaccountbalance() {
		System.out.println("\n");
		for(int i=0;i<=noa-1;i++) {
				System.out.println("account no : "+account[i][1]+" | balance : "+account[i][2]);
				
		}
	}
	
	
}

public class Bank{	
	public static void main(String[] args) {
		Banks bank = new Banks();
		bank.setbank(10,"ICICI");
		bank.openAccounts("ICICI","Yovan","112344");
		bank.openAccounts("ICICI","Shalu" ,"223344");
		bank.openAccounts("ICICI","danestan" ,"255664");
		
		Account acc = new Account();
		acc.deposit("6000","255664");
		acc.deposit("12000","112344");
		acc.deposit("2400","223344");
		acc.allaccountbalance();
		acc.withdraw("6000","255664");
		acc.allaccountbalance();
		bank.closeAccount("112344","Yovan");
		bank.status("112344","Yovan");
		
		
	}
}
