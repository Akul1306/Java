import java.lang.System;
class Student {
    String name;
    int rollno;
    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }
    void display()
    {
        System.out.println("Akul Srivastava , Roll Number: 22CSU247");
        System.out.println("Name is :" + name);
        System.out.println("Roll Number is : " +rollno);
    }
}
public class StudentInfo{
    public static void main(String args[])
    {
        Student a = new Student("John",2);
        a.display();
    }
}
