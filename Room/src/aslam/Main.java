package aslam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Chair chair=new Chair(new Size(20,30),"wood","red",true);
        Tables table=new Tables(new Size(10,20),"glass","blue");
        Size size=new Size(100,200);
        Room room=new Room("yellow",size,chair,table);
        room.getChair().getColour();
        room.getPaint();
        room.getChair().getFoldable();
        room.getSize().getWidth();
        room.getChair().getSize().getLength();

    }
}
