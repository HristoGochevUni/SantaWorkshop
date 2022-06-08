package com.santaWorkshop.commands;

import com.santaWorkshop.toys.Toy;
import com.santaWorkshop.toysPile.ToysPile;
import com.santaWorkshop.workshop.Workshop;

import java.util.List;

public class NeedDoll implements NeedToy {
    @Override
    public void execute() {
        // Getting a doll from the workshop
        Toy toy = Workshop.getInstance().getDoll();

        // Adding the doll to the presents pile
        List<Toy> toysPile = ToysPile.getInstance().getToysPile();

        toysPile.add(toy);

        System.out.println("Added a doll to the pile");
    }
}
