package aslam;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer>customers;
    public Branch(String name){
        this.name=name;
        this.customers=new ArrayList<Customer>();
    }
    public String getName(){
        return name;
    }
    public ArrayList<Customer> getCustomers(){
        return customers;
    }
    public boolean newCustomer(String nameOfTheCus,double amount){
        if(findCustomer(nameOfTheCus)==null){
            customers.add(new Customer(nameOfTheCus,amount));
            return true;
        }else{
            return false;
        }
    }
    public boolean addCustomerTransaction(String nameOfTheCus, double amount){
        Customer cus=findCustomer(nameOfTheCus);
        if(cus!=null){
            cus.addTransaction(amount);
            return true;
        }else{
            return false;
        }
    }
    private Customer findCustomer(String name){
        for(int i=0;i<this.customers.size();i++){
            Customer cus=this.customers.get(i);
            if(cus.getName().equals(name)){
                return cus;
            }
        }
        return null;
    }

}

