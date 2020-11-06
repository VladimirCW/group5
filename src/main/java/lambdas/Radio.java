package main.java.lambdas;

public class Radio implements IElectricityConsumer{

    public void playMusic() {
        System.out.println("Playing music ...");
    }

    @Override
    public void electricityOn() {
        playMusic();
    }
}
