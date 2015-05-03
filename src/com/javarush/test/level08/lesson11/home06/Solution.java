package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayList;

public class Solution
{
    public static void main(String[] args)
    {
        Human son1 = new Human("son1", true, 12, new ArrayList<Human>());
        Human son2 = new Human("son2", true, 14, new ArrayList<Human>());
        Human son3 = new Human("son3", true, 13, new ArrayList<Human>());
        ArrayList<Human> child = new ArrayList<Human>();
        child.add(son1);
        child.add(son2);
        child.add(son3);
        Human father = new Human("father", true, 30, child );
        Human mother = new Human("mother", false, 30, child );
        ArrayList<Human> parrents1 = new ArrayList<Human>();
        ArrayList<Human> parrents2 = new ArrayList<Human>();
        parrents1.add(father);
        parrents2.add(mother);
        Human grandpa = new Human("mother", false, 60, parrents1 );
        Human grandma = new Human("mother", false, 70, parrents1 );
        Human grandpa1 = new Human("mother", false, 75, parrents2 );
        Human grandma1 = new Human("mother", false, 70, parrents2 );
        System.out.println(grandpa.toString());
        System.out.println(grandma.toString());
        System.out.println(grandpa1.toString());
        System.out.println(grandma1.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son1.toString());
        System.out.println(son2.toString());
        System.out.println(son3.toString());
    }

    public static class Human
    {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;

        }
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }

            return text;
        }
    }

}
