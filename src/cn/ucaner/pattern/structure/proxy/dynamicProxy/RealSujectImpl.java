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

/**
* @Package：cn.ucaner.pattern.structure.proxy.dynamicProxy   
* @ClassName：RealSujectImpl   
* @Description：   <p> 代理模式 -  动态代理真实类 </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:09:51   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class RealSujectImpl implements Subject {

    @Override
    public void request() {
        System.out.println("*** dynamicProxy  do request ***");
    }

}
