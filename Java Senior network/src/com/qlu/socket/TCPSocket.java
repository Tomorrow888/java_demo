package com.qlu.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author jiajinshuo
 * @create 2020-01-15 14:02
 * 客户端发送文件
 */
public class TCPSocket {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket(InetAddress.getByName("127.0.01"), 9090);
        OutputStream os = socket.getOutputStream();

        //读文件，当然要用输入流
        FileInputStream fis = new FileInputStream("图片.jpg");

        byte[] bytes = new byte[20];
        int len;
        while((len = fis.read(bytes)) != -1){
            os.write(bytes,0,len);
        }
        //关闭数据的发送，要不然服务端会一直在循环状态
        socket.shutdownOutput();
        //收到服务端的反馈
        InputStream is = socket.getInputStream();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len1;
        byte[] buffer = new byte[1024];
        while((len1 = is.read(buffer)) != -1){
            bos.write(buffer,0,len1);
        }
        System.out.println(bos.toString());

        bos.close();
        os.close();
        fis.close();
        os.close();
        socket.close();


    }
}
