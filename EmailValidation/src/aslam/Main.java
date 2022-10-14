package aslam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static Scanner sc=new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        ArrayList<String> emails=new ArrayList<String>();
        System.out.println("Type the number of emails to verify");

        int number=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<number;i++) {

            System.out.println("Type ur email");
            emails.add(sc.nextLine().toLowerCase());
        }

        String regex="[a-z0-9.]+@[a-z0-9.]+$";
        for(int i=0;i<emails.size();i++) {
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(emails.get(i));
            if(matcher.matches()) {
                System.out.println("Email is valid");
            }else {
                System.out.println("Email is invalid");
            }

        }
    }

}

