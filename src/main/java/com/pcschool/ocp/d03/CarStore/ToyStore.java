package com.pcschool.ocp.d03.CarStore;

public class ToyStore {
    public static void main(String[] args) {
        Engine engine = new Engine();
        Tire[] tires = {new Tire(), new Tire(), new Tire(), new Tire()};
        Wheel wheel = new Wheel();
        
        ToyCar toyCar = new ToyCar();
        toyCar.engine = engine;
        toyCar.tires = tires;
        toyCar.wheel = wheel;
        
    }
}
