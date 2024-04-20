package com.concepts.practiceConcepts;

public interface Bike {
    void start();
    void accelerate();
    void stop();
}

class HondaBike implements Bike{

    @Override
    public void start() {
        System.out.println("Bike Started...");
    }

    @Override
    public void accelerate() {
        System.out.println("Bike Accelerated.....");
    }

    @Override
    public void stop() {
        System.out.println("Bike Stopped!");
    }
}

class MyBike{
    static HondaBike getBike(){
        return new HondaBike();
    }
}

class TestRunnerClass{
    public static void main(String[] args) {
//      Bike bike=MyBike.getBike();

       Bike bike = new HondaBike();


      bike.start();
      bike.accelerate();
      bike.stop();
    }
}




