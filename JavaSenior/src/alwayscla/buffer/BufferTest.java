package alwayscla.buffer;

/**
 * @author jiajinshuo
 * @create 2020-01-05 17:02
 */
public class BufferTest {
    public static void main(String[] args) {

        StringBuffer s1 = new StringBuffer("abc");
        s1.append(1);
        StringBuffer s2 = s1.append(2);
        System.out.println(s2);//abc12
        System.out.println(s1);//自己改变了  abc12
        s1.delete(2,3);
        System.out.println(s1);
    }
}
