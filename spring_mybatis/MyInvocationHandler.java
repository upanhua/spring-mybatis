package spring_mybatis;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lh
 * @version 1.0
 * @date 2019-09-27 11:58
 */
public class MyInvocationHandler implements InvocationHandler {

    public Object object;

    public Object getObject() {
        return object;
    }
    public MyInvocationHandler(){

    }

    public MyInvocationHandler(Object object){
        this.object = object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始代理方法");
        // return method.invoke(object,args);
        return null;
    }
}
