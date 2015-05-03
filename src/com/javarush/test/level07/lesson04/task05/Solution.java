package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int array[] = new int [20];
        int mas1[] = new int[10];
        int mas2[] = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            String str = reader.readLine();
            array[i] = Integer.parseInt(str);
        }
        for (int i = 0; i < mas1.length; i++)
        {
            mas1[i] = array[i];
            mas2[i] = array[i+10];
        }
        for (int i = 0; i<mas2.length; i++)
        {
            System.out.println(mas2[i]);
        }
    }
}
