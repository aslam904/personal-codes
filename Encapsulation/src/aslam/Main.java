package aslam;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Printer printer=new Printer(50,true);
        System.out.println(printer.addToner(50));
        System.out.println("initial pages printed "+printer.getPagesPrinted());
        int pagesPrinted=printer.printPages(10);
        System.out.println("Pages printed was "+pagesPrinted+" new total count for printer "+printer.getPagesPrinted());
        pagesPrinted=printer.printPages(2);
        System.out.println("Pages printed was "+pagesPrinted+" new total count for printer "+printer.getPagesPrinted());

    }
}
