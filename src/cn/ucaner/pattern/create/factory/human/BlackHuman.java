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
package cn.ucaner.pattern.create.factory.human;

import cn.ucaner.pattern.create.factory.Human;

/**
* @Package：cn.ucaner.pattern.create.factory.human   
* @ClassName：BlackHuman   
* @Description：   <p> 工厂模式   -- 黑人 </p>
* @Author： - DaoDou 
* @CreatTime：2017年10月26日 下午5:48:45   
* @Modify By：   
* @ModifyTime：  
* @Modify marker：   
* @version    V1.0
 */
public class BlackHuman implements Human {
	
    @Override
    public void getColor() {
        System.out.println("黑色人种");
    }
}
