import com.laniuh.service.HelloApi;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by linjian on 16/7/29.
 */
public class HelloTest {

    @Autowired

    private ApplicationContext context;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    @Test
    public void test() {
        HelloApi hello = context.getBean("hello", HelloApi.class);
        hello.sayHello();
    }
}
