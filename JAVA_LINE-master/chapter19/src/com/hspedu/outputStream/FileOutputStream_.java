package com.hspedu.outputStream;

import org.junit.jupiter.api.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileOutputStream_ {

    public static void main(String[] args) {

    }
    /*
    写数据
    文件不存在，则创建
     */
    @Test
    public void writeFile(){
        String filePath="C:\\Users\\ZixiangYuan\\Pictures\\temp\\writer.txt";
        File f=new File(filePath);
        int readData=0;
        int readLen=0;
        byte[] buf=new byte[8];
        OutputStream fOut=null;
        try {
            fOut=new FileOutputStream(f);
            //fOut.write("f");
            fOut.write(filePath.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fOut.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
