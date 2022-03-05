package aslam;

import java.util.ArrayList;

public class Bank {
    private String accNo;
    private ArrayList<BankAccount> acc=new ArrayList<BankAccount>();
    public  Bank(String accNo){
        this.accNo=accNo;
    }
    public boolean addNewAccount(BankAccount account){
        if(findAccount(account.getName())>=0){
            return false;
        }else{
            acc.add(account);
            return true;
        }
    }
    public boolean updateAccount(BankAccount oldacc,BankAccount newacc){
        int pos=findAccount(oldacc);
        if(pos>=0){
            acc.set(pos,newacc);
            return true;
        }else{
            return false;
        }
    }

    public boolean removeAccount(BankAccount account){
        if(findAccount(account)>=0){
            acc.remove(account);
            return true;
        }else{
            return false;
        }
    }
    public int findAccount(BankAccount bank){
        return acc.indexOf(bank);
    }
    public int findAccount(String name){
        for(int i=0;i<acc.size();i++){
            BankAccount account=acc.get(i);
            if(account.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    public BankAccount queryAcc(String name){
        if(findAccount(name)>=0){
            return acc.get(findAccount(name));
        }else{
            return null;
        }

    }
    public void printAccounts(){
        System.out.println("Account details");
        for(int i=0;i<acc.size();i++){
            System.out.println((i+1)+". "+acc.get(i).getName()+"->"+acc.get(i).getAccNo()+"->"+acc.get(i).getBalance());
        }
    }


}
