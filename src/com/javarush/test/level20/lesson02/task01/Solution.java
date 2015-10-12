package com.javarush.test.level20.lesson02.task01;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Читаем и пишем в файл: Human
Реализуйте логику записи в файл и чтения из файла для класса Human
Поле name в классе Human не может быть пустым
В файле your_file_name.tmp может быть несколько объектов Human
Метод main реализован только для вас и не участвует в тестировании
*/
public class Solution {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or fix outputStream/inputStream according to your real file location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {

            File your_file_name = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(your_file_name);
            InputStream inputStream = new FileInputStream(your_file_name);

            Human ivanov = new Human("Ivanov", new Asset("home"), new Asset("car"));
            ivanov.save(outputStream);
            outputStream.flush();

            Human somePerson = new Human();
            somePerson.load(inputStream);
            System.out.println(ivanov.hashCode());
            System.out.println(somePerson.hashCode());
            for (Asset current : somePerson.assets){
            System.out.println(current.getName());
            }
            if (ivanov.equals(somePerson)){
                System.out.println("yes");
            }
            //check here that ivanov equals to somePerson - проверьте тут, что ivanov и somePerson равны
            inputStream.close();


        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something wrong with save/load method");
        }
    }


    public static class Human {
        @Override
        public boolean equals(Object o)
        {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Human human = (Human) o;

            if (name != null ? !name.equals(human.name) : human.name != null) return false;
            return !(assets != null ? !assets.equals(human.assets) : human.assets != null);

        }

        @Override
        public int hashCode()
        {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + (assets != null ? assets.hashCode() : 0);
            return result;
        }

        public String name;
        public List<Asset> assets = new ArrayList<Asset>();

        public Human() {
        }

        public Human(String name, Asset... assets) {
            this.name = name;
            if (assets != null) {
                this.assets.addAll(Arrays.asList(assets));
            }
        }

        public void save(OutputStream outputStream) throws Exception {
            PrintWriter printWriter = new PrintWriter(outputStream);
            String isNamePresent = this.name != null ? "yes" : "no";
            //int assetSize;
            printWriter.println(assets.size());
            if ("yes".equals(isNamePresent)) {
                printWriter.println(this.name);
                if (assets.size()>0){
                    for (Asset asset : assets)
                    {
                    printWriter.println(asset.getName());
                    //printWriter.println(asset.getPrice());
                    }
                }
            }
            printWriter.flush();
            printWriter.close();
            //implement this method - реализуйте этот метод
        }

        public void load(InputStream inputStream) throws Exception {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            int assetSize = Integer.parseInt(reader.readLine());
            name = reader.readLine();
            System.out.println(name);
            System.out.println(assetSize);
            if (name != null){
                    for (int i = 0; i<assetSize; i++)
                    {
                        String assetsName = reader.readLine();
                        System.out.println(assetsName);
                        //String assetsPrice = reader.readLine();
                        //System.out.println(assetsPrice);
                        assets.add(new Asset(assetsName));
                        //assets.get(assets.size()-1).setPrice(Double.parseDouble(assetsPrice));
                    }
            }

            inputStream.close();

            //implement this method - реализуйте этот метод
        }
    }
}
