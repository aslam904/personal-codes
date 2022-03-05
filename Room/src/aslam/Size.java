package aslam;

public class Size {
    private int length;
    private int width;
    public Size(int length, int width){
        this.length = length;
        this.width=width;
    }

    public void getLength() {
        System.out.println("The length is "+length);
    }

    public void getWidth() {
        System.out.println("The width is "+width);
    }
}
