package com.santaWorkshop.commands;

import com.santaWorkshop.magicBoard.MagicBoard;

public class DollWish implements ToyWish {
    @Override
    public void execute() {
        // Adding a command for a doll takeaway to the magic board
        MagicBoard.getInstance().insertNewCommand(new NeedDoll());
    }
}
