package com.javarush.test.level19.lesson03.task02;

/* Адаптер
Используйте класс AdapterFileOutputStream, чтобы адаптировать FileOutputStream к новому интерфейсу AmigoStringWriter
*/

import java.io.FileOutputStream;
import java.io.IOException;

public class AdapterFileOutputStream {
    private FileOutputStream fileOutputStream;
    public AdapterFileOutputStream(FileOutputStream fileOutputStream){
        this.fileOutputStream = fileOutputStream;
    }

    public void flush() throws IOException
    {
        this.fileOutputStream.flush();
    }

    void writeString(String s) throws IOException{
        this.fileOutputStream.write(s.getBytes());
    }
    void close()throws IOException{
        this.fileOutputStream.close();
    }
}


