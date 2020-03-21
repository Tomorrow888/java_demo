package com.qlu.socket;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author jiajinshuo
 * @create 2020-01-15 14:10
 */
public class TCPServerSocket {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(9090);
        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();
        FileOutputStream fos = new FileOutputStream("115.jpg");

        int len;
        byte[] buffer = new byte[1024];
        while((len = is.read(buffer)) != -1){

            fos.write(buffer,0,len);
        }
        //服务器给予客户端反馈
        OutputStream os = socket.getOutputStream();
        os.write("图片已经收到".getBytes());

        fos.close();
        is.close();
        socket.close();
        ss.close();


    }
}
