package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Nikita on 03.05.2015.
 */
public class Mouse implements CompItem
{
    public String getName(){
        return this.getClass().getSimpleName();
    }
}
