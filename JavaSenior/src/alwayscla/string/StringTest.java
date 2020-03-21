package alwayscla.string;

/**
 * @author jiajinshuo
 * @create 2020-01-04 20:00
 */
public class StringTest {
    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";
        System.out.println(s1 == s2);//true

        s1 = "hello";
        System.out.println(s1);//hello
        System.out.println(s2);//abc

        String s4 = "abc";
        String s5 = s4.replace("a", "m");
        System.out.println(s4);//abc 仍然没有改变
        System.out.println(s5);//mbc
    }
    
}
