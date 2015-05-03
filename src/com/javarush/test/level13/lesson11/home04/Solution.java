package com.javarush.test.level13.lesson11.home04;

/* Запись в файл
1. Прочесть с консоли имя файла.
2. Считывать строки с консоли, пока пользователь не введет строку "exit".
3. Вывести все строки в файл, каждую строчку с новой стороки.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        OutputStream output = new FileOutputStream(nameFile);
        while(true){
            String console = reader.readLine();
            if (console.equals("exit")){

                output.write(console.getBytes());
                break;
            }
            output.write((console +"\n ").getBytes());
        }

        output.close();
        reader.close();

    }
}
