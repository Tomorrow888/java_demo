package com.qlu.UDP;


import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author jiajinshuo
 * @create 2020-01-15 14:58
 */
public class UDPServer {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(9090);
        byte[] buffer = new byte[110];
        DatagramPacket packet = new DatagramPacket(buffer,0,buffer.length);

        socket.receive(packet);
        System.out.println(new String(packet.getData(),0,packet.getLength()));
        socket.close();
    }
}
