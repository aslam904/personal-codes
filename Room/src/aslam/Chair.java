package aslam;

public class Chair {
    private Size size;
    private String types;
    private String colour;
    private boolean foldable;

public Chair(Size size,String types, String colour,boolean foldable){
    this.colour=colour;
    this.foldable=foldable;
    this.size=size;
    this.types=types;
}
    public void getType(){
        System.out.println("The type is "+types);
    }
    public void getFoldable(){
        System.out.println("Foldable or not is "+foldable);
    }
    public void getColour(){
        System.out.println("The colour is "+colour);
    }

    public Size getSize(){
        return size;

    }

}
