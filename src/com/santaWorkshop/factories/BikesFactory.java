package com.santaWorkshop.factories;

import com.santaWorkshop.toys.Bike;
import com.santaWorkshop.toys.Toy;

public class BikesFactory extends ToysFactory {
    private BikesFactory() {

    }

    private static BikesFactory instance;

    public static BikesFactory getInstance() {
        if (instance == null) instance = new BikesFactory();
        return instance;
    }

    @Override
    protected Toy createToy() {
        System.out.println("Creating a bike");
        return new Bike();
    }
}
