package com.santaWorkshop.toysPile;

import com.santaWorkshop.toys.Toy;

import javax.swing.*;
import java.util.LinkedList;
import java.util.List;

public class ToysPile {
    private ToysPile() {

    }

    private static ToysPile instance;

    public static ToysPile getInstance() {
        if (instance == null) instance = new ToysPile();
        return instance;
    }

    private final List<Toy> toysPile = new LinkedList<>();

    public List<Toy> getToysPile() {
        return toysPile;
    }

    public void listPile() {
        for (Toy toy : toysPile) {
            System.out.println(toy.getTag());
        }
    }
}
