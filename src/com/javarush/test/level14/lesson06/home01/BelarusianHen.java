package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Nikita on 03.05.2015.
 */
public class BelarusianHen extends Hen
{
    public int getCountOfEggsPerMonth(){
        return 80;
    }

    public String getDescription(){
        return super.getDescription()+ "Моя страна - " + Country.BELARUS +". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    }
}
