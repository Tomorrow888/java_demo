package alwayscla.string;

/**
 * @author jiajinshuo
 * @create 2020-01-07 13:02
 */
public class StringDebug {
    public static void main(String[] args) {

        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//4
        System.out.println(sb);//null
        StringBuffer sb1 = new StringBuffer(str);
        System.out.println(sb1);//NullPointerExpertion
    }
}
