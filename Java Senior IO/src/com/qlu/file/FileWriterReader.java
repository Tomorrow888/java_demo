package com.qlu.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jiajinshuo
 * @create 2020-01-13 16:23
 */
public class FileWriterReader {
    public static void main(String[] args) {

        File file = new File("Java Senior IO/hello.txt");
        //System.out.println(file.getAbsolutePath());
        FileReader fr = null;
        try {
            fr = new FileReader(file);
            int data;
            while ((data = fr.read())!=-1){
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fr != null)//以防对象没有实例化，出现空指针异常
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
