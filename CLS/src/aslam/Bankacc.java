package aslam;

public class Bankacc {
    private long accNo;
    private int balance;
    private String cusName;
    private long phNo;
    private String email;
    //constructors can be used instead of getters and setters It si better to use constructors than getters and setters
    public Bankacc(long accNo,long phNo,String cusName,String email,int balance) {
        System.out.println("Constructor started");
        this.phNo=phNo;
        this.accNo=accNo;
        this.email=email;
        this.cusName=cusName;
        this.balance=balance;
    }
    public Bankacc() {
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("second constructor started"); //to use getters and setters while using a constructor a seperate constructor with no parameter should be created
    }


    public void setAcc(long accNo){
        this.accNo=accNo;
    }
    public void setBalance(int balance){
        this.balance=balance;
    }
    public void setCusName(String cusName){
        this.cusName=cusName;
    }
    public void setphNo(long phNo){
        this.phNo=phNo;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public long getAccNo(){
        return accNo;
    }
    public String getCusName(){
        return cusName;
    }
    public int getBalance(){
        return balance;
    }
    public String getEmail(){
        return email;
    }
    public long getPhNo(){
        return phNo;
    }

    public void depFund(int amount){
        balance=balance+amount;
        System.out.println("The account number is "+accNo);
        System.out.println("The account name is "+cusName);
        System.out.println("The account mail id is "+email);
        System.out.println("The account phone number is "+phNo);
        System.out.println("The account balance is "+balance);
    }
    public void withdrawFund(int amount){
        if(amount>balance){
            System.out.println("The acc balance is low");
        }else{
            balance=balance-amount;
            System.out.println("The account balance is "+balance);
        }
    }










}
