package com.hspone.file;

import org.junit.jupiter.api.Test;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.ObjectInputStream;

public class Directory_s {
    public static void main(String[] args) {

        //是否存在，存在就删除

    }
    @Test
    public void m1() {
        String filePath="C:\\Users\\ZixiangYuan\\Pictures\\temp";
        File file=new File(filePath);
        if (file.exists()) {
            if (file.delete()) {    // 运行结果返回boolen
                System.out.println("deleted");
            } else {
                System.out.println("delete failed!");
            }
        } else {
            System.out.println("not exists");
        }

    }

    @Test
    public void m2() {   // dict must be null!
        String filePath="C:\\Users\\ZixiangYuan\\Pictures\\temp";
        File file=new File(filePath);
        if (file.exists()) {
            if (file.delete()) {    // 运行结果返回boolen
                System.out.println("deleted");
            } else {
                System.out.println("delete failed!");
            }
        } else {
            System.out.println("not exists");
        }

    }
    @Test
    public void m3() {
        String filePath="C:\\Users\\ZixiangYuan\\Pictures\\temp\\g\\h\\i";
        File file=new File(filePath);
        if (file.exists()) {
            System.out.println("exists");
        } else {
            // 多级目录
            if (file.mkdirs()) {
                System.out.println("created");
            } else {
                System.out.println("create failed");
            }
            //System.out.println("not exists");
        }

    }
    public boolean delete() {
        return true;
    }

}
