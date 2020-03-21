package com.qlu.file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author jiajinshuo
 * @create 2020-01-13 17:31
 * 读进来，接着写出去
 * 文件的复制
 */
public class ReaderWriter {
    public static void main(String[] args) {

        FileReader fr = null;
        FileWriter fw = null;
        try {
            File src = new File("Java Senior IO\\hello.txt");
            File dest = new File("hello1.txt");

            fr = new FileReader(src);
            fw = new FileWriter(dest);
            //数据的读入和写出操作
            char[] cbuf = new char[5];
            int len;//记录每次读到cbuf数组中字符的个数
            while((len = fr.read(cbuf)) != -1){
                fw.write(cbuf,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
