package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        getDurationString(299,79);
    }
    public static void getDurationString(int minutes,int seconds){
        if(minutes>=0 && seconds >=0){

            if (seconds>59){
                int rem =seconds/60;
                minutes=minutes+rem;
                seconds=seconds-rem*60;
            }
            int hours=minutes/60;
            minutes = minutes-hours*60;
            System.out.println("hours="+hours);
            System.out.println("minutes="+minutes);
            System.out.println("seconds="+seconds);

        }else{
            System.out.println("Invalid");
        }

    }

}
