package com.company;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int minIntVal=Integer.MIN_VALUE;
        int maxIntVal=Integer.MAX_VALUE;
        System.out.println("minimum value for int is="+minIntVal);
        System.out.println("maximum value for int is="+maxIntVal);


        byte minbyteVal=Byte.MIN_VALUE;
        byte maxbyteVal=Byte.MAX_VALUE;
        System.out.println("minimum value for byte is="+minbyteVal);
        System.out.println("maximum value for byte is="+maxbyteVal);
        //byte a=minbyteVal/2;  // will show error because java treats it as integer casting will remove the error
        //casting is a method used to convert from one data type to another
        byte a=(byte) (minbyteVal/2);
        System.out.println(a);

        //challenge
        byte num1=10;
        short num2=20;
        int num3=50;
        long tot=50000+10*(num1+num2+num3);
        System.out.println(tot);
//long does not need casting short needs casting
        //short tot1=1000+10*(num1+num2+num3);//shows error
        short tot1=(short) (100+10*(num1+num2+num3));
        System.out.println(tot1);

        //float num4=5.25; will show error
        float num4=(float) 5.25;
        System.out.println(num4);
        //float num5=5.2/2; will show error
        float num5=5.2f/2f;
        //similiarly
        double num6=5.25d/2d;
        System.out.println(num5);
        System.out.println(num6);







    }
}
