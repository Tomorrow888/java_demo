package com.qlu.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author jiajinshuo
 * @create 2020-01-13 17:03
 * 读取数据
 */
public class FileWriterReader01 {
    public static void main(String[] args) {

        FileReader fr = null;
        try {
            File file = new File("Java Senior IO/hello.txt");
            fr = new FileReader(file);

            char[] cbuf = new char[5];
            int len;
            while((len = fr.read(cbuf)) != -1){
                //不能用数组.length来读取，可能会发生覆盖
                String s = new String(cbuf, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
