/*************************************************************************
	> File Name: Inner.java
	> Author: linjingwen
	> Mail: 723499747@qq.com
	> Created Time: 2020年10月01日 星期四 18时29分56秒
 ************************************************************************/

interface A {
    void printInfo();

}

class B implements A {
    public void printInfo() {
        System.out.println("Hello,World");
    }

}

public class Inner2 {
    public static void main(String []args) {
        //B b = new B();
        //b.printInfo();
        new A() {
            public void  printInfo() {
                System.out.println("Hello,World");
            }
        }.printInfo();


    }

}

