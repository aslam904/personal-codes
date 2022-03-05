package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //byte:8bits width:8, short:16bits width:16,int:32bits width:32

        int minIntVal=Integer.MIN_VALUE;
        int maxIntVal=Integer.MAX_VALUE;
        System.out.println("minimum value for int is="+minIntVal);
        System.out.println("maximum value for int is="+maxIntVal);
        System.out.println("busted value for max int is="+(maxIntVal+1));
        System.out.println("busted value for min int is="+(minIntVal-1));

        //To accept a number as long datatype add L at the end of the number else it would be treated as integer
        long minlongVal=Long.MIN_VALUE;
        long maxlongVal=Long.MAX_VALUE;
        System.out.println("minimum value for long int is="+minlongVal);
        System.out.println("maximum value for long int is="+maxlongVal);
        System.out.println("busted value for max long int is="+(maxlongVal+1));
        System.out.println("busted value for min long int is="+(minlongVal-1));
        
        float minFloatVal=Float.MIN_VALUE;
        float maxFloatVal=Float.MAX_VALUE;
        System.out.println("minimum value for float is="+minFloatVal);
        System.out.println("maximum value for float is="+maxFloatVal);
        System.out.println("busted value for max float is="+(maxFloatVal+1));
        System.out.println("busted value for min float is="+(minFloatVal-1));
        
        byte minbyteVal=Byte.MIN_VALUE;
        byte maxbyteVal=Byte.MAX_VALUE;
        System.out.println("minimum value for byte is="+minbyteVal);
        System.out.println("maximum value for byte is="+maxbyteVal);
        System.out.println("busted value for max byte is="+(maxbyteVal+1));
        System.out.println("busted value for min byte is="+(minbyteVal-1));

        short minshortVal=Short.MIN_VALUE;
        short maxshortVal=Short.MAX_VALUE;
        System.out.println("minimum value for short is="+minshortVal);
        System.out.println("maximum value for short is="+maxshortVal);
        System.out.println("busted value for max short is="+(maxshortVal+1));
        System.out.println("busted value for min short is="+(minshortVal-1));



    }
}
