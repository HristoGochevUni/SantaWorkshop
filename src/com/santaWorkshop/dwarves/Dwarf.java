package com.santaWorkshop.dwarves;

import com.santaWorkshop.commands.NeedToy;
import com.santaWorkshop.magicBoard.Observable;

import java.util.Queue;

public class Dwarf implements Observer {

    private final String name;
    private Observable magicBoard;

    public Dwarf(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (this.magicBoard == null) {
            System.out.println("Not observing a magic board");
            return;
        }
        Queue<NeedToy> needToysQueue = this.magicBoard.getUpdate();
        if (needToysQueue.size() == 0) return;
        NeedToy needToyCommand = needToysQueue.poll();
        System.out.println(this.name + " getting toy from workshop");
        needToyCommand.execute();
    }

    @Override
    public void setMagicBoard(Observable magicBoard) {
        this.magicBoard = magicBoard;
    }
}
