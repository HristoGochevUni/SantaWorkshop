package com.santaWorkshop.commands;

import com.santaWorkshop.magicBoard.MagicBoard;

public class BikeWish implements ToyWish {
    @Override
    public void execute() {
        // Adding a command for a bike takeaway to the magic board
        MagicBoard.getInstance().insertNewCommand(new NeedBike());
    }
}
