package main.java.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Switcher {

    private List<IElectricityConsumer> consumers = new ArrayList<>();

    public void addElectricityConsumer(IElectricityConsumer consumer) {
        consumers.add(consumer);
    }

    public void removeElectricityConsumer(IElectricityConsumer consumer) {
        consumers.remove(consumer);
    }

    public void switchOn() {
        System.out.println("Switcher is ON");
        for (IElectricityConsumer consumer: consumers) {
            consumer.electricityOn();
        }
    }
}
