package com.javarush.test.level06.lesson08.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{

    public static String readString() throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String s = read.readLine();
        return s;
    }

    public static int readInt() throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int numb = Integer.parseInt(read.readLine());
        return numb;
    }

    public static double readDouble() throws Exception
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        double d = Double.parseDouble(read.readLine());
        return d;
    }

    public static void readLn() throws Exception
    {
           if(readString().equals(""))
               return;

    }
}
