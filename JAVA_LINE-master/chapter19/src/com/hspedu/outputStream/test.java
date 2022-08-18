package com.hspedu.outputStream;
import java.io.*;

public class test {
    public static void main(String[] args) {
        try {
            File file=new File("C:\\Users\\ZixiangYuan\\Pictures\\temp\\test.txt");
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            byte[] bWrite = { 11, 21, 3, 40, 5 };
            OutputStream os = new FileOutputStream("C:\\Users\\ZixiangYuan\\Pictures\\temp\\test.txt");
            for (byte b : bWrite) {
                os.write(b); // writes the bytes
            }
            os.close();

            InputStream is = new FileInputStream("test.txt");
            int size = is.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) is.read() + "  ");
            }
            is.close();
        } catch (IOException e) {
            System.out.print("Exception");
        }
    }
}