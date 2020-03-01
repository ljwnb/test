/*************************************************************************
	> File Name: Hello.java
	> Author: 
	> Mail: 
	> Created Time: Sun 01 Mar 2020 12:12:33 AM PST
 ************************************************************************/

public class Hello {
    public static void main(String args[]) {
        int i;
        int a[] = new int[10];

        for (i = 0; i < 3; i++) {
            System.out.println("Hello,World");
        }
        i = 0;
        while (i < 10) {
            a[i] = i;
            System.out.printf("%d", a[i]);
            i++;
        }

    }

}


