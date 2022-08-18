package com.hspedu.inputStream_;

import java.io.*;
import com.hspedu.outputStream.ObjectOutputStream_;

public class ObjectInputStream_ {

    public static void main(String[] args) throws Exception{

        String filePath="C:\\Users\\ZixiangYuan\\Pictures\\temp\\data.dat";
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filePath));
        ois.readInt();//int -> Integer本身可序列化
        ois.readBoolean();
        ois.readChar();
        ois.readUTF();

        Object o=ois.readObject();
        System.out.println(o.getClass());
        System.out.println(o.toString());
        //System.out.println(o.getName());
        ois.close();
    }
    InputStreamReader

}
