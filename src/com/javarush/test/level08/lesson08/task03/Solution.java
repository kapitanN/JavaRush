package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static void main(String[] args){
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map,"Антон"));
        System.out.println(getCountTheSameLastName(map, "Сергеев"));
    }
    public static HashMap<String, String> createMap()
    {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("Сергеев", "Антон");
        map.put("Иванов", "Петя");
        map.put("Стаханов", "Жора");
        map.put("Сталин", "Иосиф");
        map.put("Куриев", "Артур");
        map.put("Сколов", "Антон");
        map.put("Воробев", "Станичлав");
        map.put("Сергеева", "Антон");
        map.put("Глодин", "Паша");
        map.put("Кинг", "Стивен");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            String value = entry.getValue();
            if (name.equals(value)){
                   count++;
            }


        }
        return count;
        
        //Напишите тут ваш код

    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for (Map.Entry<String, String> entry : map.entrySet())
        {
            String key = entry.getKey();
            if (familiya.equals(key)){
                count++;
            }


        }
        return count;
        //Напишите тут ваш код

    }
}
