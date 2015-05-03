package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s;// = read.readLine();
        int numb ;//= Integer.parseInt(s);
        int sum=0;
        //String summa = "сумма";
        while(true)
        {
            s = read.readLine();
            if(s.equals("сумма"))
            {
                break;
            }
            else
            {
                numb = Integer.parseInt(s);
                sum=sum+numb;

            }

        }
        System.out.println(sum);
    }
}
