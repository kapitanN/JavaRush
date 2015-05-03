package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        HashMap<String, Cat> cat = new HashMap<String, Cat>();
        Cat cat0 = new Cat("Vasy0");
        Cat cat1 = new Cat("Vasy1");
        Cat cat2 = new Cat("Vasy2");
        Cat cat3 = new Cat("Vasy3");
        Cat cat4 = new Cat("Vasy4");
        Cat cat5 = new Cat("Vasy5");
        Cat cat6 = new Cat("Vasy6");
        Cat cat7 = new Cat("Vasy7");
        Cat cat8 = new Cat("Vasy8");
        Cat cat9 = new Cat("Vasy9");
        cat.put("Vasy0",cat0);
        cat.put("Vasy1",cat1);
        cat.put("Vasy2",cat2);
        cat.put("Vasy3",cat3);
        cat.put("Vasy4",cat4);
        cat.put("Vasy5",cat5);
        cat.put("Vasy6",cat6);
        cat.put("Vasy7",cat7);
        cat.put("Vasy8",cat8);
        cat.put("Vasy9",cat9);
        return cat;

    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        HashSet<Cat> set = new HashSet<Cat>();
        for (Map.Entry<String, Cat> c :map.entrySet())
        {
            set.add(c.getValue());
        }
        return set;
        //Напишите тут ваш код
    }
    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {


        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }


}
