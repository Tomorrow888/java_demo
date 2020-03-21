package com.keyword.proxy;


/**
 * @author jiajinshuo
 * @create 2020-01-02 16:14
 */
public class NetWorkTest {
    public static void main(String[] args) {
        server server = new server();
        proxyServer proxyServer = new proxyServer(server);//因为NetWork为抽象类，不能直接new所以要new server

        proxyServer.browse();
    }
}
interface NetWork{

    public void browse();

}
//被代理类对象
class server implements NetWork{
    @Override
    public void browse() {
        System.out.println("真实的服务器浏览");
    }
}
//代理类
class proxyServer implements NetWork{

    private NetWork netWork;
    public proxyServer(NetWork netWork){
        this.netWork = netWork;
    }

    public void check(){
        System.out.println("联网之前的检查工作");
    }
    @Override
    public void browse() {
        check();
        netWork.browse();
    }
}