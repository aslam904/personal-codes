package aslam;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Person person=new Person();
        person.setFirstName("aslam");
        person.setLastName("John");
        person.setAge(10);

        Bankacc aqeelAcc=new Bankacc(8645678903423456L,8637458951L,"Mohamed aqeel","aqeel750@gmail.com",120);
        aqeelAcc.depFund(1234);
        aqeelAcc.withdrawFund(2000);
        aqeelAcc.withdrawFund(200);

        Bankacc aslamAcc=new Bankacc();  //create acc for each person by introducing them as new objects
        aslamAcc.setAcc(138201000033879L);
        aslamAcc.setBalance(100);
        aslamAcc.setCusName("Mohamedaslam");
        aslamAcc.setEmail("aslam904@gmail.com");
        aslamAcc.setphNo(9092019404L);
        aslamAcc.depFund(1234);
        aslamAcc.withdrawFund(2000);
        aslamAcc.withdrawFund(123);
        System.out.println("updated details");
        System.out.println(aslamAcc.getBalance());

        Carpet carpet = new Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());








    }
}
