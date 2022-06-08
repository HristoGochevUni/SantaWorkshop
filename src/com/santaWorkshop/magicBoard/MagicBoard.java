package com.santaWorkshop.magicBoard;

import com.santaWorkshop.commands.NeedToy;
import com.santaWorkshop.dwarves.Observer;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MagicBoard implements Observable {
    private MagicBoard() {

    }

    private static MagicBoard instance;

    public static MagicBoard getInstance() {
        if (instance == null) instance = new MagicBoard();
        return instance;
    }

    private final List<Observer> observers = new LinkedList<>();

    private final Queue<NeedToy> needToyQueue = new LinkedList<>();


    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
        observer.setMagicBoard(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.observers.remove(observer);
        observer.setMagicBoard(null);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

    @Override
    public Queue<NeedToy> getUpdate() {
        return this.needToyQueue;
    }

    public void insertNewCommand(NeedToy needToyCommand) {
        // Add a new toy takeaway command and notify all elves subscribed that there are new takeaway commands
        needToyQueue.add(needToyCommand);
        notifyObservers();
    }
}
