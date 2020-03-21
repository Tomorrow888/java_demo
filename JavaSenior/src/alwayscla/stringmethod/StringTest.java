package alwayscla.stringmethod;

/**
 * @author jiajinshuo
 * @create 2020-01-05 13:00
 */
public class StringTest {
    public static void main(String[] args) {

        String str = "123";
        int i = Integer.parseInt(str);//字符串转化为基本数据类型
        System.out.println(i+1);//124

        String s = String.valueOf(i);//基本数据类型转化为String类型


        String str1 = "123,456,789";
        //string类型的数组转化为int类型的数组
        String[] split = str1.split(",");
        int[] arr = new int[split.length];
        for (int j = 0; j < split.length; j++) {

            arr[j]= Integer.parseInt(split[j]);
        }

        System.out.println(arr[0]+1);
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);

        }
        //String与char[]的转化
        String str2 = "abc132";
        char[] chars = str2.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            System.out.println(chars[j]);

        }
        char[] chars1 = new char[]{'h','e','l','l','o'};
        String s1 = new String(chars1);
        System.out.println(s1);

    }
}
