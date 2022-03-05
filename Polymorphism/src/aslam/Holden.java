package aslam;

public class Holden extends Car {

    public Holden(int cylinders,String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Holden -> car's engine is starting";

    }
    public String accelerate(){
        return "Holden -> car is accelerating";
    }
    public String brake(){
        return "Holden -> car is braking";
    }
}

