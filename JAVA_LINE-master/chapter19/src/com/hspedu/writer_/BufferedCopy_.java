package com.hspedu.writer_;

import org.junit.jupiter.api.Test;

import java.io.*;

public class BufferedCopy_ {

    public static void main(String[] args) {

    }
    /**
    创建输入流
     2.输出流
     */
    @Test
    public void writeFile(){
        String srcFilePath="C:\\Users\\ZixiangYuan\\Pictures\\temp\\reader.txt";
        String desFilePath="C:\\Users\\ZixiangYuan\\Pictures\\temp\\writer2.txt";
        String line;
        BufferedWriter desFile=null;
        BufferedReader srcFile=null;
        int readLen=0;
        try {
            srcFile=new BufferedReader(new FileReader(srcFilePath));
            desFile=new BufferedWriter(new FileWriter(desFilePath));
            while((line=srcFile.readLine())!=null){
                desFile.write(line);
                desFile.newLine();        //!!!!!!!!
            }
            System.out.println("copy");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                srcFile.close();
                desFile.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
