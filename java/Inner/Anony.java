/*************************************************************************
	> File Name: Anony.java
	> Author: linjingwen
	> Mail: 723499747@qq.com
	> Created Time: 2020年10月01日 星期四 19时57分39秒
 ************************************************************************/

interface A {
    public void printInfo();

}

class B implements A {
    public void printInfo() {
        System.out.println("Hello,world B");
    }
}

public class Anony {
    public static void main(String []args) {
        testFunc(new B());
        testFunc(new A() {
            public void printInfo() {
                System.out.println("Hello,world A");
            }

        });
    }
    
    public static void testFunc(A a) {
        a.printInfo();

    }

}

