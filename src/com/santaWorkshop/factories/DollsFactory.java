package com.santaWorkshop.factories;

import com.santaWorkshop.toys.Doll;
import com.santaWorkshop.toys.Toy;

public class DollsFactory extends ToysFactory {
    private DollsFactory() {

    }

    private static DollsFactory instance;

    public static DollsFactory getInstance() {
        if (instance == null) instance = new DollsFactory();
        return instance;
    }

    @Override
    protected Toy createToy() {
        System.out.println("Creating a doll");
        return new Doll();
    }
}
