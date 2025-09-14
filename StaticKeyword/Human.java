public class Human{
    String name;
    int age;
    String city;

    static int population;

    public Human(String name, int age, String city){
        this.name = name;
        this.age = age;
        this.city = city;
        Human.population = Human.population + 1;
    }
}