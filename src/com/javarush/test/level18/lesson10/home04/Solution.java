package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //FileOutputStream out = new FileOutputStream(reader.readLine());
        //FileInputStream in = new FileInputStream(reader.readLine());
        /*while (in.available()>0){
            byte[] arr = new byte[in.available()];
            int count = in.read(arr);
            out.write(arr,0,count);
        }

        reader.close();
        out.close();
        in.close();*/
        RandomAccessFile data = new RandomAccessFile(reader.readLine(), " rw");
        RandomAccessFile data1 = new RandomAccessFile(reader.readLine(), " rw");
        data.seek(0);
        String s = data.readLine();
        System.out.println(s);


    }
}
