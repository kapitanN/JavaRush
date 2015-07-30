package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream input = new FileInputStream(name);
        ArrayList<Integer> data = new ArrayList<Integer>();
        ArrayList<Integer> oftenData = new ArrayList<Integer>();
        String res = "";
        HashMap<Integer, Integer> data1 = new HashMap<Integer, Integer>();

        while(input.available()>0){
            data.add(input.read());
        }

        Solution.sort(data1);
        reader.close();
        input.close();


    }
    public static void oftenBytes(ArrayList<Integer> data, HashMap<Integer, Integer> data1){

        int value = 0;
        for (int i = 0; i < data.size(); i++)
        {
            if (data1.containsKey(data.get(i))){
                data1.put(data.get(i),value++);
            }
            else {
                data1.put(data.get(i), value );
            }
        }
    }

    public static void sort(HashMap<Integer, Integer> data){
        ArrayList sortedList = new ArrayList(data.entrySet());
        Collections.sort(sortedList, new Comparator<Map.Entry<Integer, Integer>>()
        {
            @Override
            public int compare(Map.Entry<Integer, Integer> e1, Map.Entry<Integer, Integer> e2)
            {
                return e1.getValue().compareTo(e2.getValue());
            }
        });

            System.out.println(sortedList.get(sortedList.size()-1));
    }
    }
}
