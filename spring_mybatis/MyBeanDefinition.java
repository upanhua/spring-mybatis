package spring_mybatis;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import spring_mybatis.dao.impl.UserDaoImpl;

/**
 * @author lh
 * @version 1.0
 * @date 2019-09-27 10:46
 */

public class MyBeanDefinition implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        GenericBeanDefinition testDaoImpl = (GenericBeanDefinition) beanFactory.getBeanDefinition("testDaoImpl");
        // testDaoImpl.setBeanClassName(UserDaoImpl.class.getName());
        testDaoImpl.setBeanClass(UserDaoImpl.class);
    }
}
