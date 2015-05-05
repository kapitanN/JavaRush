package com.javarush.test.level14.lesson08.bonus01;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution
{
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args)
    {
        initExceptions();

        for (Exception exception : exceptions)
        {
            System.out.println(exception);
        }
    }

    private static void initExceptions()
    {   //it's first exception
        try
        {
            float i = 1 / 0;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int arr [] = new int[3];
            for (int i = 0; i < arr.length + 1; i++)
            {
                arr[i] = 1;
            }
        } catch (IndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }

        try
        {
            throw null;
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            int arr [] = new int[-1] ;

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object obj = new Integer(0);
            System.out.println((String)obj);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            throw new IllegalStateException("exc");
        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            Object str [] = new String[5];
            str[0] = new Character('a');

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String str = "111";
            char ch = str.charAt(5);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            ArrayList list = new ArrayList();
            list.get(-1);

        } catch (Exception e)
        {
            exceptions.add(e);
        }
        try
        {
            String str = "end";
            int a = Integer.parseInt(str);
        } catch (Exception e)
        {
            exceptions.add(e);
        }

        //Add your code here

    }
}
