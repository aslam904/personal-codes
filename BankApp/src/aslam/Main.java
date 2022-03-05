package aslam;

import java.util.Scanner;

public class Main {
    private static Scanner sc=new Scanner(System.in);
    private static Bank bank=new Bank("63846892997");

    public static void main(String[] args) {
	// write your code here
        Scanner sc=new Scanner(System.in);
        boolean quit=false;
        startApp();
        printActions();


        while(!quit){
            System.out.println("enter a choice");
            int choice=sc.nextInt();
            switch (choice){
                case 0:
                    System.out.println("Switching down....");
                    quit=true;
                    break;

                case 1:
                    bank.printAccounts();
                    break;

                case 2:
                    createAccount();
                    break;

                case 3:
                    updateAccount();
                    break;

                case 4:
                    removeAccount();
                    break;

                case 5:
                    queryAccount();
                    break;

                case 6:
                    printActions();
                    break;

            }

        }

    }
    public static void createAccount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a name");
        String name=sc.nextLine();
        System.out.println("enter account number");
        String accNo=sc.nextLine();
        System.out.println("enter balance");
        int balance=sc.nextInt();
        BankAccount acc=new BankAccount(name,accNo,balance);
        if(bank.addNewAccount(acc)){
            System.out.println("New account added with name-> "+acc.getName()+" with acc no -> "+acc.getAccNo()+" has balance -> "+acc.getBalance());
        }else{
            System.out.println("account already exists");
        }
    }
    public static void updateAccount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a existing accName");
        String existingName=sc.nextLine();
        BankAccount existingacc=bank.queryAcc(existingName);
        if(existingacc==null){
            System.out.println("Account not found");
        }else{
            System.out.println("enter a name");
            String name=sc.nextLine();
            System.out.println("enter account number");
            String accNo=sc.nextLine();
            System.out.println("enter balance");
            int balance=sc.nextInt();
            BankAccount newAcc=BankAccount.createBankAccount(name,accNo,balance);
            if(bank.updateAccount(existingacc,newAcc)){
                System.out.println("account updated sucessfully");
            }else{
                System.out.println("error in updating..");
            }
        }
    }

    public static void queryAccount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a AccName");
        String name=sc.nextLine();
        BankAccount acc=bank.queryAcc(name);
        if(acc==null){
            System.out.println("No account found");
        }
        System.out.println("Acc name-> "+acc.getName()+" acc number-> "+acc.getAccNo()+" acc balance -> "+acc.getBalance());
    }

    public static void removeAccount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a AccName to remove");
        String name=sc.nextLine();
        BankAccount existingAcc=bank.queryAcc(name);
        if(existingAcc==null){
            System.out.println("Account not found");
        }else{
            bank.removeAccount(existingAcc);
            System.out.println("account removed successfully");
        }
    }

    private static void startApp() {
        System.out.println("Starting App...");
    }

    private static void printActions() {
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0  - to shutdown\n" +
                "1  - to print accounts\n" +
                "2  - to add a new account\n" +
                "3  - to update an existing account\n" +
                "4  - to remove an existing account\n" +
                "5  - query if an existing account exists\n" +
                "6  - to print a list of available actions.");
        System.out.println("Choose your action: ");
    }



}
