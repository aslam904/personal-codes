package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int a=getDaysInMonth(2,2020);
        int b=getDaysInMonth(2,2021);
        int c=getDaysInMonth(4,2020);
        int d=getDaysInMonth(3,2020);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);


    }
    public static boolean isLeapYear(int year){
        if(year<1 || year>9999){
            return false;
        }
        if (year%4==0 && year%100==0 && year%400==0){
            return true;
        }
        else if (year%4==0 && year%100==0){
            return false;
        }
        else if (year%4==0 && year%100!=0){
            return true;
        }
        else if (year%4!=0){
            return false;
        }
        else{
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year){
        if(month<1 || month>12 || year<1 || year>9999){
            return -1;
        }else if(isLeapYear(year) && month==2 ){
            return 29;
        }else if(!isLeapYear(year) && month==2){
            return 28;
        }else if(month==4 || month==6 || month==9 || month==11){
            return 30;
        }else{
            return 31;
        }

    }
}
