package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by nikit on 30.09.2016.
 */
public class Hippodrome
{
    ArrayList<Horse> horses = new ArrayList<Horse>();
    public ArrayList<Horse> getHorses(){
        return horses;
    }
    public static Hippodrome game;
    public static void main(String[] args) throws InterruptedException
    {

        game = new Hippodrome();
        game.getHorses().add(new Horse("Jon",3,0));
        game.getHorses().add(new Horse("Klara",3,0));
        game.getHorses().add(new Horse("Din",3,0));
        game.run();
    }

    public void run() throws InterruptedException
    {
        for (int i = 0; i<100; i++){
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void print(){
        for (Horse horse: getHorses())
        {
            horse.print();
            System.out.println("");
            System.out.println("");
        }
    }
    public void move(){
        for (Horse horse : getHorses())
        {
            horse.move();
        }
    }
}
