package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean myBool=false;
        if (myBool==false)
            System.out.println("I am Aslam");

        if (myBool==true);
            System.out.println("I am aqeel");
            //even though myBool is true the statement gets printed because the if condition has a ; thereby ending it

        if (myBool==false)
            System.out.println("I am shahanaaz");
            System.out.println("I am anwar");
            //in the code if i set myBool==true the 2nd statement will still get printed because of absence of code block{}

        if (myBool==true){
            System.out.println("I am shahanaaz");
            System.out.println("I am anwar");
        }//now i have set a block using {} so both the statement are considered to be inside the if block
        //thereby both statements wont get printed

        //always use code block
        int topScore=90;
        int passMark=35;
        int aslam=50;
        if ((aslam>35) && (aslam<=100 )){//both conditions should be true or the block wont get executed
            System.out.println("aslam has passed the exam");
        }
        int secondTopScore=80;
        int aqeel=85;
        if ((aqeel>=80)||(aqeel>=90)){
            System.out.println("aqeel is in top 3 rank");
        }
        if (aslam>=50){
            int shaggy=aslam+aqeel;
            System.out.println("total= "+shaggy);
            System.out.println("aslam is a good boy");
        }else if(aslam<50){
            System.out.println("aslam is from kdnl");
        }else{
            System.out.println("aslam is a bad boy");
        }
        //to reuse the same variable just call the variable and change the value
        aslam=100;
        System.out.println("the changed value of aslam is "+aslam);

        //System.out.println(shaggy);
        //this line of code will generate a error because it is outside the code block of if statement
        //variable shaggy is inside if statement block so it wont work outside

    }
}
