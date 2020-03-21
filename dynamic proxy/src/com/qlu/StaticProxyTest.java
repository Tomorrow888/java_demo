package com.qlu;

/**
 * @author jiajinshuo
 * @create 2019-12-19 16:28
 */
//静态代理
    //特点：代理类和被代理类在编译期间就写死了

interface ClothFactory{

    void produceCloth();

}
//代理类
class ProxyClothFactory implements  ClothFactory{

    private ClothFactory clothFactory;


    public ProxyClothFactory(ClothFactory clothFactory) {
        this.clothFactory = clothFactory;
    }

    @Override
    public void produceCloth() {
        System.out.println("代理工厂做准备工作");
        clothFactory.produceCloth();
        System.out.println("代理工厂做收尾工作");
    }
}
//被代理类
 class NikeClothFactory implements ClothFactory {


    @Override
    public void produceCloth() {
        System.out.println("耐克生产一批鞋");
    }
}

public class StaticProxyTest{

    public static void main(String[] args) {
        //需要被代理类对象，通过构造器又得穿一个参数，参数为代理类对象，所以先造代理类对象
        NikeClothFactory nike = new NikeClothFactory();
        //创建代理类对象
        ProxyClothFactory proxyClothFactory = new ProxyClothFactory(nike);
        proxyClothFactory.produceCloth();
    }

}
