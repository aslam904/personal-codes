package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int l=150,m=250,n=900;
        calculate();
        calculate_runtime(12,23,43);
        calculate_runtime(l,m,n);
    }

    public static void calculate() {
        int a = 100, b = 200, c = 300, d;
        d = a + b + c;
        System.out.println("sum is =" + d);
    }
    public static void calculate_runtime(int a,int b,int c){
        int d;
        d=a+b+c;
        System.out.println("sum of runtime is ="+d);
    }
}