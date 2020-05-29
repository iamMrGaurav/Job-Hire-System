package week20o;

import org.w3c.dom.ls.LSOutput;

public class Student {
    private String name;
    private int age;

    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return  age;
    }
    public void setName(String name) {
        this.name = name;

    }
    public void setAge(int age) {
        this.age = age;
    }
    public void display(){
        System.out.println("Name :"+getName());
        System.out.println("Age :"+getAge());
    }


}
