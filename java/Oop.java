/*************************************************************************
	> File Name: Oop.java
	> Author: 
	> Mail: 
	> Created Time: Wed 04 Mar 2020 05:54:58 AM PST
 ************************************************************************/

class Person {
    String name;
    int age;

    String getName() {
        return name;
    }
    public Person(String n) {
        name = n;
    }
    public Person(String n, int a) {
        name = n;
        age = a;
    }
    public Person() {
        name = "null";
        age = 0;
    }
};


public class Oop {
    public static void main(String args[]) {
        Person p1 = new Person("llihua");
        //p1.name = "lihua";
        
        Person p2 = new Person("zzzsan", 18);
        Person p3 = new Person();
        //p2.name = "zhangsan";

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());
    }


}

