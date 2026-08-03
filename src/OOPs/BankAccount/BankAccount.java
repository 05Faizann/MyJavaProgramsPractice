package OOPs.BankAccount;

public class BankAccount {
    final private int accountNumber;
    final private String holderName;
    private double balance;

    BankAccount(int accountNumber, String holderName, double balance){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        if(balance>=0){
            this.balance=balance;
        }else{
            System.out.println("Balance cannot be negative");
        }
    }
    public void deposit(double amount) {
        if (amount >= 0) {
            this.balance = this.balance + amount;
                System.out.println("Successfully deposited amount " + amount + " in A/c No. "+ this.accountNumber +"\n");
        }else{
            System.out.println("Invalid amount");
        }
    }
    public void withdrawl(double amount){
        if(amount<=this.balance){
            this.balance=this.balance-amount;
            System.out.println("Withdrawl successfull. Remaining balance: " + this.balance + "\n");
        }else{
            System.out.println("Withdrawl limit exceeded\n");
        }
    }
    public void displayBalance(){
        System.out.println("Available balance: " + balance + "\n");
    }
    public void displayDetails(){
        System.out.println("Name: " + holderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance + "\n");
    }
    public double getBalance(){
        return this.balance;
    }
}
class Main{
    public static void totalBalance(BankAccount[] arr){
        double totalBalance=0;
        for(int i=0; i<arr.length; i++){
            totalBalance += arr[i].getBalance();
        }
        System.out.println("Total balance in all accounts: " + totalBalance);
    }
    public static void main(String[] args){
        BankAccount[] arr=new BankAccount[2];
        arr[0]=new BankAccount(123, "Faizan", 0);
        arr[1]=new BankAccount(124, "Raj", 0);


        arr[0].deposit(15000);
        arr[1].deposit(15000);

        totalBalance(arr);
    }
}
