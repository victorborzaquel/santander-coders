package com.letscode.santander.coders.poo2.material.aluno.solid.liskov.substitution;

public class MotorCar implements Car {
    private final Engine engine;

    public MotorCar() {
        this.engine = new Engine();
    }

    @Override
    public void start() {
        engine.on();
    }

    @Override
    public void accelerate() {
        engine.powerOn(100);
    }
}
class Engine {
    public void on() {
        System.out.println("On");
    }
    public void powerOn(int velocity) {
        System.out.println("Velocity: " + velocity);
    }
}