package com.qlu.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author jiajinshuo
 * @create 2020-01-13 19:17
 * 用字节文件输入流来读取文本
 * 中文可能乱码
 */
public class InputStreamTest {
    public static void main(String[] args) {

        FileInputStream fis = null;
        try {
            File file = new File("hello1.txt");
            fis = new FileInputStream(file);

            byte[] buffer = new byte[5];
            int len;

            while ((len = fis.read(buffer)) != -1){
                String s = new String(buffer, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
