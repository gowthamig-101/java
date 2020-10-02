
public class Bank {
     public String accountno;
     private int balance;
      String name;
     String branchName;
     
     public Bank(String accountno) {
    	 this.accountno=accountno;
    	 this.balance=100000;
     }
     
     public void deposite(int amount,String accountno) {
    	 if(amount>0) {
    		 System.out.println("deposite the ammount: "+amount);
    		 balance+=amount;
    		 checkbalance();
    	 }else {
    		 System.out.println("entered wrong amount");
    		 }
     }
     public void withdraw(int amount,String accountno) {
    	 System.out.println("Withdrawing the ammount: "+amount);
		 balance-=amount;
		 checkbalance();
     }
    public void checkbalance(){
    	System.out.println("Your balance: "+balance);
    	 
     }
}
