public class Main{
    public static void main(String[] args){
//        Car car = new Car();
//        Media media = car;
//        Engine engine = car;
//
//        car.stop(); // same method reference;
//        media.stop(); // same method reference;
//        engine.stop(); // same method reference;

        FinalCar myCar = new FinalCar(new PowerEngine());
        myCar.start();
        myCar.stop();

        myCar.updateEngine(new PetrolEngine());
        myCar.start();
        myCar.stop();
        myCar.playMusic();
    }
}