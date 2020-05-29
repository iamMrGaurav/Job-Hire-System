package week17;

import java.util.Scanner;

class SMS implements Messaging {
    Scanner scan = new Scanner(System.in);

    @Override
    public String getRecipient() {
        System.out.println("Enter your phone number");
        String recipient = scan.nextLine();
        String a = null;

        if (recipient.length() == 10) {
            a = recipient;
        } else {
            System.out.println("Invalid NUMBER");
        }
        return a;
    }

    @Override
    public String getMessage() {
        System.out.println("Enter your message");
        return scan.nextLine();
    }

    @Override
    public void print() {
        System.out.println("Message is:" + getMessage());
        System.out.println("Phone number is:" + getRecipient());
    }
}
