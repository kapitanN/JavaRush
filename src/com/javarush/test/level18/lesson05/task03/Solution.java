package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileNameOne = reader.readLine();
        String fileNameTwo = reader.readLine();
        String fileNameThree = reader.readLine();
        FileInputStream inputOne = new FileInputStream(fileNameOne);
        FileOutputStream outputTwo = new FileOutputStream(fileNameTwo);
        FileOutputStream outputThree = new FileOutputStream(fileNameThree);


        int count = 0;
        byte buffer[] =  new byte[inputOne.available()];
        while (inputOne.available()>0){
            count = inputOne.read(buffer);

        }

            if (count%2 == 0){
                outputTwo.write(buffer, 0, count / 2);
                outputThree.write(buffer, (count-(count/2)), count/2);
            }
            else {
                outputTwo.write(buffer, 0, count / 2 + 1);
                outputThree.write(buffer, count/2+1,count/2-1);
            }

       reader.close();
       inputOne.close();
       outputTwo.close();
       outputThree.close();

    }
}
