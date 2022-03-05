package aslam;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts = new ArrayList<Contact>();

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
    }

    public boolean addNewContact(Contact contact) {
        if(findContact(contact.getName())>=0){
            return false;
        }else{
            myContacts.add(contact);
            return true;
        }


    }

    public boolean updateContact(Contact contact1, Contact contact2) {
        int position = findContact(contact1);
        if (position >= 0) {
            myContacts.set(position, contact2);
            return true;
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if (position >= 0) {
            myContacts.remove(position);
            return true;
        } else {
            return false;
        }
    }


    public int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }


    public int findContact(String contact) {

        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact foundContact = myContacts.get(i);
            if (foundContact.getName().equals(contact)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contact){
        if(findContact(contact)>=0){
            return myContacts.get(findContact(contact));
        }else{
            return null;
        }
    }
    public void printContacts(){
        System.out.println("Contact List");

        for(int i=0;i<myContacts.size();i++){
            System.out.println((i+1)+". "+myContacts.get(i).getName()+" -> "+myContacts.get(i).getPhoneNumber());
            //execute then only u can understand the i+1

        }
    }
}


