package main.java.lambdas;

public class Lamp implements IElectricityConsumer{
    public void lightOn() {
        System.out.println("Lamp is ON");
    }

    @Override
    public void electricityOn() {
        lightOn();
    }
}
