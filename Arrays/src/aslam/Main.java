package aslam;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Descending desc=new Descending();
        System.out.println("----------Normal array------------------");
        Descending.printList(desc.list);
        System.out.println("----------Sorted array------------------");
        System.out.println("Explanation begins");
        Descending.printList(desc.sortedArray);
        System.out.println("------------Minimum element--------------");
        findMin(desc.list);


        revArray();
        int[] aslam={1,3,21,32,12};
        reverse(aslam);



        System.out.println("----------Creation of array methods------------------");
        Arr ar=new Arr();
        ar.createArr(10);
        ar.printArray();
        ar.printArray1();
        int[] arr=new int[10];
        arr[0]=10;
        arr[1]=2;

    }
    private static void reverse(int[] array){
        System.out.println(array.length);
        int[] revArr=new int[5];
        for(int i=array.length-1;i>=0;i--){
            int as=array.length-(i+1);
            System.out.println(as);
            revArr[as]=array[i];

        }
        System.out.println("Array = "+ Arrays.toString(array));
        System.out.println("Reversed array = "+Arrays.toString(revArr));

    }


    public static void revArray(){
        int[] values={56,76,89,90,45};

        for(int i=values.length-1;i>=0;i--){
            System.out.println(values[i]);
        }
    }

    public static void findMin(int[] array){
        int[] values=new int[array.length];
        int temp=0;
        for(int i=0;i<array.length;i++){
            values[i]=array[i];
        }
        System.out.println("Explanation begins");
        for(int i=0;i<values.length;i++){
            for(int j=i+1;j<values.length;j++){  //j should be i+1 making j=1 will create error
                if(values[j]<values[i]){  //to change from descending to ascending just change comparision operator
                    temp=values[i];
                    values[i]=values[j];
                    values[j]=temp;
                }
            }
        }
        System.out.println("Minimum value is "+values[0]);
    }

}
