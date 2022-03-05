package aslam;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    public Monster(String name,int hitpoints, int strength){
        this.hitPoints=hitPoints;
        this.name=name;
        this.strength=strength;
    }

    public String getName() {
        return name;
    }

    public int getHitpoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
    public List<String> write(){
        List<String>lis=new ArrayList<String>();
        lis.add(0,this.name);
        lis.add(1,""+this.hitPoints);
        lis.add(2,""+this.strength);
        return lis;
    }
    public void read(List<String> list1){
       if(list1!=null && list1.size()>0){
           this.name=list1.get(0);
           this.hitPoints=Integer.parseInt(list1.get(1));
           this.strength=Integer.parseInt(list1.get(2));
       }

    }
    @Override
    public String toString(){
        return "Monster{name='"+this.name+"', hitpoints="+this.hitPoints+", strength="+this.strength+"}";
    }
}
