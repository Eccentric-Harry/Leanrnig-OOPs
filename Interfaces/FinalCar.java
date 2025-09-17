public class FinalCar{
    private Engine engine;
    private MediaPlayer mediaPlayer;

    public FinalCar(){
        engine = new PowerEngine();
        mediaPlayer = new MediaPlayer();
    }

    public FinalCar(Engine engine){
        this.engine = engine;
        this.mediaPlayer = new MediaPlayer();
    }

    public void start(){
        engine.start();
    }

    public void stop(){
        engine.stop();
    }

    public void playMusic() {
        mediaPlayer.play();
    }

    public void pauseMusic(){
        mediaPlayer.pause();
    }

    public void stopMusic(){
        mediaPlayer.stop();
    }

    public void updateEngine(Engine newEngine){
        this.engine = newEngine;
    }
}