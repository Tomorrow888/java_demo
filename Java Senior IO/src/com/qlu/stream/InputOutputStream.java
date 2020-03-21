package com.qlu.stream;

import java.io.*;

/**
 * @author jiajinshuo
 * @create 2020-01-13 19:34
 * 字节文件输入输出流，对图片的复制
 */
public class InputOutputStream {
    public static void main(String[] args) {
       // copyFile(null,null);
        copyFile3("Java Senior IO/snow.txt","snow1.txt");



    }
    public static void copyFile(String s,String d){

        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            File src = new File(s);
            File dest = new File(d);

            fis = new FileInputStream(src);
            fos = new FileOutputStream(dest);

            byte[] buffer = new byte[5];
            int len;
            while ((len = fis.read(buffer)) != -1){
                fos.write(buffer,0,len);
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
            try {
                if(fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //使用字节缓冲流复制文件
    public static void copyFile2(String s,String d){

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            File src = new File(s);
            File dest = new File(d);
            //创建文件流
            FileInputStream fis = new FileInputStream(src);
            FileOutputStream fos = new FileOutputStream(dest);
            //创建缓冲流
            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            byte[] buffer = new byte[1024];
            int len;

            while((len = bis.read(buffer)) != -1){
                bos.write(buffer,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(bis != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bos != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
    //使用字符缓冲流复制文件
    public static void copyFile3(String s,String d){

        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader(new File(s)));
            bw = new BufferedWriter(new FileWriter(new File(d)));

            //方式一：使用char[]
            //方式二：使用String读取一行
            String data = br.readLine();
            while(data != null){
                bw.write(data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if(br != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(bw != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
