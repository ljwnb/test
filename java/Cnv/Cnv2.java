/*************************************************************************
	> File Name: Cnv.java
	> Author: linjingwen
	> Mail: 723499747@qq.com
	> Created Time: 2020年10月02日 星期五 10时32分15秒
 ************************************************************************/

class Father {
    public String name;

    public void printInfo() {
        System.out.println("This is Father!");
    }
    public void drink() {
        System.out.println("I am drink...");
    }
}

class Son extends Father {
    public void printInfo() {
        System.out.println("This is Son!");
    }
    public void playGame() {
        System.out.println("I am playGame...");
    }
}

class Daughter extends Father {
    public void printInfo() {
        System.out.println("This is Daughter!");
    }

    public void dance() {
        System.out.println("I am dance...");
    }

}

public class Cnv2 {
    public static void main(String []args) {
        Father f = new Son();
        Son s = (Son)f;
        Son ss = new Son();
        f.printInfo();
        s.printInfo();
        ss.printInfo();
    }
}

