/*************************************************************************
	> File Name: Ext.java
	> Author: linjingwen
	> Mail: 723499747@qq.com
	> Created Time: 2020年10月02日 星期五 08时04分41秒
 ************************************************************************/

class Person {
    private int age;

    public static int person_cnt;

    static {
        System.out.println("this is static {}");
        person_cnt = 0;
    }

    {
        System.out.println("this is {}");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 200) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public Person() {
        System.out.println("this is Person()");
        person_cnt++;
        age = 1;
    }
    public Person(int age) {
        System.out.println("this is public Person(int age) ");
        this.age = age;
        person_cnt++;
    }

    public void printInfo() {
        System.out.println("age = " + age);
        System.out.println("person_cnt = " + person_cnt);
    }

}

class Student extends Person {
    private String school;

    public String getSchool() { return school; }
    public void setSchool(String school) {
        this.school = school;
    }

    public Student() {
        System.out.println("this is Student()");
        school = "null";
    }
    public Student(int age) {
        super(age);
        System.out.println("this is Student(int age)");
    }
    public Student(String school) {

        System.out.println("this is Student(String school)");
        this.school = school;
    }
    public Student(int age, String school) {
        super(age);
        System.out.println("this is Student(Student(int age, String school))");
        this.school = school;
    }
    
    public void printInfo() {
        System.out.println("school = " + school);
    }
}


public class Ext {
    public static void main(String []args) {
        Person pe = new Person(23);
        Student st = new Student(100);
        Student st2 = new Student("hngxy");
    


        System.out.println("Stu Age = " + st.getAge());
        System.out.println("person_cnt = " + st.person_cnt);

        System.out.println("Stu Age = " + st2.getAge());
        System.out.println("person_cnt = " + st2.person_cnt);

        pe.printInfo();

        st.printInfo();
        st2.printInfo();

    }


}





