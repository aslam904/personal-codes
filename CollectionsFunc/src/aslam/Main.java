package aslam;

import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Filess f=new Filess("budget","doc");
        Filess f1=new Filess("comics","epub");
        Filess f2=new Filess("novels","pdf");
        Filess f3=new Filess("presentation","ppt");
        ArrayList<Filess> arr=new ArrayList<Filess>();
        arr.add(f);
        arr.add(f1);
        arr.add(f2);
        arr.add(f3);
        ArrayList<Filess> cpy=new ArrayList(arr);//copying the arraylist to another arraylist
        System.out.println("normally printing arr");
        printArray(arr);
        System.out.println("================================================");
        System.out.println("normally printing cpy");
        printArray(cpy);
        System.out.println("================================================");
        Collections.reverse(arr);//doing this because to check whether cpy and arr are sharing the same memory
        System.out.println("reversing arr");
        printArray(arr);
        System.out.println("================================================");
        Collections.shuffle(cpy);
        System.out.println("shuffling cpy");
        printArray(cpy);
        System.out.println("================================================");
        System.out.println("sorting an array list");
        ArrayList<Integer> intr=new ArrayList<>();//sorting arr or cpy will show an error
        intr.add(10);
        intr.add(100);
        intr.add(107);
        intr.add(150);
        intr.add(410);
        intr.add(106);
        Collections.sort(intr);
        printArray1(intr);
        System.out.println("===========================================================");
        System.out.println("sorting strings");
        ArrayList<String> strng=new ArrayList<>();
        strng.add("10");
        strng.add("100");
        strng.add("107");
        strng.add("150");
        strng.add("410");
        strng.add("106");
        strng.add("sahana");
        strng.add("aslam");
        Collections.sort(strng);
        printArray1(strng);
        System.out.println("=============================================================");
        System.out.println("The max of the arraylist intr is "+Collections.max(intr));
        System.out.println("The min of the arraylist intr is "+Collections.min(intr));
        System.out.println("The max of the arraylist strng is "+Collections.max(strng));
        System.out.println("The min of the arraylist intr is "+Collections.min(strng));
        //finds the max and min of arraylist<String> by finding the size of each element
        //where sahana has the most letters and "10" has the min letters



    }
    public static void printArray(ArrayList<Filess> f){
        for(int i=0;i<f.size();i++){
            System.out.println("The files are "+f.get(i).getName()+" and the extension is "+f.get(i).getExt());
        }
    }
    public static void printArray1(ArrayList f){ //did not give type because to accept arraylist of all types
        for(int i=0;i<f.size();i++){
            System.out.println("The elements are "+f.get(i));
        }
    }
}
