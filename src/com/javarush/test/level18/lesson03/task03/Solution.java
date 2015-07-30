package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream input = new FileInputStream(name);
        ArrayList<Integer> data = new ArrayList<Integer>();
        ArrayList<Integer> oftenData = new ArrayList<Integer>();
        String res = "";
       //HashMap<Integer, Integer> data1 = new HashMap<Integer, Integer>();

        while(input.available()>0){
            data.add(input.read());
        }

        int [] count = new int[data.size()];
        for (int i = 0; i < data.size(); i++)
        {
            count[i] = 0;
            for (int j = 0; j < data.size(); j++)
            {
                if(data.get(i) == data.get(j)) count[i]++;
            }

        }


        int max = Integer.MIN_VALUE;
        for (int it : count)
        {
            if (it>max) max = it;
        }

        for (int i = 0; i<data.size(); i++)
        {
            if (!oftenData.contains(data.get(i))&&count[i]==max) oftenData.add(data.get(i));
        }
        for (int y: oftenData)
        {
            res = y + " ";
        }
        System.out.println(res);

        reader.close();
        input.close();


}
    /*public static void oftenBytes(ArrayList<Integer> data, HashMap<Integer, Integer> data1){

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
    }*/
}
