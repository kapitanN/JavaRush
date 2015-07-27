package com.javarush.test.level18.lesson03.task02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* Минимальный байт
Ввести с консоли имя файла
Найти минимальный байт в файле, вывести его на экран.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream input = new FileInputStream(name);
        int min=300;
        int temp = 0;
        while (input.available()>0){
            temp = input.read();
            if (temp<min)
            min = temp;
        }
        System.out.println(min);
        reader.close();
        input.close();
    }
}
