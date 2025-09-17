public class PetrolEngine implements Engine{

    @Override
    public void start(){
        System.out.println("Petrol Engine is starting.");
    }

    @Override
    public void stop(){
        System.out.println("Petrol Engine is stopping.");
    }

    @Override
    public void accelerate(){
        System.out.println("Petrol Engine is accelerating.");
    }
}