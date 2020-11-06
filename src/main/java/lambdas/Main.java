package main.java.lambdas;

public class Main {
    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        /*class Fire implements IElectricityConsumer{

            @Override
            public void electricityOn() {
                System.out.println("FIRE !!!!");
            }
        }*/


        switcher.addElectricityConsumer(lamp);
        switcher.addElectricityConsumer(radio);
        switcher.addElectricityConsumer(() -> System.out.println("FIRE !!!"));
        switcher.switchOn();
    }
}
