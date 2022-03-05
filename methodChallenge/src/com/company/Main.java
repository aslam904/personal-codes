package com.company;

public class Main {

    public static void main(String[] args) {
	int pos=calculateHighScorePosition(1500);
	displayHighScorePosition("aslam",pos);
	int pos1=calculateHighScorePosition(900);
	displayHighScorePosition("anwar",pos1);
	int pos2=calculateHighScorePosition(400);
	displayHighScorePosition("aqeel",pos2);
	int pos3=calculateHighScorePosition(50);
	displayHighScorePosition("sahana",pos3);
	int pos4=calculateHighScorePosition(500);
	displayHighScorePosition("salman",pos4);
	int pos5=calculateHighScorePosition(1000);
	displayHighScorePosition("farook",pos5);
	int pos6=calculateHighScorePosition(100);
	displayHighScorePosition("rafeek",pos6);








    }
    public static void displayHighScorePosition(String playerName,int position){
        System.out.println(playerName+ " managed to get position " +position+ " in the high score table");
    }
    public static int calculateHighScorePosition(int score){
        if (score>=1000) {
            return 1;
        }
        if(score>=500){
            return 2;
        }
        if(score>=100){
            return 3;
        }
        else{
            return 4;
        }
    }

}
