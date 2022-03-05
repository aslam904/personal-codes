package aslam;

public class Tables {
    private Size size;
    private String types;
    private String colour;


    public Tables(Size size,String types, String colour){
        this.colour=colour;
        this.size=size;
        this.types=types;
    }
    public void getType(){
        System.out.println("The type is "+types);
    }

    public void getColour(){
        System.out.println("The colour is "+colour);
    }

    public Size getSize(){
        return size;
    }

}
