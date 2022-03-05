package aslam;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger(){
        super("Deluxe","Sausage & bacon",14.54,"White roll");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("drink",1.81); // to use the parent class function as it is
//we are editting base class member variables through super() and using the addhamburgeraddition function to add chips and drink
// then use itemizeHamburger function using the editted member variables and functions

    }


    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

}
