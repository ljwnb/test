/*************************************************************************
  > File Name: Abstract.java
  > Author: linjingwen
  > Mail: 723499747@qq.com
  > Created Time: 2020年10月02日 星期五 09时15分27秒
 ************************************************************************/

interface A {
    int i = 10;// i  is final
    int getNum();
    //public void setNum(int n);

}


interface B {
    String name  = "ljw";//name is final
    String getName();
    //public void setName(String name);
}


abstract class Father {
    public int money;

    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }

    public abstract void study();
}

class Son extends Father implements A, B{
    public void study() {
        System.out.println("I am study!");
    }
    public int getNum() {
        return i;
    }
    public String getName() {
        return name;
    }
    /*
       public void setNum(int n) {
       i = n;
       }
       public void setName(String n) {
       name = n;
       }
       */
}

public class Abstract {
    public static void main(String []args) {
        Son s = new Son();
        s.setMoney(100);
        System.out.println("money = " + s.getMoney());
        s.study();
        s.money = 200;
        System.out.println("money = " + s.getMoney());
        System.out.println("name = " + s.name);
        System.out.println("num = " + s.i);
    }

}

