package com.santaWorkshop.workshop;

import com.santaWorkshop.factories.BikesFactory;
import com.santaWorkshop.factories.DollsFactory;
import com.santaWorkshop.toys.Doll;
import com.santaWorkshop.toys.Toy;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Workshop {
    private Workshop() {

    }

    private static Workshop instance;

    public static Workshop getInstance() {
        if (instance == null) instance = new Workshop();
        return instance;
    }

    private List<Toy> bikes = new ArrayList<>();
    private List<Toy> dolls = new ArrayList<>();

    // Takes a doll out of the workshop, producing 10 if there are none
    public Toy getDoll() {
        if (dolls.isEmpty()) {
            System.out.println("Attempted to get a doll from the workshop but there were no dolls");
            System.out.println("Producing 10 dolls...");
            DollsFactory dollsFactory = DollsFactory.getInstance();
            for (int i = 0; i < 10; i++) {
                dolls.add(dollsFactory.produceToy());
            }
        }
        return dolls.get(0);
    }

    // Takes a bike out of the workshop, producing 10 if there are none
    public Toy getBike() {
        if (bikes.isEmpty()) {
            System.out.println("Attempted to get a bike from the workshop but there were no bikes");
            System.out.println("Producing 10 bikes...");
            BikesFactory bikesFactory = BikesFactory.getInstance();
            for (int i = 0; i < 10; i++) {
                bikes.add(bikesFactory.produceToy());
            }
        }
        return bikes.get(0);
    }
}
