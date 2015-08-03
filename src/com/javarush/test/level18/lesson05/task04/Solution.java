package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameOne = reader.readLine();
        String fileNameTwo = reader.readLine();
        FileInputStream inputOne = new FileInputStream(fileNameOne);
        FileOutputStream outputTwo = new FileOutputStream(fileNameTwo);
        byte[] buffer = new byte[inputOne.available()];
        int count = 0;
        while (inputOne.available()>0){
            count = inputOne.read(buffer);
        }

        for (int i = buffer.length-1; i >=0; i--)
        {
            outputTwo.write(buffer[i]);

        }
    }
}
