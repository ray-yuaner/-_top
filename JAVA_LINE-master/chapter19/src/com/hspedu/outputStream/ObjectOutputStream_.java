package com.hspedu.outputStream;

import org.junit.jupiter.api.Test;

import java.io.*;

public class ObjectOutputStream_ {

    public static void main(String[] args) throws Exception{

        String filePath="C:\\Users\\ZixiangYuan\\Pictures\\temp\\data.dat";
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filePath));
        oos.writeInt(100);//int -> Integer本身可序列化
        oos.writeBoolean(true);
        oos.writeChar('a');
        oos.writeUTF("撒打发色");

        oos.writeObject(new Dog("adf", 19));
        oos.close();
        System.out.println("Serializable");
    }

    static class Dog  implements Serializable{
        private String name;
        private int age;
        public Dog(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }
}
