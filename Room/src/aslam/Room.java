package aslam;

public class Room {
    private Chair chair;
    private Tables table;
    private String paint;
    private Size size;

    public Room(String paint,Size size,Chair chair,Tables table){
        this.paint=paint;
        this.size=size;
        this.chair=chair;
        this.table=table;
    }
    public Size getSize(){
        return size;
    }
    public void getPaint(){
        System.out.println("The room is painted in "+paint);
    }
    public Chair getChair(){
        return chair;
    }
    public Tables getTable(){
        return table;
    }
}
