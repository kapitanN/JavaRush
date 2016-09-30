package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки
*/

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream inputStream = new FileInputStream(new File(args[0]));
        int englishWords = 0;
        int word;


        while (inputStream.available() > 0) {
            word = inputStream.read();
            if (isEnglishLetter(word)) {
                englishWords++;
            }

        }

        System.out.println(englishWords);
//        rd.close();
        inputStream.close();
    }


    // check on unicode symbols
    public static boolean isEnglishLetter(int x) {
        if (((x > 64) && (x < 91)) || ((x > 96) && (x < 123))) {
            return true;
        } else {
            return false;
        }
    }
}
