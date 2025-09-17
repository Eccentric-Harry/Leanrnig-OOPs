public class Main{
    public static void main(String[] args){
        Son son = new Son(20);
        son.career();

        Daughter daughter = new Daughter(18);
        daughter.career();

//        Parent parent = new Parent(50);// not allowed because Parent is abstract class
        // if we would like to create an object of the Parent classes, then do it like this:
        Parent p = new Parent(50){
            void career(){
                System.out.println("I am a parent, I am Rich!");
            }
            void partner(){
                System.out.println("I am Married, she is amazing!");
            }
        };
        p.career();
    }
}