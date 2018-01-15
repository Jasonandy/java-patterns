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
package cn.ucaner.pattern.structure.bridge;

import cn.ucaner.pattern.structure.bridge.abs.Implementor;

/**
*    
* @Package：cn.ucaner.pattern.structure.bridge   
* @ClassName：BridgeMain   
* @Description：   <p> 桥接模式  -- 执行类</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:59:16   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class BridgeMain {


    public static void main(String[] args) {
        //实现化角色
        Implementor implementor=new ConcreteImplementor();
        //抽象化角色
        RefinedAbstraction refinedAbstraction=new RefinedAbstraction(implementor);
        //抽象化角色搞事情
        refinedAbstraction.doSomethings();
    }
}
