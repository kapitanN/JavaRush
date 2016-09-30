package com.javarush.test.level20.lesson10.home03;

import java.io.*;

/* Найти ошибки
Почему-то при сериализации/десериализации объекта класса B возникают ошибки.
Найдите проблему и исправьте ее.
Класс A не должен реализовывать интерфейсы Serializable и Externalizable.
Сигнатура класса В не содержит ошибку :)
Метод main не участвует в тестировании.
*/
public class Solution implements Serializable{

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        FileOutputStream fileOutputStream = new FileOutputStream("D:\\1.txt");
        ObjectOutputStream out =new ObjectOutputStream(fileOutputStream);
        Solution.B b = new Solution().new B("B");

        out.writeObject(b);
        out.flush();
        fileOutputStream.close();
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\1.txt"));
        Solution.B b1 = (Solution.B)in.readObject();
        System.out.println(b1.toString());
    }
    public static class A {
        protected String name = "A";

        public A(){}
        public A(String name) {
            this.name += name;
        }

    }

    public class B extends A implements Serializable {
        private static final long serialVersionUID = 1L;
        public B(String name) {
            super(name);
            this.name += name;
        }
        private void writeObject(ObjectOutputStream out) throws IOException {
            out.writeObject(name);
        }
        private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
            name = (String)in.readObject();
        }
    }
}
