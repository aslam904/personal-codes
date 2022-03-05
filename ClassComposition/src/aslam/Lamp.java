package aslam;

public class Lamp {
    private String style;
    private boolean battery;
    private int globRating;

    public Lamp(String style,boolean battery,int globRating){
        this.battery=battery;
        this.style=style;
        this.globRating=globRating;
    }
    public void turnOn(){
        System.out.println("lamp is being turned on");
    }
    public String getStyle(){
        return style;
    }
    public boolean isBattery(){
        return battery;
    }
    public int getGlobRating() {
        return globRating;
    }

}