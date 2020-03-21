package alwayscla.compare;

/**
 * @author jiajinshuo
 * @create 2020-01-07 15:59
 */
public class Goods implements Comparable{

    private String name;
    private double price;

    public Goods() {
    }

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    //指明商品比较大小的方式：按照价格，从低到高排序
    @Override
    public int compareTo(Object o) {

        if(o instanceof Goods){
            Goods goods = (Goods)o;
            //方式一
            if(this.price > goods.price){
                return 1;
            }else if(this.price < goods .price){
                return -1;
            }else{
                //如果价格相等，再按照名称排序
                return this.name.compareTo(goods.name);
            }
            //方式二
            //return Double.compare(this.price,goods.price);
        }
        throw  new RuntimeException("类型不一致");//是throw不是return
    }
}
