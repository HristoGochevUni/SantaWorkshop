package com.santaWorkshop.factories;

import com.santaWorkshop.toys.Toy;

public abstract class ToysFactory {
    protected abstract Toy createToy();

    public Toy produceToy() {
        Toy toy = createToy();
        toy.create();
        return toy;
    }
}
