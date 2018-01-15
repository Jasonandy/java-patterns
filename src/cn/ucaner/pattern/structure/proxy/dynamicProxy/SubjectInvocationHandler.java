/**
 * <html>
 * <body>
 *  <P> Copyright 1994 JsonInternational</p>
 *  <p> All rights reserved.</p>
 *  <p> Created on 19941115</p>
 *  <p> Created by Jason</p>
 *  </body>
 * </html>
 */
package cn.ucaner.pattern.structure.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
* @Package：cn.ucaner.pattern.structure.proxy.dynamicProxy   
* @ClassName：SubjectInvocationHandler   
* @Description：   <p> 动态代理模式 --
*  利用java.lang.reflect.Proxy类和java.lang.reflect.InvocationHandler接口定义代理类的实现
* </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:04:37   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class SubjectInvocationHandler implements InvocationHandler {

	/**
	 * 目标对象 
	 */
    private Object target;

    
    public SubjectInvocationHandler(Object target) {
        this.target = target;
    }

    /**
     * 描述: 实现调用  
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("----Dynamic Proxy invoke method Start  ----");
        Object result = method.invoke(target, args);//方法调用 
        System.out.println("----Dynamic Proxy invoke method End by Jason----");
        return result;
    }

    public Object getProxy() {
        
    	//获取当前线程的 classloder 
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        
        //获取所有的interface 
        Class<?>[] interfaces = target.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, interfaces, this);
    }
}
