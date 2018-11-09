package com.company;

public abstract class CakeDecorator implements Cake{

    protected Cake decoratedCake;

    public CakeDecorator(Cake decoratedCake) {
        this.decoratedCake = decoratedCake;

    }

    public void add()
    {
        decoratedCake.add();
    }
}
