package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Nikita on 08.05.2015.
 */
public class Singleton
{
    private static Singleton instance;
    private Singleton(){}
    public static synchronized Singleton getInstance(){
        if(instance == null)
            instance = new Singleton();
        System.out.println("Объект создан");
        return instance;

    }
}
