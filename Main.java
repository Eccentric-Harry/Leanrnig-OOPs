import java.util.Arrays;

class Student{
    String name;
    int rollNo;
    String course;

    Student(){
        this("Unknown", -1, "None"); // this is how to call one constructor from another constructor
    }

    Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }
}

public class Main{
    public static void main(String[] args){
        Student[] students = new Student[3];
        Student student1 = new Student("Alice", 1, "Math"); // this new keyword dynamically allocates memory during runtime
        students[0] = student1;
        System.out.println(Arrays.toString(students));
    }
}