package aslam;

public class Ford extends Car{
    public Ford(int cylinders,String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Ford -> car's engine is starting";
    }
    public String accelerate(){
        return "Ford -> car is accelerating";

    }
    public String brake(){
        return "Ford -> car is braking";
    }
}
