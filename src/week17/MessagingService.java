package week17;

public class MessagingService {
    public static void main(String[] args) {
        Messaging obj1= new SMS();
        obj1.print();
        obj1.printMaxMessage();

        Messaging obj2= new Email();
        obj2.print();
        obj2.printMaxMessage();
    }
}
