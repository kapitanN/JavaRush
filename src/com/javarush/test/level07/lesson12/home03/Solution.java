package com.javarush.test.level07.lesson12.home03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Максимальное и минимальное числа в массиве
Создать массив на 20 чисел. Заполнить его числами с клавиатуры. Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         ArrayList<Integer> mas = new ArrayList<Integer>();
        int  maximum;
        int  minimum;

        for (int i = 0; i < 20; i++)
        {
            String s = reader.readLine();
            mas.add(Integer.parseInt(s));
        }
        maximum = mas.get(0);
        minimum = mas.get(0);
        for (int i = 0; i < mas.size(); i++)
        {
            if(mas.get(i)>maximum)
            {
                maximum = mas.get(i);
            }

        }
        for (int i = 0; i < mas.size(); i++)
        {
            if(mas.get(i)<minimum)
            {
                minimum = mas.get(i);
            }
        }

        System.out.println(" " + maximum + " " + minimum);
    }
}
