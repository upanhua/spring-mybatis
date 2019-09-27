package spring_mybatis;

import org.springframework.beans.factory.FactoryBean;
import spring_mybatis.dao.TestDao;
import spring_mybatis.dao.impl.UserDaoImpl;

import java.lang.reflect.Proxy;

/**
 * @author lh
 * @version 1.0
 * @date 2019-09-27 11:17
 */
public class MyFactoryBean implements FactoryBean {


    Class aClass;

    public Class getaClass() {
        return aClass;
    }

    public void setaClass(Class aClass) {
        this.aClass = aClass;
    }

    public MyFactoryBean(){
    }

    public MyFactoryBean(Class aClass){
        this.aClass = aClass;
    }
    /**
     * 这个方法很重要，是产生代理类的重要手段
     * @return
     * @throws Exception
     */
    @Override
    public Object getObject() throws Exception {
        Class<?>[] interfaces = new Class[]{aClass};
        Object dao = Proxy.newProxyInstance(MyFactoryBean.class.getClassLoader(), interfaces, new MyInvocationHandler());
        return dao;
    }


    @Override
    public Class<?> getObjectType() {
        return UserDaoImpl.class;
    }


    @Override
    public boolean isSingleton() {
        return false;
    }
}
