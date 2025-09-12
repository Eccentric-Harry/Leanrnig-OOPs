import java.util.Arrays;
class PersonInstance{
    String name;
    int age;
    String country;

    PersonInstance(){
        this("Default Name", 0, "India");
    }

    PersonInstance(String name, int age, String country){
        this.name = name;
         this.age = age;
         this.country = country;
    }
}

public class Person{
    public static void main(String[] args){
        PersonInstance person = new PersonInstance("Harinadh", 21, "India");
        System.out.println(person);
    }
}