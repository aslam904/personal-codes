package aslam;

public abstract class Player {
    private String name;
    private int age;
    private int score;
    private int wickets;
    public Player(String name,int age,int score,int wickets){
        this.name=name;
        this.age=age;
        this.score=score;
        this.wickets=wickets;
    }

    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public int getScore(){
        return score;
    }
}
