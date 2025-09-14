package packages;
public class Main{
    public static void main(String[] args){
        Main obj = new Main();
        System.out.println(obj.toString());
    }

    @Override
    public String toString(){
        return "This is Main Class, overriding toString() method of Object class";
    }
}