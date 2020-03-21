package com.qlu.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author jiajinshuo
 * @create 2020-01-14 17:38
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException {

        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);
        //获取本机ip
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

    }
}
