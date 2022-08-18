package com.hspone.file;



import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

public class FileCreate {
    public static void main(String[] args) {

    }
    @Test
    public void  create01() throws IOException {
        String filePath="C:\\Users\\Zixiang\\Pictures\\temp\\1.txt";
        File file=new File(filePath);
        try {
            file.createNewFile();
            System.out.println("chuangjianchenggong");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //C:\Users\Zixiang\Pictures\temp

    @Test
    public void create02(){
        File basefile=new File("C:\\Users\\ZixiangYuan\\Pictures\\temp\\");
        String fileName="news2.txt";
        File file=new File(basefile,fileName); // R

        try {
            file.createNewFile();
            System.out.println("chuangjianchenggong");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //C:\Users\ZixiangYuan\Pictures\temp
    @Test
    public void create03(){
        String basefile="C:\\Users\\ZixiangYuan\\Pictures\\temp\\";
        String fileName="news3.txt";
        File file=new File(basefile,fileName);

        try {
            file.createNewFile();
            System.out.println("chuangjianchenggong");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    // getName、getAbsolutePath、getParent、length、exists、isFile、isDirectory
    @Test
    public void info(){
        File file=new File("C:\\Users\\ZixiangYuan\\Pictures\\temp\\news2.txt");
        System.out.println(file.getName());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.exists()); //是不是文件
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
    }
}

