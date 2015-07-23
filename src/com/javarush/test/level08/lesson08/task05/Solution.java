package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("Фамилия", "Имя");
        map.put("Фамилия1", "Имя");
        map.put("Фамилия2", "Имя2");
        map.put("Фамилия3", "Имя3");
        map.put("Фамилия4", "Имя4");
        map.put("Фамилия5", "Имя5");
        map.put("Фамилия6", "Имя6");
        map.put("Фамилия7", "Имя7");
        map.put("Фамилия8", "Имя8");
        map.put("Фамилия9", "Имя9");
        return map;
        //Напишите тут ваш код

    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map)
    {
        HashMap<String, String> map2 = new HashMap<String, String>(map);
        HashMap<String, String> map3 = new HashMap<String, String>(map);

        //цикл по map2
        for (Map.Entry<String, String> pair : map2.entrySet())
        {
            //удаляем из map3 пару, которая соответствует pair
            map3.remove(pair.getKey());
            //проверяем на наличе  в map3 значений соответсвующего значению из pair
            if (map3.containsValue(pair.getValue()))
            {   //Если есть такие же значения - вызываем удаления текующего значения pair из переданной map
                removeItemFromMapByValue(map, pair.getValue());
            }
        }

        System.out.println(map);
        //Напишите тут ваш код

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value)
    {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args){
        Solution.removeTheFirstNameDuplicates(Solution.createMap());
    }
}
