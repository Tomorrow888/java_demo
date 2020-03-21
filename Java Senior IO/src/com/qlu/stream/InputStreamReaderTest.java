package com.qlu.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jiajinshuo
 * @create 2020-01-13 21:49
 * InputStreamReader字节输入流到字符输入流的转换
 * 字节--->字符。解码
 */
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("hello1.txt");
        InputStreamReader isr = new InputStreamReader(fis);

        char[] cbuf = new char[10];
        int len ;
        while((len = isr.read(cbuf)) != -1){
            String s = new String(cbuf, 0, len);
            System.out.print(s);
        }
    }
}
