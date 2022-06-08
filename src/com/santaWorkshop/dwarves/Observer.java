package com.santaWorkshop.dwarves;

import com.santaWorkshop.magicBoard.Observable;

public interface Observer {
    void update();
    void setMagicBoard(Observable magicBoard);
}