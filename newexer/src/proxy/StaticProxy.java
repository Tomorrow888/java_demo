package proxy;

/**
 * @author jiajinshuo
 * @create 2020-03-05 9:53
 */
interface ClothFactory{
    void produce();
}
//代理类对象
class ClothFactoryProxy implements ClothFactory{

    private Nike nike;
    public ClothFactoryProxy(Nike nike){
        this.nike = nike;
    }


    @Override
    public void produce() {
        System.out.println("工厂做一些准备工作");
        nike.produce();
        System.out.println("工厂做一些善后工作");
    }
}
//被代理类对象
class Nike implements ClothFactory{

    @Override
    public void produce() {
        System.out.println("nike工厂生产一匹aj13");
    }
}
public class StaticProxy {
    public static void main(String[] args) {
        Nike nike = new Nike();
        ClothFactoryProxy cp = new ClothFactoryProxy(nike);
        cp.produce();
    }
}
