package aslam;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList<String> llist=new LinkedList<String>();
        llist.add("item1");
        llist.add("item2");// if you miss an index then exception arises
        llist.add(2,"item0");
        printLinkedList(llist);
        LinkedList<String>llist2=new LinkedList<String>();
        //going to fill this linkedlist using fuction in a sorted way
        sortLinkedList(llist2,"farook");
        sortLinkedList(llist2,"aslam");
        sortLinkedList(llist2,"aqeel");
        sortLinkedList(llist2,"anwar");
        sortLinkedList(llist2,"nowfal");
        sortLinkedList(llist2,"sahana");
        sortLinkedList(llist2,"ashiq");
        sortLinkedList(llist2,"rafeek");
        sortLinkedList(llist2,"salman");
        sortLinkedList(llist2,"aslam");
        sortLinkedList(llist2,"farook");
        printLinkedList(llist2);



    }
    public static void printLinkedList(LinkedList<String> llist){
        Iterator<String> i=llist.iterator();
        while(i.hasNext()){
            System.out.println("The entries are "+i.next());
        }
        System.out.println("-----------------------------------------");
    }

    public static boolean sortLinkedList(LinkedList<String> llist, String item){
        ListIterator<String> li=llist.listIterator();
        while(li.hasNext()){
            int compare=li.next().compareTo(item);
            System.out.println("The value of compare is "+compare);
            System.out.println("The item is currently "+item);
            System.out.println("=====================================================");
            if(compare==0){
                System.out.println(item+" is already added");
                return false;
            }else if(compare>0){
                li.previous();// go to the previous item
                li.add(item);//add the item
                return true;
            }else if(compare<0){
             //move on
            }
        }
        li.add(item);//leftover items added
        return true;

    }

}
