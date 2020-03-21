package com.keyword.interfacetest;

/**
 * @author jiajinshuo
 * @create 2020-01-02 17:25
 * 定义一个ComparableCircle类，继承Circle类并且实现CompareObject接口。在
 * ComparableCircle类中给出接口中方法compareTo的实现体，用来比较两个圆的半
 * 径大小。
 */
public class ComparableCircle extends Circle implements CompareObject{

    public ComparableCircle(double radius){
        super(radius);
    }
    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if(o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle)o;
//            if(this.getRedius() > c.getRedius()){
//                return 1;
//            }else if(this.getRedius() < c.getRedius()){
//                return -1;
//            }else {
//                return 0;
//            }
                //当radius声明为Double时可以调用包装类的方法
            return this.getRedius().compareTo(c.getRedius());
        }else{
            //return 0;
            throw new RuntimeException("输入的数据类型不匹配");
        }
    }
}
