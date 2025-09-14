
class Test{
    static String name;
    Test(String name){
        Test.name = name;
    }
}

public class StaticInitialize {

    public static void main(String[] args){
        Test obj1 = new Test("Harinadh");
        Test obj2 = new Test("Harry");
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    }
}

// the static variable is shared among all the objects of the class. So when we create obj2 and assign "Harry" to the static variable name, it overrides the previous value "Harinadh" assigned by obj1. Hence both obj1.name and obj2.name will print "Harry".
