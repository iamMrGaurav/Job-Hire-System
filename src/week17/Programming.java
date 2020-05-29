package week17;

public class Programming extends FirstYearCourse{
    public void printCode(){
        String code ="A901a";
        System.out.println("Code of the subject is:" +code);
    }
    public void printName(){
        String name="Python";
        System.out.println("Name :"+name);
    }

    public static void main(String[] args) {
        FirstYearCourse obj =new Programming();

        obj.printName();
        obj.printCode();
        obj.printTotalWeeks();
    }
}
