package hu.petrik.autoprojekt;

import java.util.Random;

public class Tesla implements Auto {
    private double sebesseg;

    public Tesla() {
        double random = new Random().nextDouble();
        this.sebesseg = (random * 60);
    }

    @Override
    public void gyorsul() {
        double random = new Random().nextDouble();
        double speed = 5 + (random * 10);
        this.sebesseg = this.sebesseg + speed;
    }

    @Override
    public double getSebesseg() {
        return this.sebesseg;
    }
}
