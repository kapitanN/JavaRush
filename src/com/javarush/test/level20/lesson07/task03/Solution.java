package com.javarush.test.level20.lesson07.task03;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Externalizable Person
Класс Person должен сериализоваться с помощью интерфейса Externalizable.
Подумайте, какие поля не нужно сериализовать.
Исправьте ошибку сериализации.
Сигнатуры методов менять нельзя.
*/
public class Solution {
    public static void main(String [] args) throws IOException,ClassNotFoundException{
        Person person = new Person("Ragnar", "Lodbrok", 35);
        Person mom = new Person("God", "Odin", 10000);
        Person dad = new Person("Goddess", "Freya", 10000);
        Person child1 = new Person("Bjorn", "Lodbrok", 19);
        Person child2 = new Person("Ivar", "Lodbrok", 6);
        person.setMother(mom);
        person.setFather(dad);
        ArrayList<Person> children = new ArrayList<Person>();
        children.add(child1);
        children.add(child2);
        person.setChildren(children);

        System.out.println(person.firstName + " " + person.lastName + " " + person.age + " " + person.father.firstName + " " + person.mother.firstName + " " + person.children);

        File file = new File("d:/data.txt");
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
        out.writeObject(person);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
        Person person1 = (Person)in.readObject();
        in.close();

        System.out.println(person.firstName+" "+person.lastName+" "+person.age+" "+person.father.firstName+" "+person.mother.firstName+" "+person.children);
    }
    public static class Person implements Externalizable {
        private String firstName;
        private String lastName;
        private int age;
        private Person mother;
        private Person father;
        private List<Person> children;

        public Person(){}

        public Person(String firstName, String lastName, int age) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
        }

        public void setMother(Person mother) {
            this.mother = mother;
        }

        public void setFather(Person father) {
            this.father = father;
        }

        public void setChildren(List<Person> children) {
            this.children = children;
        }

        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeObject(this.mother);
            out.writeObject(this.father);
            out.writeObject(this.firstName);
            out.writeObject(this.lastName);
            out.writeInt(this.age);
            out.writeObject(this.children);
        }

        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            mother = (Person)in.readObject();
            father = (Person)in.readObject();
            firstName = (String)in.readObject();
            lastName = (String) in.readObject();
            age = in.readInt();
            children = (List<Person>)in.readObject();
        }
    }
}