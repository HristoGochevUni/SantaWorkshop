package com.santaWorkshop.magicBoard;

import com.santaWorkshop.commands.NeedToy;
import com.santaWorkshop.dwarves.Observer;
import java.util.Queue;

public interface Observable {

    void subscribe(Observer observer);

    void unsubscribe(Observer observer);

    void notifyObservers();

    Queue<NeedToy> getUpdate();
}