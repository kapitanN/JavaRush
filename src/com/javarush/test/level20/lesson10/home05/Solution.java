package com.javarush.test.level20.lesson10.home05;

import java.io.*;
import java.util.logging.Logger;

/* Сериализуйте Person
Сериализуйте класс Person стандартным способом. При необходимости поставьте полям модификатор transient.
*/
public class Solution implements Serializable{

    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("D:\\1.txt"));
        Solution.Person person = new Solution.Person("Nikita","Shapovalov","Ukr",Sex.MALE);
        outputStream.writeObject(person);
        outputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("D:\\1.txt"));
        Solution.Person person1= (Person)inputStream.readObject();
        System.out.println(person.firstName+ " "+person.lastName+ " "+person.fullName+ " "+person.greetingString+ " "+person.country+ " " +person.sex+ " " +person.outputStream +" "+person.logger);
        System.out.println(person1.firstName+ " "+person1.lastName+ " "+person1.fullName+ " "+person1.greetingString+ " "+person1.country+ " " +person1.sex+ " " +person1.outputStream +" "+person1.logger);

    }

    public static class Person implements Serializable
    {
        String firstName;
        String lastName;
        transient String fullName;
        final transient String greetingString;
        String country;
        Sex sex;
        transient PrintStream outputStream;
        transient Logger logger;

        Person(){
            greetingString = "Hi";
        }
        Person(String firstName, String lastName, String country, Sex sex) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.fullName = String.format("%s, %s", lastName, firstName);
            this.greetingString = "Hello, ";
            this.country = country;
            this.sex = sex;
            this.outputStream = System.out;
            this.logger = Logger.getLogger(String.valueOf(Person.class));
        }

        private void writeObject(ObjectOutputStream outputStream) throws IOException
        {
            outputStream.writeObject(firstName);
            outputStream.writeObject(lastName);
            outputStream.writeObject(country);
            outputStream.writeObject(sex);
        }

        private void readObject(ObjectInputStream inputStream) throws IOException, ClassNotFoundException
        {
            firstName = (String)inputStream.readObject();
            lastName = (String)inputStream.readObject();
            country = (String)inputStream.readObject();
            sex = (Sex) inputStream.readObject();
        }

    }

    enum Sex {
        MALE,
        FEMALE
    }
}
