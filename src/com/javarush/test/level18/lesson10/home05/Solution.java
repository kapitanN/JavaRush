package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать во второй файл
Закрыть потоки
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream in = new FileInputStream(reader.readLine());
        FileOutputStream out = new FileOutputStream(reader.readLine());

        while (in.available()>0){
            byte [] data = new  byte[in.available()];
            in.read(data);
            out.write(getData(data));

        }

        in.close();
        out.close();
    }

    private static byte [] getData(byte[] data){
        StringBuilder builder = new StringBuilder();
        byte [] res;
        String [] str = new String(data).split(" ");
        double [] tmp = new double[str.length];
        for (int i = 0; i < str.length; i++)
        {
            tmp[i] =  Math.round(Double.valueOf(str[i]));
        }

        for (double i : tmp){
            builder.append(i);
            builder.append(" ");
        }

        res = builder.toString().getBytes();
        return res;
    }
}
