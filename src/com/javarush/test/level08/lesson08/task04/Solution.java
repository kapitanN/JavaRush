package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Сталлоне1", new Date("JUNE 2 1980"));
        map.put("Сталлоне2", new Date("JUNE 3 1980"));
        map.put("Сталлоне3", new Date("JUNE 4 1980"));
        map.put("Сталлоне4", new Date("SEPTEMBER 5 1980"));
        map.put("Сталлоне5", new Date("OCTOBER 5 1980"));
        map.put("Сталлоне6", new Date("JUNE 1 1980"));
        map.put("Сталлоне7", new Date("JUNE 1 1980"));
        map.put("Сталлоне8", new Date("JUNE 1 1980"));
        map.put("Сталлоне9", new Date("JUNE 1 1980"));
        return map;
        //Напишите тут ваш код

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        HashMap<String, Date> map1 = new HashMap<String, Date>(map);
        for (Map.Entry<String, Date> pair : map1.entrySet()){
            if(pair.getValue().getMonth()>4 & pair.getValue().getMonth()<8){
                map.remove(pair.getKey());
            }
        }

        //Напишите тут ваш код

    }

    public static void  main(String[] args){
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        System.out.println(map);
    }
}
