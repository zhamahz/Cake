package com.company;

public class NutCakeDecorator extends CakeDecorator {


    public NutCakeDecorator(Cake decoratedCake) {
        super(decoratedCake);

    }
    @Override
    public void add(){
        decoratedCake.add();
        putNut(decoratedCake);
    }

    private void putNut(Cake decoratedCake)
    {
        System.out.println("Cake with peanut");
    }
}
