package jiajinshuo;

/**
 * @author jiajinshuo
 * @create 2020-03-04 21:38
 */
interface Star{
    void sing();
    void party();
    void makeMOney();
}
//被代理类
class RealStar implements  Star{

    @Override
    public void sing() {
        System.out.println("明星唱歌");
    }

    @Override
    public void party() {
        System.out.println("明星开演唱会");

    }

    @Override
    public void makeMOney() {
        System.out.println("明星赚钱");
    }
}
//代理类
class SongProsy implements Star{
    private RealStar rs ;
    public SongProsy(RealStar rs){
        this.rs = rs;
    }
    public void beign(){
        System.out.println("经纪人做一些准备工作");
    }
    public void last(){
        System.out.println("经纪人做一些善后工作");
    }

    @Override
    public void sing() {

    }

    @Override
    public void party() {

    }

    @Override
    public void makeMOney() {
        rs.makeMOney();
    }
}
public class StaticProxy {
    public static void main(String[] args) {
        //被代理类对象
        RealStar rs = new RealStar();
        SongProsy sp = new SongProsy(rs);
        sp.beign();
        sp.makeMOney();
        sp.last();
    }
}
