public class Main{
    public static void main(String[] args){
        Human Harry = new Human("Harry", 21, "Hyderabad");
        Human Rohan = new Human("Rohan", 22, "Delhi");
        System.out.println(Harry.population); // this works, but not the right way to access static variable
        // we need to use the class name as reference to access the static variable.
        // so basically, static variable is shared among all the objects of the class.
        // when  we want to override a static variable, we can do it using the class name.
        System.out.println(Human.population); // this is the correct way to access static variable

        // we can still use the static objects, even without declaring the object of the class.


        // we know that someting that is not static, belongs to an object of the class.
    }
}