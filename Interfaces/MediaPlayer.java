public class MediaPlayer implements Media{
    @Override
    public void play(){
        System.out.println("Media Player is Playing");
    }

    @Override
    public void pause(){
        System.out.println("Media Player is Paused");
    }

    @Override
    public void stop(){
        System.out.println("Media Player is Stopped");
    }
}