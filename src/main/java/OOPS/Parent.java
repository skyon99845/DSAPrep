package OOPS;

import java.sql.SQLOutput;

public class Parent {
    String name;
    int age;
    public Parent(String name,int age){
        System.out.println("Accessed the Parent Class Constructor");
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Parent Class");
        String name="Shubham Kumar";
        int age = 23;
        String nameChild="sonu";
        int ageChild = 22;
        Parent obj1 = new Parent(name,age);
        Child objChild = new Child(nameChild,ageChild);
        System.out.println("Accessing from the obj->name :"+ obj1.name);
        System.out.println("Accessing from the obj->age :"+ obj1.age);

        System.out.println("Accessing from the objChild->name :"+objChild.name);
        System.out.println("Accessing from the objChild->age :"+objChild.age);

    }
}


class Child extends Parent{
    public Child(String name,int age){
        super(name,age);
    }
}