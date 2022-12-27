import com.Icy.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在spring中管理，要使用，直接取出来就可以！
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());

    }
}
