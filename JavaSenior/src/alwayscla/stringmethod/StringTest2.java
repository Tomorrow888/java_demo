package alwayscla.stringmethod;


import java.util.Arrays;

/**
 * @author jiajinshuo
 * @create 2020-01-05 14:17
 */
public class StringTest2 {
    public static void main(String[] args) {

        //String与byte[]的转换 ,编码
        String str1 = "abc123";
        byte[] bytes = str1.getBytes();
        System.out.println(Arrays.toString(bytes));
        //解码
        String str2 = new String(bytes);
        System.out.println(str2);

    }
}
