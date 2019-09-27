package spring_mybatis;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring_mybatis.config.MyConfig;

/**
 * @author lh
 * @version 1.0
 * @date 2019-09-27 10:11
 */
public class AppTest {
    public static void main(String[] args) {
        // 按照AnnotationConfigApplicationContext方式启动
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);
        // TestDaoImpl bean = (TestDaoImpl)annotationConfigApplicationContext.getBean("userDaoImpl");
        // 如果获取的是UserDaoImpl，那么不会报错，因为在MyBeanDefinition修改了beanclass
        // Object bean = annotationConfigApplicationContext.getBean(UserDaoImpl.class);
        // Object bean = annotationConfigApplicationContext.getBean("&myFactoryBean");  //运行的结果为spring_mybatis.MyFactoryBean@68e965f
        Object bean = annotationConfigApplicationContext.getBean("myFactoryBean"); // 运行的结果spring_mybatis.dao.impl.UserDaoImpl@68e965f5
        System.out.println("bean=" + bean);
    }
}
