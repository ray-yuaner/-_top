package com.hspedu.reader_;

import org.junit.jupiter.api.Test;

import java.io.*;

import java.nio.charset.StandardCharsets;

public class FileReader_ {

    public static void main(String[] args) {
        String filePath="C:\\Users\\ZixiangYuan\\Pictures\\temp\\reader.txt";
        FileReader fileReader=null;
        char data='d';
        try {
            fileReader=new FileReader(filePath);
            //fOut.write("f");
            while ((data=(char)fileReader.read())!=-1){
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    /**

     */
    @Test
    public void readFile02(){
        String filePath="C:\\Users\\ZixiangYuan\\Pictures\\temp\\reader.txt";
        FileReader fileReader=null;
        char[] data=new char[8];
        int readLen=0;
        try {
            fileReader=new FileReader(filePath);
            //fOut.write("f");
            while ((readLen= fileReader.read(data))!=-1){
                System.out.println(new String(data,0,readLen));
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
