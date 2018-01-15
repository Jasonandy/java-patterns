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
package cn.ucaner.pattern.structure.bridge.abs;

/**
* @Package：cn.ucaner.pattern.structure.bridge.abs   
* @ClassName：Implementor   
* @Description：   <p> 桥接模式 --- 实现化角色 </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:58:48   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public interface Implementor {
	
    public void doSomethingA();
    
    public void doSomethingB();
}
