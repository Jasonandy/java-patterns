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

/**
* @Package：cn.ucaner.pattern.structure.proxy.staticProxy   
* @ClassName：RealSuject   
* @Description：   <p> 代理模式真实类</p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午1:47:02   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class RealSuject implements Subject {
	
    @Override
    public void request() {
        System.out.println("*** static proxy do request ！By Jason ***");
    }
}
