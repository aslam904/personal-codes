package aslam;


import java.util.Scanner;

public class Descending {
    Scanner sc=new Scanner(System.in);
    int[] list=getIntegers();
    int[] sortedArray=sortArray(list);


    public int[] getIntegers(){
        int[] values=new int[5];
        for(int i=0;i<values.length;i++){
            System.out.println("enter a number ");
            values[i]=sc.nextInt();
        }
        return values;
    }

    public static void printList(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }


    public int[] sortArray(int[] list){
        int[] values=new int[list.length];
        int temp=0;
        for(int i=0;i<list.length;i++){
            values[i]=list[i];
        }

        for(int i=0;i<values.length;i++){
            for(int j=i+1;j<values.length;j++){  //j should be i+1 making j=1 will create error
                if(values[j]>values[i]){  //to change from descending to ascending just change comparision operator
                    temp=values[i];
                    System.out.println("temp= "+temp);
                    System.out.println("values[i]= "+values[i]);
                    values[i]=values[j];
                    System.out.println("2nd step temp= "+temp);
                    System.out.println("2nd step values[i]= "+values[i]);
                    System.out.println("2nd step values[j]= "+values[j]);
                    values[j]=temp;
                    System.out.println("3rd step temp= "+temp);
                    System.out.println("3rd step values[i]= "+values[i]);
                    System.out.println("3rd step values[j]= "+values[j]);
                }
            }
        }
        return values;
    }

}
