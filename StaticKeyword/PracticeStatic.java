public class PracticeStatic{
    static String name = "Harry";

    public static void main(String[] args){
        Demo demo = new Demo();
        System.out.println(demo.nameDemo);
    }
}

class Demo{
    static String nameDemo = "Demo Name";

}