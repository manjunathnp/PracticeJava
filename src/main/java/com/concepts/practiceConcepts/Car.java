package com.concepts.practiceConcepts;

public interface Car {
    void start();
    void accelerate();
    void stop();
}

class Benz implements Car{

    @Override
    public void start() {
        System.out.println("Start Car");
    }

    @Override
    public void accelerate() {
        System.out.println("Accelerate.....");
    }

    @Override
    public void stop() {
        System.out.println("Stop Car");
    }
}

class MyCar{
    static Benz getCar(){
        return new Benz();
    }
}

class TestingRunner{
    public static void main(String[] args) {
        Car car=MyCar.getCar();

        car.start();
        car.accelerate();
        car.stop();

    }
}
