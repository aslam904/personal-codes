package aslam;

public class Mitsubishi extends Car{


    public Mitsubishi(int cylinders,String name) {
        super(cylinders, name);
    }
    @Override
    public String startEngine(){
        return "Mitsubishi -> car's engine is starting";
    }
    public String accelerate(){
        return "Mitsubishi -> car is accelerating";
    }
    public String brake(){
        return "Mitsubishi -> car is braking";
    }
}
