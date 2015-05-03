package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        int [] num = new int[5];
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i<5; i++)
        {
            num[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i< num.length-1; i++)
        {
            for (int j = 0; j<num.length-1; j++)
            {
                if(num[j]>num[j+1])
                {
                    int temp = num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
        for (int i = 0; i<num.length; i++)
        {
            System.out.println(num[i]);
        }
    }
}
