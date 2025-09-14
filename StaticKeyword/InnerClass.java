//public class InnerClass{
//    static class Test{
//        static String name;
//        public Test(String name){
//            Test.name = name;
//        }
//    }
//
//    public static void main(String[] args){
//        Test obj1 = new Test("Harinadh");
//        Test obj2 = new Test("Harry");
//        System.out.println(obj1.name); //Harry
//        System.out.println(obj2.name); // Harry
//    }
//}
//

public class InnerClass{
    static class Test{
        String name;
        public Test(String name){
            this.name = name;
        }
    }

    public static void main(String[] args){
        Test obj1 = new Test("Harinadh");
        Test obj2 = new Test("Harry");
        System.out.println(obj1.name); //Harinadh
        System.out.println(obj2.name); // Harry
    }
}
