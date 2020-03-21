package com.qlu.inputstreamreader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author jiajinshuo
 * @create 2020-01-14 15:42
 */
public class InputStreamReaderTest {
    public static void main(String[] args) throws IOException {

        FileInputStream fis = new FileInputStream("Java Senior IO/snow.txt");
        InputStreamReader isr = new InputStreamReader(fis);

        char[] cbuf = new char[5];
        int len;
        while((len = isr.read(cbuf)) != -1){
            String s = new String(cbuf, 0, len);
            System.out.println(s);
        }
        isr.close();
    }
}
