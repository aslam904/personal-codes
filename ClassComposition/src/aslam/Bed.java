package aslam;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

public Bed(String style,int pillows,int sheets,int height,int quilt){
    this.height=height;
    this.quilt=quilt;
    this.style=style;
    this.pillows=pillows;
    this.sheets=sheets;
}
public void make(){
    System.out.println("The bed is being made");
}
public String getStyle(){
    return style;
}
public int getPillows(){
    return pillows;
}
public int getHeight(){
    return height;
}
public int getSheets(){
    return sheets;
}
public int getQuilt(){
    return quilt;
}
}




