package aslam;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch>branches;
    public Bank(String name){
        this.name=name;
        this.branches=new ArrayList<Branch>();
    }
    public boolean addBranch(String nameOfTheBranch){
        if(findBranch(nameOfTheBranch)==null){
            this.branches.add(new Branch(nameOfTheBranch));
            return true;
        }else{
            return false;
        }
    }
    public boolean addCustomer(String nameOfTheBranch,String nameOfTheCus,double amount){
        Branch branch=findBranch(nameOfTheBranch);
        if(branch!=null){
            return branch.newCustomer(nameOfTheCus,amount);
        }else{
            return false;
        }
    }
    public boolean addCustomerTransaction(String nameOfTheBranch,String nameOfTheCus,double amount){
        Branch branch=findBranch(nameOfTheBranch);
        if(branch!=null){
            return branch.addCustomerTransaction(nameOfTheCus,amount);
        }else{
            return false;
        }

    }
    private Branch findBranch(String nameOfTheBranch){
        for(int i=0;i<this.branches.size();i++){
            Branch branch=this.branches.get(i);
            if(branch.getName().equals(nameOfTheBranch)){
                return branch;
            }
        }
        return null;
    }
    public boolean listCustomers(String nameOfTheBranch,boolean print){
        Branch branch=findBranch(nameOfTheBranch);
        if(branch!=null){
            System.out.println("Customer details for branch "+branch.getName());
            ArrayList<Customer>cus=branch.getCustomers();
            for(int i=0;i<cus.size();i++){
                Customer customer=cus.get(i);
                System.out.println("Customer: "+customer.getName()+"["+(i+1)+"]");
                if(print){
                    ArrayList<Double> transactions=customer.getTransactions();
                    for(int j=0;j<transactions.size();j++){
                        Double trans=transactions.get(j);
                        System.out.println("Transactions");
                        System.out.println("["+(j+1)+"] "+"Amount "+trans);
                    }
                }
            }
            return true;
        }else {
            return false;
        }
    }

}
