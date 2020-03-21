package com.qlu.UDP;

import java.io.IOException;
import java.net.*;

/**
 * @author jiajinshuo
 * @create 2020-01-15 14:48
 */
public class UDPTest {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket= new DatagramSocket();
        String str = "我是udp";
        byte[] data = str.getBytes();
        //参数为字节数组
        DatagramPacket dp = new DatagramPacket(data, 0, data.length, InetAddress.getByName("127.0.01"), 9090);

        socket.send(dp);
        socket.close();


    }
}
