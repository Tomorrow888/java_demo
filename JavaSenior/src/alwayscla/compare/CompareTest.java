package alwayscla.compare;

import java.util.Arrays;

/**
 * @author jiajinshuo
 * @create 2020-01-07 15:54
 */
public class CompareTest {
    public static void main(String[] args) {

        Goods[] goods = new Goods[5];

        goods[0] = new Goods("西瓜",12);
        goods[1] = new Goods("香蕉",23);
        goods[2] = new Goods("梨",25);
        goods[3] = new Goods("枣",24);
        goods[4] = new Goods("杏",29);

        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));

    }

}
