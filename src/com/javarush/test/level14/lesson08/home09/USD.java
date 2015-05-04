package com.javarush.test.level14.lesson08.home09;

/**
 * Created by Nikita on 04.05.2015.
 */
public class USD extends Money
{

    public USD(double amount){
        super(amount);
    }
    public String getCurrencyName(){
        return "USD";
    }
}
