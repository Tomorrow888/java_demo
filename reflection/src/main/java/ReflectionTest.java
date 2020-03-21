import org.junit.Test;
import reflection.Person;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @author jiajinshuo
 * @create 2019-12-18 16:04
 */
public class ReflectionTest {

    @Test
    public void test1(){
        //没有反射之前，私有的方法和属性不能调用
        Person p1 = new Person(18,"tom");
        p1.age = 10;
        System.out.println(p1.toString());
        p1.show();
    }

    @Test
    public void test2() throws Exception{
        //有了反射之后
       Class  clazz =  Person.class;
        Constructor constructor = clazz.getDeclaredConstructor(Integer.class, String.class);
        //构造器造对象
        Object tom = constructor.newInstance(18, "tom");
        System.out.println(tom.toString());

        //通过反射调用person类的私有结构器
        Constructor cons1 = clazz.getDeclaredConstructor(String.class);
        cons1.setAccessible(true);
        Person p1 = (Person)cons1.newInstance("jerry");
        System.out.println(p1);
        //调用私有属性name
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(p1,"zhoujielun");
        System.out.println(p1);

        //调用私有的方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class);
        showNation.setAccessible(true);
        String nation =   (String)showNation.invoke(p1,"中国");
        System.out.println(nation);


    }

    @Test
    public void test3() throws ClassNotFoundException {
        //获取Class的实例的方式
        //方式一：调用运行时的属性.class
        Class  clazz1 = Person.class;
        System.out.println(clazz1);
        //2，通过运行时的对象，调用getClass()方法
        Person p1 = new Person();
        Class clazz2 =  p1.getClass();
        System.out.println(clazz2);
        //3,调用Class的静态方法
        Class clazz3 =  Class.forName("reflection.Person");
        System.out.println(clazz3);
        //4,使用类的加载器
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        Class clazz4 = classLoader.loadClass("reflection.Person");
        System.out.println(clazz4);


    }
    //properties:用来读取配置文件
    @Test
    public void test4() throws IOException {

        Properties pros = new Properties();
        //读取配置文件方式一
       // FileInputStream fis = new FileInputStream("jdbc.properties");
       // pros.load(fis);
        //读取配置文件方式二
        ClassLoader classLoader = ReflectionTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("jdbc.properties");
        pros.load(is);
        String user = pros.getProperty("user");
        String password = pros.getProperty("password");
        System.out.println("user = "+user+"    password = "+password);


    }

}
