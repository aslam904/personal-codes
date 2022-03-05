package aslam;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;
    public Player(String name,int hitPoints,int strength){
        this.name=name;
        this.hitPoints=hitPoints;
        this.strength=strength;
        this.weapon="Sword";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }
    public List<String> write(){
        List<String>lis=new ArrayList<String>();
        lis.add(0,this.name);
        lis.add(1,this.weapon);
        lis.add(2,""+this.hitPoints);
        lis.add(3,""+this.strength);
        return lis;
    }
    public void read(List<String> list){
        if(list!=null && list.size()>0){
            this.name=list.get(0);
            this.weapon=list.get(1);
            this.hitPoints=Integer.parseInt(list.get(2));
            this.strength=Integer.parseInt(list.get(3));
        }
    }
    @Override
    public String toString(){
        return "Player{name='"+this.name+"', hitpoints="+this.hitPoints+", strength="+this.strength+", weapon='"+this.weapon+"'}";
    }
}

