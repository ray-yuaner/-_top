package com.hspedu.inputStream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {

    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath="C:\\Users\\ZixiangYuan\\Pictures\\temp\\new2.txt";
        int readData=0;
        int readLen=0;
        byte[] buf=new byte[8];  //ascii
        FileInputStream fileInputStream=null;
        try {
            fileInputStream=new FileInputStream(filePath);
//            while(( readData=fileInputStream.read())!=-1){
//                System.out.println((char)readData);//
//            }
            // read(buf) return readBytes(b, 0, b.length);  index
            while(( readLen = fileInputStream.read(buf))!=-1){
                System.out.println(new String(buf, 0, readLen));//
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("close fail");
            }
        }
    }
}
