 package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream out = new FileOutputStream(new File(reader.readLine()),true);
        FileInputStream in = new FileInputStream(new File(reader.readLine()));
        FileInputStream in1 = new FileInputStream(new File(reader.readLine()));
         while (in.available()>0){
             byte[] arr = new byte[in.available()];
             int count = in.read(arr);
             out.write(arr, 0, count);
         }

        while (in1.available()>0){
            byte[] arr = new byte[in1.available()];
            int count = in1.read(arr);
            out.write(arr, 0, count);
        }

        reader.close();
        out.close();
        in.close();
        in1.close();
    }
}
