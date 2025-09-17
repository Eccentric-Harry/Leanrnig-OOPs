public class Car implements Engine, Brake, Media{

    @Override
    public void start(){
        System.out.println("Car has started.");
    }

    @Override
    public void stop(){
        System.out.println("Car has stopped.");
    }

    @Override
    public void accelerate(){
        System.out.println("Car is accelerating.");
    }

    @Override
    public void brake(){
        System.out.println("Car is braking.");
    }

    @Override
    public void play(){
        System.out.println("Playing media.");
    }

    @Override
    public void pause(){
        System.out.println("Media Paused!");
    }
}