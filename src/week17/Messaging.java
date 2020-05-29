package week17;

public interface Messaging {
    public String getMessage();
    public void print();
    public String getRecipient();
    default void printMaxMessage(){
        System.out.println("Maximum message allowed per day is 32");
    }
}
