package aslam;

import java.util.ArrayList;

public class Team<T extends Player> {
    private String name;
    int played = 0;
    int won = 0;
    int lost = 0;
    int tied = 0;
    private ArrayList<T> members=new ArrayList<T>();
    public Team(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }

    public boolean addPlayer(T Player){
        if(members.contains(Player)){
            System.out.println("Already in team");
            return false;
        }else{
            members.add(Player);
            System.out.println(Player.getName()+" of age "+Player.getAge()+" and score "+Player.getScore()+" has been picked for team "+this.name);
            return true;
        }

    }
    public int numOfPlayers(){
        return this.members.size();
    }
    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {

        String message;

        if(ourScore > theirScore) {
            won++;
            message = " beat ";
        } else if(ourScore == theirScore) {
            tied++;
            message = " drew with ";

        } else {
            lost++;
            message = " lost to ";
        }
        played++;
        if(opponent != null) {
            System.out.println(this.getName() + message + opponent.getName());
            opponent.matchResult(null, theirScore, ourScore);
        }
    }




}
