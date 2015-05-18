package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by Nikita on 18.05.2015.
 */
public class Plane implements Flyable
{
    public void fly(){}
    int passengers;
    public Plane(int passengers){
        this.passengers = passengers;
    }
}
