package com.santaWorkshop.commands;

import com.santaWorkshop.toys.Toy;
import com.santaWorkshop.toysPile.ToysPile;
import com.santaWorkshop.workshop.Workshop;

import java.util.List;

public class NeedBike implements NeedToy {
    @Override
    public void execute() {
        // Getting a bike from the workshop
        Toy toy = Workshop.getInstance().getBike();

        // Adding the bike to the presents pile
        List<Toy> toysPile = ToysPile.getInstance().getToysPile();

        toysPile.add(toy);

        System.out.println("Added a bike to the pile");
    }
}
