package com.qlu.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author jiajinshuo
 * @create 2020-01-14 18:46
 * 客户端
 */
public class TCPTest1 {
    public static void main(String[] args) throws IOException {
        //1，创建socket对象，指明服务器的ip和端口号
        InetAddress inet = InetAddress.getByName("127.0.0.1");
        Socket socket = new Socket(inet, 8899);
        //2,获取输出流，用于输出数据
        OutputStream os = socket.getOutputStream();
        //3,写出数据
        os.write("你好，我是客户端".getBytes());
        //4，资源的关闭
        os.close();
        socket.close();
    }
}
