package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
        SpecialThread specialThreadthread = new SpecialThread();
        Thread thread = new Thread(specialThreadthread);
        SpecialThread specialThreadthread1 = new SpecialThread();
        Thread thread1 = new Thread(specialThreadthread1);
        SpecialThread specialThreadthread2 = new SpecialThread();
        Thread thread2 = new Thread(specialThreadthread2);
        SpecialThread specialThreadthread3 = new SpecialThread();
        Thread thread3 = new Thread(specialThreadthread3);
        SpecialThread specialThreadthread4 = new SpecialThread();
        Thread thread4 = new Thread(specialThreadthread4);
        list.add(thread);
        list.add(thread1);
        list.add(thread2);
        list.add(thread3);
        list.add(thread4);
    }

    public static class SpecialThread implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
