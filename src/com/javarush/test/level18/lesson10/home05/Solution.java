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
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        String str;
        String[] strMass;
        double tmp;

        while ((str = fileReader.readLine()) != null) {
            strMass = str.split(" ");
            for (String strMas : strMass)
            {
                tmp = Math.round(Double.parseDouble(strMas));
                numbers.add((int)tmp);
            }
        }
        fileReader.close();

        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(fileName2));
        String num = "";
        for (int a : numbers)
            num = num+a+" ";
        fileWriter.write(num);
        fileWriter.close();
        /*
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        File file1 = new File(reader.readLine());
        File file2 = new File(reader.readLine());

        FileInputStream in = new FileInputStream(file1);
        FileOutputStream out = new FileOutputStream(file2);

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
        long [] tmp = new long[str.length];
        for (int i = 0; i < str.length; i++)
        {
            tmp[i] =  Math.round(Double.valueOf(str[i]));
        }

        for (long i : tmp){
            builder.append(i);
            builder.append(" ");
        }

        res = builder.toString().getBytes();
        return res;*/
    }
}
