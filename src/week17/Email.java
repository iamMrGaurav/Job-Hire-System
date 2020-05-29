package week17;

import java.util.Scanner;

public class Email implements Messaging {
    Scanner scan = new Scanner(System.in);
    public String getMessage(){
        System.out.println("Enter Message:");
        String email= scan.nextLine();
        return email;
    }

    @Override
    public String getRecipient() {
        System.out.println("Enter Email Address:");

        return scan.nextLine();

    }

    @Override
    public void print() {
        System.out.println("Message is is:"+getMessage());
        System.out.println("Email is:" +getRecipient());
    }
}
