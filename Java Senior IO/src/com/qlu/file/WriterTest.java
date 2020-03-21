package com.qlu.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author jiajinshuo
 * @create 2020-01-13 17:19
 * 向磁盘中写出数据
 */
public class WriterTest {
    public static void main(String[] args) {

        FileWriter fw = null;
        try {
            File file = new File("Java Senior IO/snow.txt");
            fw = new FileWriter(file);

            fw.write("snow today");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
