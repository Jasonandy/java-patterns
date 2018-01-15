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
package cn.ucaner.pattern.structure.proxy.staticProxy;

import cn.ucaner.pattern.structure.decorator.decoratorAbs.Decorator;

/**
* @Package：cn.ucaner.pattern.structure.proxy.staticProxy   
* @ClassName：Proxy   
* @Description：   <p> 代理模式 代理模式代理类,他和装饰器模式的实现有点相近{@link Decorator}</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午1:47:45   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class Proxy implements Subject {
	
    private Subject realSuject;

    public Proxy(Subject realSuject) {
        this.realSuject = realSuject;
    }

    @Override
    public void request() {
        if(realSuject!=null){
            realSuject.request();
        }
    }
}
