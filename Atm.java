 import java.util.*;

public class atm {
    public static void main(String[] args) {
        System.out.println("Welcome!!");
        System.out.println("Choose the options:");
        System.out.println("Enter 1 to Check the balance.");
        System.out.println("Enter 2 to deposit ammount.");
        System.out.println("Enter 3 to withdraw ammount.");
        
       
Bankaccount account = new Bankaccount(10000);
        Scanner sc =  new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Your current balance is: " + account.getbalance() );
                break;
        case 2:  
        System.out.println("Enter the amount to deposit:");
        double d = sc.nextDouble();
                account.deposit(d);
        break;
        case 3:
        System.out.println("Enter the to withdraw :");
        double w = sc.nextDouble();
        account.withdraw(w);
        break;
        }
         System.out.println("THANKYOU!!");
}
}

class Bankaccount{
    private double balance;
    public Bankaccount(double initialbal){
        this.balance = initialbal;
    }
    public double getbalance(){
        return balance;
    }
    public void deposit(double amount){
        if(amount >0){
            balance += amount;
            System.out.println("Transaction successful.");
            System.out.println("Balance in your account: "+ balance);
        }else{
            System.out.println("Transaction fail.");
            System.out.println("Not enough amount in your account");
        }
    }
    public void withdraw(double amount){
        if(balance-amount>0  ){
            balance-=amount;
            System.out.println("Transaction success.");
            System.out.println("Your balance is "+ balance);
        }else{
            System.out.println("Transaction fail.");
        }
    }

}

