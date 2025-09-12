// write package name;
import java.time.Instant;
class Person{
    private String name;
    private int age;

    Person(String name, int age){
        setName(name);
        setAge(age);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        if(name == null || name.length() == 0){
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public int getAge(){
        Instant now = Instant.now();
        String timestamp = now.toString();
        int birthYear = Integer.parseInt(timestamp.substring(0,4));
        System.out.println(birthYear - age);
        return age;
    }

    public void setAge(int age){
        if(age < 0){
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }

    public boolean isAdult(){
        return age>=18;
    }

    @Override
    public String toString(){
        return "Person{ name: " + name + ", age: " + age + " }";
    }
}