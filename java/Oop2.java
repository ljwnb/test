/*************************************************************************
	> File Name: Oop.java
	> Author: 
	> Mail: 
	> Created Time: Wed 04 Mar 2020 05:54:58 AM PST
 ************************************************************************/

class Person {
    String name;
    int age;
    static int n;
   
    static {//这是静态代码块，会自动执行一次
        System.out.println("static block");

    }

    {//这是构造代码块，每次创建对象的时候会自动执行，构造代码块先与构造函数
       System.out.println("block");
        n++;
    }


    String getName() {
        return name;
    }
    public Person(String n) {
        System.out.println("gz");
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
    static void print_P() {//静态方法，不用实例化对象也可以直接调用
        System.out.println("this is i don't know");

    }
};


public class Oop2 {
    public static void main(String []args) {
        Person p1 = new Person("llihua");
        //p1.name = "lihua";
        
        Person p2 = new Person("zzzsan", 18);
        Person p3 = new Person();
        //p2.name = "zhangsan";

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());
        System.out.println(Person.n);
        Person.print_P();

    }


}

