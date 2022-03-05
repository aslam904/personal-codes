package com.company;


public class Main {
    public static void main(String[] args) {
        double centi=calcInchesAndFeetToCM(12,8);
        double foot=calcInchesAndFeetToCM(8);
        System.out.println(centi);
        System.out.println(foot);
    }
    public static double calcInchesAndFeetToCM(int feet,int inches){
        if (feet>=0 && inches>=0 && inches<=12){
            double cm =feet*30.48+inches*2.54;
            return cm;
        }else{
            return -1;
        }
    }
    public static double calcInchesAndFeetToCM(int inches){
        if(inches >=0){
            double feet =inches*0.0833;
            return feet;
        }else{
            return -1;
        }
    }

}


