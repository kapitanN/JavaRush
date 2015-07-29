package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

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


        Solution.often(data,data1);


}
    public static void often(ArrayList<Integer> data, HashMap<Integer, Integer> data1){

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

        for (Integer sortedValue : data1.values()){

        }

        for (int i = 0; i < data.size(); i++)
        {
            System.out.println(data.get(i));
        }

        for (Integer dataValue : data1.values()){
            System.out.println(dataValue);
        }
    }
}
