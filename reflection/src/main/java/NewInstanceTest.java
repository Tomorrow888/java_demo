import org.junit.Test;

/**
 * @author jiajinshuo
 * @create 2019-12-18 21:22
 */
//通过反射创建运行时类的对象
public class NewInstanceTest {

    @Test
    public void test1() throws IllegalAccessException, InstantiationException {

        Class clazz = reflection.Person.class;
        //实质上是调用person的无参构造器
        reflection.Person p = (reflection.Person)clazz.newInstance();
        System.out.println(p);
    }

}
