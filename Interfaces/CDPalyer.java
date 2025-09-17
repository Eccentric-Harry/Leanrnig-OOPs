public class CDPlayer implements Media{
    @Override
    public void play(){
        System.out.println("Playing CD...");
    }

    public void pause(){
        System.out.println("CD Paused!");
    }

    public void stop(){
        System.out.println("CD Stopped!");
    }
}