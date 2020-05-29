package polymorph;

class Parent{
    void laugh(){
        System.out.println("Parent is laughing");
    }
}

class Child extends Parent{
    String eating = "Child is eating";
    void laugh(){
        System.out.println("Child is laughing");
    }
    void eat(){
        System.out.println(eating);
    }
}
public class OverrideC {
    public static void main(String[] args) {
//        Parent obj = new Parent();
//        obj.laugh();
        Parent obj = new Child();
        obj.laugh();
    }
}
