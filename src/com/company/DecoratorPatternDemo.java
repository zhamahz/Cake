package com.company;

import java.util.concurrent.Callable;

public class DecoratorPatternDemo {

    public static void main(String[] args)

    {
        Cake cherryCake = new CherryCake();
        Cake nutCherryCake = new NutCakeDecorator(new CherryCake());
        Cake nutChocoCake = new NutCakeDecorator(new ChocoCake());
        System.out.println("Normal cake");
        cherryCake.add();

        System.out.println("Cherry cake with nuts");
        nutCherryCake.add();

        System.out.println("Choco cake with nuts");
        nutChocoCake.add();
    }
}
