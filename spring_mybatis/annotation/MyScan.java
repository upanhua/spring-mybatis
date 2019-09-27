package spring_mybatis.annotation;

import org.springframework.context.annotation.Import;
import spring_mybatis.MyImportBeanDefinitionRegister;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author lh
 * @version 1.0
 * @date 2019-09-27 14:33
 */
@Retention(RetentionPolicy.RUNTIME)
@Import(value = MyImportBeanDefinitionRegister.class)
public @interface MyScan {
}
