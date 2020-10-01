/*************************************************************************
	> File Name: InnerDemo.java
	> Author: linjingwen
	> Mail: 723499747@qq.com
	> Created Time: 2020年10月01日 星期四 19时03分37秒
 ************************************************************************/


class Outer {
    private int a = 9;

    class Inner {
        public void println() {
            System.out.println("a = " + a);
        }
    }
}



public class InnerDemo {

    public static void main(String []args) {
        Outer o = new Outer();
        Outer.Inner i =  o.new Inner();
        i.println();

    }


}
