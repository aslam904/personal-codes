package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result=0;
        int i;
        int s;
        //define size of array
        s = input.nextInt();
        //The array is defined "arr" and inserted marks into it.
        int[] arr = new int[s];
        double sum=0;
        for(i=0;i<arr.length;i++)
        {
            arr[i]=input.nextInt();
            sum+=arr[i];
        }
        mark_avg=sum/s;
        System.out.println(mark_avg);
        for(i=0;i<s;i++){
            if (result<arr[i]) {
                result = arr[i];
            }
        }
        System.out.println(result);
        }
    }
