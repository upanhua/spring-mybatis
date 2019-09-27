package spring_mybatis;

import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author lh
 * @version 1.0
 * @date 2019-09-27 11:27
 */
public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {

    /**
     * 注入程序员自己的对象到spring管理的bean中
     * @param annotationMetadata
     * @param beanDefinitionRegistry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata annotationMetadata, BeanDefinitionRegistry beanDefinitionRegistry) {
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(MyFactoryBean.class);
        AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
        beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("spring_mybatis.dao.UserDao");
        beanDefinitionRegistry.registerBeanDefinition("myFactoryBean", beanDefinition);

    }
}
