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
        HashMap<Integer, Integer> data1 = new HashMap<Integer, Integer>();
        int count = 0;
        byte [] buffer = new byte[1000];
        while(input.available()>0){
            data.add(input.read());
        }


        Solution.oftenBytes(data,data1);


}
    public static void oftenBytes(ArrayList<Integer> data, HashMap<Integer, Integer> data1){

        int value = 0;
        for (int i = 0; i < data.size(); i++)
        {


            System.out.println(data1.containsKey(data.get(i)));
            if (data1.containsKey(data.get(i))){
                data1.put(data.get(i),value++);
            }
            else {
                data1.put(data.get(i), value );
            }
        }


        for (int i = 0; i < data.size(); i++)
        {
            System.out.println(data.get(i));
        }

        for (Integer dataValue : data1.values()){
            System.out.println(dataValue);
        }
    }

    public static void sort(HashMap<Integer, Integer> data){
        ArrayList sortedList = new ArrayList(data.entrySet());
        Collections.sort(sortedList, new Comparator(){

            @Override
            public int compare(Map.Entry e1, Map.Entry e2){
                return e1.getValue().compareTo(e2.getValue());
            }

        });
    }
}
