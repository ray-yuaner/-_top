package com.hspedu.outputStream;

import org.junit.jupiter.api.Test;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) {

    }
    /**
    创建输入流
     2.输出流
     */
    @Test
    public void writeFile(){
        String srcFilePath="C:\\Users\\ZixiangYuan\\Pictures\\temp\\reader.txt";
        String desFilePath="C:\\Users\\ZixiangYuan\\Pictures\\temp\\writer.txt";
        byte[] buf=new byte[8];
        FileOutputStream desFile=null;
        FileInputStream srcFile=null;
        int readLen=0;
        try {
            srcFile=new FileInputStream(srcFilePath);
            desFile=new FileOutputStream(desFilePath);
            while((readLen=srcFile.read(buf))!=-1){  //
                desFile.write(buf,0,readLen);  // 可能为空有挡位
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                srcFile.close();desFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
