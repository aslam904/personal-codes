package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int age=20;
        boolean isTwenty=(age==20)?true:false;
        System.out.println(isTwenty);

        boolean isAlien=true;
        boolean wasAlien=isAlien?true:false;
        System.out.println(wasAlien);


        //challenge operator precedence
        double var=20.00;
        double var1=80.00;
        double var3=(var+var1)*100.00;
        double var4=var3%40.00;
        boolean isZero= (var4==0)?true:false;
        System.out.println(isZero);
        if (isZero!=true){
            System.out.println("got some remainder");
        }


    }
}
