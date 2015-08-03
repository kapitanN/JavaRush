package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть все потоки ввода-вывода
2.2 выбросить исключение DownloadException
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true)
        {
            String fileNameOne = reader.readLine();
            FileInputStream inputOne = new FileInputStream(fileNameOne);
            if (inputOne.available()<1000){
                reader.close();
                inputOne.close();
                throw new DownloadException();
            }
            else{
            byte[] buffer = new byte[inputOne.available()];
            int count = 0;
            while (inputOne.available() > 0)
            {
                count = inputOne.read(buffer);
            }
            }
        }
    }

    public static class DownloadException extends Exception{

    }
}
