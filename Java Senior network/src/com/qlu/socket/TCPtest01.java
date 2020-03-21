package com.qlu.socket;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author jiajinshuo
 * @create 2020-01-15 13:12
 * 服务端
 */
public class TCPtest01 {
    public static void main(String[] args) throws IOException {
        //1，创建服务器端的ServerSocket，指明自己的端口号
        ServerSocket ss = new ServerSocket(8899);
        //2，调用accept(),接收客户端的socket
        Socket socket = ss.accept();
        //3，获取输入流
        InputStream is = socket.getInputStream();
        //4,读取输入流的数据。写到类里面去，里面有动态数组
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len;
        byte[] cbuf = new byte[2];
        while((len = is.read(cbuf)) != -1){
            bos.write(cbuf,0,len);
        }

        System.out.println(bos.toString());
        //5，资源的关闭
        bos.close();
        is.close();
        socket.close();
        ss.close();
    }
}
