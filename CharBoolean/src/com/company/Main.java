package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //char myChar="aslam"; will show error char can store only a letter
        char myChar='a';//use single quotes double quotes will show error
        //char occupies 2 bytes not 1byte because it allows to store unicode characters
        //char can represent 65535 types of characters
        //refer unicode website
        char myUni='\u0044';
        System.out.println("The char for unicode 0044 is "+myUni);
        char myUni1='\u00A9';
        System.out.println("The char for unicode 00A9 is "+myUni1);
        boolean myBool=true;
        boolean myBool1=false;
        //true should be typed as true not True or TRUE
        //In the below case in if statement if i use any datatype instead of boolean with single "="
        //It will show a error but in the case of boolean it will not show error
        // but the code inside the block will not get executed if the if statement contains false
        boolean isAlien=true;
        if (isAlien=false){//it will not get executed
            System.out.println("It is a alien");
        }
        boolean iscar=false;
        if (iscar=true){//it will get executed
            System.out.println("It is a car");
        }
        if (iscar==false){//"==" will check the variable and execute according to it
            System.out.println("it is not a car");
        }


    }
}
