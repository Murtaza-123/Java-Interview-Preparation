public class ATM_Machine
{
    public static void main(String[] args)
    {
        ATM atm = new ATM(12345,"murtaza",20000);
        atm.display();
        System.out.println("Total Amount: " + atm.Balance_Inquiry());
        System.out.println("Deposit Amount: "+atm.Cash_Deposit(10000));
        System.out.println("Total Amount: "+atm.Balance_Inquiry());
        System.out.println("Cash Withdraw: "+atm.CashWithdraw(500));
        System.out.println("Total Amount: "+atm.Balance_Inquiry());
    }
}


class ATM {
   int Account_no;
   String name;
   int amount;

public ATM(int Account_no , String name , int amount)
{
  this.Account_no = Account_no;
   this.name = name;
  this.amount = amount;
}
public void display()
{
    System.out.println(this.Account_no +" "+this.name +" "+this.amount);
}
public int Balance_Inquiry()
{
       return this.amount;
}
public int CashWithdraw(int amt)
{
    if(this.amount < amt)
    {
        System.out.println("Insufficient Balance");
    }
    else
    {
        this.amount = this.amount  - amt;
    }
       return amt;
}
public int Cash_Deposit(int amt)
{
   this.amount =  this.amount + amt;
       return amt;
}
}
