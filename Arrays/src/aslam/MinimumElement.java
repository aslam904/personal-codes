
//this code wont work here paste it as a seperate project then it will work but i have used the function findmin in another program

package aslam;
import java.util.Scanner;
public class MinimumElement {
    int[] arrList=readElements(readInteger());

    public static int readInteger(){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        return n;
    }
    public static int[] readElements(int number){
        int n=number;
        int[] arrList=new int[n];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arrList.length;i++){
            arrList[i]=sc.nextInt();
        }
        return arrList;
    }
    public static void findMin(int[] array){
        int[] values=new int[array.length];
        int temp=0;
        for(int i=0;i<array.length;i++){
            values[i]=array[i];
        }
        //System.out.println("Explanation begins");
        for(int i=0;i<values.length;i++){
            for(int j=i+1;j<values.length;j++){  //j should be i+1 making j=1 will create error
                if(values[j]<values[i]){  //to change from descending to ascending just change comparision operator
                    temp=values[i];
                    values[i]=values[j];
                    values[j]=temp;
                }
            }
        }
        System.out.println("minimum value is"+values[0]);
    }




}


