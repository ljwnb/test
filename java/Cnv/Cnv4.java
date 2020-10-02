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

public class Cnv4 {
    public static void main(String []args) {
        Father f = new Father();
        Daughter d = new Daughter();
        Son s = new Son();

        print(f);
        print(s);
        print(d);
        doAction(f);
        doAction(s);
        doAction(d);
    }

    public static void print(Father f) {
        f.printInfo();
    }

    public static void doAction(Father f) {
        if (f instanceof Son) {
            Son s = (Son)f;
            s.playGame();
        } else if (f instanceof Daughter) {
            Daughter d = (Daughter)f;
            d.dance();
        } else if (f instanceof Father) {
            f.drink();
        }
    }

}

