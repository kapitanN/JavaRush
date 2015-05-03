package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String FileName = reader.readLine();
        //FileInputStream file = new FileInputStream(FileName);
        BufferedReader file = new BufferedReader(new FileReader(FileName));
        ArrayList<Integer> array = new ArrayList<Integer>();
        while (file.ready()){
            int data = Integer.parseInt(file.readLine());
            if (data%2==0){
                    array.add(data);

            }

        }

        file.close();
        reader.close();

        Collections.sort(array);
        for (int i: array){
            System.out.println(i);
        }

    }
}
