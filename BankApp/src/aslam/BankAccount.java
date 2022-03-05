package aslam;

public class BankAccount {
    private String name;
    private String accNo;
    private int balance;

    public BankAccount(String name,String accNo,int balance){
        this.accNo=accNo;
        this.balance=balance;
        this.name=name;
    }

    public int getBalance() {
        return balance;
    }
    public String getAccNo(){
        return accNo;
    }
    public String getName(){
        return name;
    }
    public static BankAccount createBankAccount(String name,String accNo,int balance){
        return new BankAccount(name,accNo,balance);
        //should give "new" to create a new instance of class
    }
}

