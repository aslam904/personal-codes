package aslam;

public class Car {
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    public Car(int cylinders,String name){
        this.name=name;
        this.cylinders=cylinders;
        this.wheels=4;
        this.engine=true;
    }
    public String startEngine(){
            return "Car -> car's engine is starting";
    }
    public String accelerate(){
        return "Car -> car is accelerating";
    }
    public String brake(){
        return "Car -> car is braking";
    }
    public int getCylinders(){
        return cylinders;
    }
    public String getName(){
        return name;
    }





}
