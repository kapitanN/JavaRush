package com.javarush.test.level05.lesson09.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст – неизвестные. Кот - бездомный)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес не известен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    String name;
    double weight;
    double age;
    String color;
    String address;

    public Cat(String name){
        this.name = name;
        this.weight = 5;
    }

    public Cat(String name, double weight, double age){
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public Cat(String name, double age){
        this.age = age;
        this.name = name;
        this.weight = 5;
    }

    public Cat(double weight, String color){
        this.weight = weight;
        this.color = color;
    }

    public Cat(double weight, String color, String address){
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

}
