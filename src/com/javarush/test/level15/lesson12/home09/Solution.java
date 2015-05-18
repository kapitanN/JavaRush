package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
javarush.ru/alpha/index.html?lvl=15&??view&&&name=Aobjmigo&obj=3.14&name=&obj=djsdcd&&?oobj=3.0
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String url = reader.readLine();
        String newUrl = url.substring(url.indexOf("?") + 1);
        String[] lines = newUrl.split("(\\&)|(\\?)");
        String [] atr;
        ArrayList<String> element = new ArrayList<String>();
        ArrayList<String> element2 = new ArrayList<String>();
        for (String line : lines){
            if (!line.equals("")){
                atr = line.split("=");
            element.add(atr[0]);
                if (atr[0].equals("obj")&&atr.length>1)
                {
                    element2.add(atr[1]);
                }
            }

        }
        for (int i = 0; i < element.size(); i++)
        {
            System.out.print(element.get(i) + " ");

        }
        System.out.println();
        for (int i = 0; i < element2.size(); i++)
        {

                try{

                    alert(Double.parseDouble(element2.get(i)));
                } catch(Exception e)
                {
                    alert(element2.get(i));
                }
        }

    }


    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
