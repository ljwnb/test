/*************************************************************************
	> File Name: Cnv.java
	> Author: 
	> Mail: 
	> Created Time: Sat 07 Mar 2020 04:37:54 AM PST
 ************************************************************************/

interface Study {
    public void ioStudy();
}

interface Work {
    public void Work();
}

class Father {
    public void printInfo() {
        System.out.println("Father!");
    }
    public void Drink() {
        System.out.println("Drink...");
    }
}

class Son extends Father implements Study,Work{
    public void printInfo() {
        System.out.println("Son!");
    }
    public void playGame() {
        System.out.println("Game...");
    }
    public void ioStudy() {
        System.out.println("interface");    
    }
    public void Work() {

    }
}

class Sson extends Son {
    
}

class Dau extends Father{
    public void printInfo() {
        System.out.println("Dau!");
    }
    public void dance() {
        System.out.println("Dance...");
    }
}

public class Cnv{
    public static void main(String []args) {
        Father f = new Father();
        Son s = new Son();
        Dau d = new Dau();
        //Son s = ;
        print(f);
        print(s);
        print(d);
       
        Sson ss = new Sson();
        ss.ioStudy();
        //s.printInfo();
    }

    public static void print(Father f) {
        if (f instanceof Son) {
            Son s = (Son)f;//down
            s.playGame();
        } else if (f instanceof Dau) {
            Dau d = (Dau)f;
            d.dance();
        } else if(f instanceof Father) {
            f.Drink();
        }
    }
}
