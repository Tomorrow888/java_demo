package alwayscla.stringmethod;

/**
 * @author jiajinshuo
 * @create 2020-01-05 11:26
 * char charAt(int index)： 返回某索引处的字符return value[index]
 */
public class StringMethodTest {
    public static void main(String[] args) {

        String s1 = "helloworld";
        String s3 = "HelloWorld";

        char c = s1.charAt(1);
        System.out.println(c);

        System.out.println(s1.isEmpty());

        String s2 = s1.toUpperCase();
        System.out.println(s2);

        System.out.println(s1.equalsIgnoreCase(s3));//比较，忽略大小写

        String s4 = "abc";
        String s5 = "abe";
        System.out.println(s4.compareTo(s5));//比较两个字符串的大小

        String s6 = "齐鲁工业大学";
        String s7 = s6.substring(2, 6);//截取字符串，左闭右开
        System.out.println(s7);

        String s8 = "wo";
        System.out.println(s1.contains(s8));

        System.out.println(s1.indexOf("w"));//返回指定字符串第一次出现的索引，没有则返回-1
        System.out.println(s1.indexOf("d",2));

        System.out.println(s1.replace("ll","mm"));

        String s9 = "hello,world,ni,ma";
        String[] split = s9.split(",");//切片
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);

        }


    }
}
