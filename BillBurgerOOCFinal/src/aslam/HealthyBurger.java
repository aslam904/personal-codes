package aslam;

public class HealthyBurger extends Hamburger {

    private String healthyExtra1Name;
    private double healthyExtra1Price = 0;
    private String healthyExtra2Name;
    private double healthyExtra2Price = 0;



    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye roll");
        super.addHamburgerAddition1("Egg",5.43);
    }
    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger(){
        double hamburgerPrice=super.itemizeHamburger();
        if (healthyExtra1Price != 0) {
            hamburgerPrice += healthyExtra1Price;
            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
        }
        if(healthyExtra2Price!=0) {
            hamburgerPrice+=healthyExtra2Price;
            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
        }
        return hamburgerPrice;

    }

}
